package com.blind75.portal.model;

public record Question(
        int id,
        String title,
        String url,
        String difficulty,
        String topicSlug,
        String subtopic,
        String description
) {
}
