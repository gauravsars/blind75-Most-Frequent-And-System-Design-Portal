package com.blind75.portal.controller;

import com.blind75.portal.model.Question;
import com.blind75.portal.model.Topic;
import com.blind75.portal.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/questions")
    public List<Question> getQuestions(@RequestParam(value = "topic", required = false) String topic,
                                       @RequestParam(value = "subtopic", required = false) String subtopic) {
        if (topic != null && !topic.isBlank()) {
            return questionService.getQuestionsByTopic(topic);
        }
        if (subtopic != null && !subtopic.isBlank()) {
            return questionService.getQuestionsBySubtopic(subtopic);
        }
        return questionService.getAllQuestions();
    }

    @GetMapping("/questions/{id}")
    public ResponseEntity<Question> getQuestion(@PathVariable int id) {
        return questionService.getQuestionById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return questionService.getAllTopics();
    }

    @GetMapping("/topics/{slug}")
    public ResponseEntity<Topic> getTopic(@PathVariable String slug) {
        return questionService.getTopic(slug)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/topics/{slug}/questions")
    public List<Question> getQuestionsForTopic(@PathVariable String slug) {
        return questionService.getQuestionsByTopic(slug);
    }

    @GetMapping("/subtopics")
    public List<String> getSubtopics() {
        return questionService.getAllSubtopics();
    }

    @GetMapping("/subtopics/{name}/questions")
    public List<Question> getQuestionsForSubtopic(@PathVariable String name) {
        return questionService.getQuestionsBySubtopic(name);
    }
}
