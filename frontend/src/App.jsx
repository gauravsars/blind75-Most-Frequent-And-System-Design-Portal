import { useEffect, useMemo, useState } from 'react';
import axios from 'axios';
import TopicList from './components/TopicList.jsx';
import QuestionList from './components/QuestionList.jsx';
import QuestionDetails from './components/QuestionDetails.jsx';
import SubtopicFilter from './components/SubtopicFilter.jsx';

const API = '/api';

const initialState = {
  topics: [],
  subtopics: [],
  questions: [],
  selectedTopic: null,
  selectedSubtopic: null,
  selectedQuestion: null,
  loading: false,
  error: ''
};

export default function App() {
  const [state, setState] = useState(initialState);
  const [searchId, setSearchId] = useState('');

  useEffect(() => {
    const loadInitialData = async () => {
      try {
        const [topicsResponse, subtopicsResponse, questionsResponse] = await Promise.all([
          axios.get(`${API}/topics`),
          axios.get(`${API}/subtopics`),
          axios.get(`${API}/questions`)
        ]);
        setState((prev) => ({
          ...prev,
          topics: topicsResponse.data,
          subtopics: subtopicsResponse.data,
          questions: questionsResponse.data
        }));
      } catch (error) {
        setState((prev) => ({
          ...prev,
          error: 'Failed to load initial data. Ensure the Spring Boot API is running.'
        }));
      }
    };

    loadInitialData();
  }, []);

  const questionLookup = useMemo(() => {
    return new Map(state.questions.map((question) => [question.id, question]));
  }, [state.questions]);

  const fetchQuestionsByTopic = async (topic) => {
    setState((prev) => ({ ...prev, loading: true, error: '' }));
    try {
      const response = await axios.get(`${API}/topics/${topic.slug}/questions`);
      setState((prev) => ({
        ...prev,
        questions: response.data,
        selectedTopic: topic,
        selectedSubtopic: null,
        selectedQuestion: null,
        loading: false
      }));
    } catch (error) {
      setState((prev) => ({
        ...prev,
        loading: false,
        error: `Unable to load questions for topic ${topic.name}.`
      }));
    }
  };

  const fetchQuestionsBySubtopic = async (subtopic) => {
    if (!subtopic) {
      await resetToAllQuestions();
      return;
    }

    setState((prev) => ({ ...prev, loading: true, error: '' }));
    try {
      const response = await axios.get(`${API}/questions`, { params: { subtopic } });
      setState((prev) => ({
        ...prev,
        questions: response.data,
        selectedTopic: null,
        selectedSubtopic: subtopic,
        selectedQuestion: null,
        loading: false
      }));
    } catch (error) {
      setState((prev) => ({
        ...prev,
        loading: false,
        error: `Unable to load questions for subtopic ${subtopic}.`
      }));
    }
  };

  const resetToAllQuestions = async () => {
    setState((prev) => ({ ...prev, loading: true, error: '' }));
    try {
      const response = await axios.get(`${API}/questions`);
      setState((prev) => ({
        ...prev,
        questions: response.data,
        selectedTopic: null,
        selectedSubtopic: null,
        selectedQuestion: null,
        loading: false
      }));
    } catch (error) {
      setState((prev) => ({
        ...prev,
        loading: false,
        error: 'Unable to load questions.'
      }));
    }
  };

  const handleSearch = async (event) => {
    event.preventDefault();
    const id = Number.parseInt(searchId, 10);
    if (Number.isNaN(id)) {
      setState((prev) => ({ ...prev, error: 'Please enter a valid numeric question ID.' }));
      return;
    }

    setState((prev) => ({ ...prev, loading: true, error: '' }));
    try {
      const response = await axios.get(`${API}/questions/${id}`);
      setState((prev) => ({
        ...prev,
        selectedQuestion: response.data,
        loading: false
      }));
    } catch (error) {
      setState((prev) => ({
        ...prev,
        loading: false,
        selectedQuestion: null,
        error: `No question found with ID ${id}.`
      }));
    }
  };

  const handleQuestionClick = (question) => {
    setState((prev) => ({ ...prev, selectedQuestion: question }));
    setSearchId(String(question.id));
  };

  const headerSubtitle = state.selectedTopic
    ? `${state.selectedTopic.name} (${state.questions.length})`
    : state.selectedSubtopic
      ? `${state.selectedSubtopic} (${state.questions.length})`
      : `All Questions (${state.questions.length})`;

  return (
    <div className="app-shell">
      <header className="top-bar">
        <div className="brand">
          <span className="brand-icon" role="img" aria-label="Rocket">🚀</span>
          <div className="brand-copy">
            <h1>Blind 75 Portal</h1>
            <p>Practice interview questions by topic, difficulty, and pattern.</p>
          </div>
        </div>
        <TopicList
          topics={state.topics}
          onSelectTopic={fetchQuestionsByTopic}
          onShowAll={resetToAllQuestions}
          selectedTopic={state.selectedTopic}
          selectedSubtopic={state.selectedSubtopic}
        />
      </header>
      <main className="main-content">
        <section className="filters">
          <form className="search" onSubmit={handleSearch}>
            <label htmlFor="searchId">Search by LeetCode ID</label>
            <div className="search-row">
              <input
                id="searchId"
                type="number"
                placeholder="e.g. 42"
                value={searchId}
                onChange={(event) => setSearchId(event.target.value)}
              />
              <button type="submit">Find</button>
            </div>
          </form>
          <SubtopicFilter
            subtopics={state.subtopics}
            selectedSubtopic={state.selectedSubtopic}
            onSelectSubtopic={fetchQuestionsBySubtopic}
          />
        </section>
        <section className="content">
          <header className="content-header">
            <h2>{headerSubtitle}</h2>
            {state.error && <p className="error">{state.error}</p>}
          </header>
          {state.loading ? (
            <div className="loading">Loading questions...</div>
          ) : (
            <div className="content-body">
              <QuestionList
                questions={state.questions}
                selectedQuestionId={state.selectedQuestion?.id}
                onSelectQuestion={handleQuestionClick}
              />
              <QuestionDetails
                question={
                  state.selectedQuestion ??
                  (searchId ? questionLookup.get(Number.parseInt(searchId, 10)) : null)
                }
              />
            </div>
          )}
        </section>
      </main>
    </div>
  );
}
