export default function TopicList({ topics, onSelectTopic, onShowAll, selectedTopic }) {
  return (
    <nav className="panel">
      <div className="panel-header">
        <h3>Topics</h3>
        <button type="button" onClick={onShowAll} className="link-button">
          View All
        </button>
      </div>
      <ul>
        {topics.map((topic) => (
          <li key={topic.slug}>
            <button
              type="button"
              className={`panel-button${selectedTopic?.slug === topic.slug ? ' active' : ''}`}
              onClick={() => onSelectTopic(topic)}
            >
              <span className="panel-title">{topic.name}</span>
              <span className="panel-subtitle">{topic.subtopics.join(', ')}</span>
            </button>
          </li>
        ))}
      </ul>
    </nav>
  );
}
