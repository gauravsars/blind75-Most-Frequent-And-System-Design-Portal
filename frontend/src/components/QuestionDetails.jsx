export default function QuestionDetails({ question }) {
  if (!question) {
    return (
      <section className="question-details">
        <h3>Select a question</h3>
        <p>Choose a question from the list or search by ID to view its details.</p>
      </section>
    );
  }

  return (
    <section className="question-details">
      <h3>
        #{question.id} · {question.title}
      </h3>
      <p className="question-chip-group">
        <span className={`difficulty difficulty-${question.difficulty.toLowerCase()}`}>
          {question.difficulty}
        </span>
        <span className="chip muted">{question.subtopic}</span>
      </p>
      <p className="question-description">{question.description}</p>
      <a className="external-link" href={question.url} target="_blank" rel="noreferrer">
        View on LeetCode
      </a>
    </section>
  );
}
