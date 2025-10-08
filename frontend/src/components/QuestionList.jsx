export default function QuestionList({ questions, selectedQuestionId, onSelectQuestion }) {
  if (!questions.length) {
    return <p className="empty">No questions found for the selected filter.</p>;
  }

  return (
    <section className="question-list">
      <ul>
        {questions.map((question) => (
          <li key={question.id}>
            <button
              type="button"
              className={`question-card${selectedQuestionId === question.id ? ' active' : ''}`}
              onClick={() => onSelectQuestion(question)}
            >
              <span className="question-id">#{question.id}</span>
              <span className="question-title">{question.title}</span>
              <span className="question-meta">
                <span className={`difficulty difficulty-${question.difficulty.toLowerCase()}`}>
                  {question.difficulty}
                </span>
                <span>{question.subtopic}</span>
              </span>
            </button>
          </li>
        ))}
      </ul>
    </section>
  );
}
