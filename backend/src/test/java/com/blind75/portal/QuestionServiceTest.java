package com.blind75.portal;

import com.blind75.portal.model.Question;
import com.blind75.portal.service.QuestionService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class QuestionServiceTest {

    private final QuestionService questionService = new QuestionService();

    @Test
    void returnsQuestionById() {
        assertThat(questionService.getQuestionById(3))
                .isPresent()
                .get()
                .satisfies(question -> assertThat(question.title()).isEqualTo("Two Sum"));
    }

    @Test
    void filtersQuestionsByTopic() {
        List<Question> questions = questionService.getQuestionsByTopic("dynamic-programming");
        assertThat(questions)
                .isNotEmpty()
                .allMatch(question -> question.topicSlug().equals("dynamic-programming"));
    }

    @Test
    void collectsAllSubtopics() {
        List<String> subtopics = questionService.getAllSubtopics();
        assertThat(subtopics)
                .contains("Binary Tree", "Two Pointers", "1D Dynamic Programming");
    }
}
