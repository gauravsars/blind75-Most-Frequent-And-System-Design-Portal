package com.blind75.portal.data;

import com.blind75.portal.model.Topic;

import java.util.List;

public final class TopicData {

    private static final List<Topic> TOPICS = List.of(
            new Topic(
                    "arrays-and-strings",
                    "Arrays and Strings",
                    "Array and string manipulation patterns including hashing and sliding window.",
                    List.of("Arrays & Hashing", "Sliding Window", "Stack", "Binary Search")
            ),
            new Topic(
                    "hash-map",
                    "Hash Map",
                    "Hash map and hashing heavy problems that often rely on frequency counting and caching.",
                    List.of("Arrays & Hashing", "Matrix", "Design")
            ),
            new Topic(
                    "two-pointers",
                    "Two Pointers",
                    "Two-pointer strategies over arrays and strings.",
                    List.of("Two Pointers")
            ),
            new Topic(
                    "dynamic-programming",
                    "Dynamic Programming",
                    "Dynamic programming and backtracking style problems from Blind 75.",
                    List.of("1D Dynamic Programming", "Backtracking")
            ),
            new Topic(
                    "linked-list",
                    "Linked List",
                    "Classic linked list operations and pointer manipulation.",
                    List.of("Linked List")
            ),
            new Topic(
                    "trees",
                    "Trees",
                    "Binary tree traversal and construction problems.",
                    List.of("Binary Tree")
            ),
            new Topic(
                    "tries",
                    "Tries",
                    "Prefix trees and string search design problems.",
                    List.of("Trie")
            ),
            new Topic(
                    "heap",
                    "Heap / Priority Queue",
                    "Priority queue based scheduling and selection problems.",
                    List.of("Priority Queue")
            ),
            new Topic(
                    "graphs",
                    "Graphs",
                    "Graph traversal, BFS/DFS, and topological sort problems.",
                    List.of("Graph")
            )
    );

    private TopicData() {
    }

    public static List<Topic> all() {
        return TOPICS;
    }
}
