export default function SubtopicFilter({ subtopics, selectedSubtopic, onSelectSubtopic }) {
  if (!subtopics.length) {
    return null;
  }

  return (
    <section className="panel">
      <div className="panel-header">
        <h3>Subtopics</h3>
      </div>
      <div className="chip-group">
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
