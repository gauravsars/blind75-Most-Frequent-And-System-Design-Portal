export default function TopicList({
  topics,
  onSelectTopic,
  onShowAll,
  selectedTopic,
  selectedSubtopic
}) {
  const isAllActive = !selectedTopic && !selectedSubtopic;

  return (
    <nav className="topic-nav" aria-label="Topics">
      <button
        type="button"
        className={`topic-pill${isAllActive ? ' active' : ''}`}
        onClick={onShowAll}
      >
        All Topics
      </button>
      {topics.map((topic) => (
        <button
          key={topic.slug}
          type="button"
          className={`topic-pill${selectedTopic?.slug === topic.slug ? ' active' : ''}`}
          onClick={() => onSelectTopic(topic)}
        >
          {topic.name}
        </button>
      ))}
    </nav>
  );
}
