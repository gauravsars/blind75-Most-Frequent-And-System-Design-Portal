export default function SubtopicFilter({ subtopics, selectedSubtopic, onSelectSubtopic }) {
  if (!subtopics.length) {
    return null;
  }

  return (
    <section className="subtopic-filter" aria-label="Subtopics">
      <h3>Patterns</h3>
      <div className="chip-group">
        <button
          type="button"
          className={`chip muted${selectedSubtopic ? '' : ' active'}`}
          onClick={() => onSelectSubtopic('')}
        >
          All Patterns
        </button>
        {subtopics.map((subtopic) => (
          <button
            key={subtopic}
            type="button"
            className={`chip${selectedSubtopic === subtopic ? ' active' : ''}`}
            onClick={() => onSelectSubtopic(subtopic)}
          >
            {subtopic}
          </button>
        ))}
      </div>
    </section>
  );
}
