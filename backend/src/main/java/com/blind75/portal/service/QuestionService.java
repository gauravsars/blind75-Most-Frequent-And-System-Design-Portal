package com.blind75.portal.service;

import com.blind75.portal.data.QuestionData;
import com.blind75.portal.data.TopicData;
import com.blind75.portal.model.Question;
import com.blind75.portal.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    private final Map<Integer, Question> questionById;
    private final Map<String, List<Question>> questionsByTopic;
    private final Map<String, Topic> topicsBySlug;

    public QuestionService() {
        this.questionById = QuestionData.all().stream()
                .collect(Collectors.toUnmodifiableMap(Question::id, q -> q));
        this.questionsByTopic = QuestionData.all().stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(q -> q.topicSlug().toLowerCase(Locale.ROOT)),
                        map -> map.entrySet().stream()
                                .collect(Collectors.toUnmodifiableMap(
                                        Map.Entry::getKey,
                                        entry -> entry.getValue().stream()
                                                .sorted(Comparator.comparingInt(Question::id))
                                                .toList()
                                ))
                ));
        this.topicsBySlug = TopicData.all().stream()
                .collect(Collectors.toUnmodifiableMap(Topic::slug, topic -> topic));
    }

    public List<Question> getAllQuestions() {
        return QuestionData.all();
    }

    public Optional<Question> getQuestionById(int id) {
        return Optional.ofNullable(questionById.get(id));
    }

    public List<Question> getQuestionsByTopic(String topicSlug) {
        return questionsByTopic.getOrDefault(topicSlug.toLowerCase(Locale.ROOT), List.of());
    }

    public List<Question> getQuestionsBySubtopic(String subtopic) {
        return QuestionData.all().stream()
                .filter(question -> question.subtopic().equalsIgnoreCase(subtopic))
                .sorted(Comparator.comparingInt(Question::id))
                .toList();
    }

    public List<Topic> getAllTopics() {
        return TopicData.all();
    }

    public List<String> getAllSubtopics() {
        return QuestionData.all().stream()
                .map(Question::subtopic)
                .distinct()
                .sorted()
                .toList();
    }

    public Optional<Topic> getTopic(String topicSlug) {
        return Optional.ofNullable(topicsBySlug.get(topicSlug));
    }
}
