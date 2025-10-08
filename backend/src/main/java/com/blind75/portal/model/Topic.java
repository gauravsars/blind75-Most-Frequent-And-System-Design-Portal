package com.blind75.portal.model;

import java.util.List;

public record Topic(
        String slug,
        String name,
        String description,
        List<String> subtopics
) {
}
