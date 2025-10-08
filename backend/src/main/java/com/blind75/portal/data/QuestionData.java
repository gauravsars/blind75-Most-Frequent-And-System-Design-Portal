package com.blind75.portal.data;

import com.blind75.portal.model.Question;

import java.util.List;

public final class QuestionData {

    private static final List<Question> QUESTIONS = List.of(
            new Question(1, "Contains Duplicate", "https://leetcode.com/problems/contains-duplicate/", "Easy", "arrays-and-strings", "Arrays & Hashing", "Check if any value appears at least twice in the array."),
            new Question(2, "Valid Anagram", "https://leetcode.com/problems/valid-anagram/", "Easy", "arrays-and-strings", "Arrays & Hashing", "Determine if t is an anagram of s."),
            new Question(3, "Two Sum", "https://leetcode.com/problems/two-sum/", "Easy", "arrays-and-strings", "Arrays & Hashing", "Return indices of the two numbers that add up to a specific target."),
            new Question(4, "Group Anagrams", "https://leetcode.com/problems/group-anagrams/", "Medium", "hash-map", "Arrays & Hashing", "Group strings that are anagrams of each other."),
            new Question(5, "Top K Frequent Elements", "https://leetcode.com/problems/top-k-frequent-elements/", "Medium", "hash-map", "Arrays & Hashing", "Return the k most frequent elements."),
            new Question(6, "Product of Array Except Self", "https://leetcode.com/problems/product-of-array-except-self/", "Medium", "arrays-and-strings", "Arrays & Hashing", "Return an array answer such that answer[i] is the product of all elements except nums[i]."),
            new Question(7, "Valid Sudoku", "https://leetcode.com/problems/valid-sudoku/", "Medium", "hash-map", "Matrix", "Determine if a 9x9 Sudoku board is valid."),
            new Question(8, "Encode and Decode Strings", "https://leetcode.com/problems/encode-and-decode-strings/", "Medium", "hash-map", "Arrays & Hashing", "Design an algorithm to encode a list of strings to a string and decode back."),
            new Question(9, "Longest Consecutive Sequence", "https://leetcode.com/problems/longest-consecutive-sequence/", "Medium", "hash-map", "Arrays & Hashing", "Find the length of the longest consecutive elements sequence."),
            new Question(10, "Valid Palindrome", "https://leetcode.com/problems/valid-palindrome/", "Easy", "two-pointers", "Two Pointers", "Determine if a string is a palindrome considering only alphanumeric characters."),
            new Question(11, "Two Sum II - Input Array Is Sorted", "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/", "Medium", "two-pointers", "Two Pointers", "Find two numbers in a sorted array that sum to a target."),
            new Question(12, "3Sum", "https://leetcode.com/problems/3sum/", "Medium", "two-pointers", "Two Pointers", "Return all unique triplets in the array which gives the sum of zero."),
            new Question(13, "Container With Most Water", "https://leetcode.com/problems/container-with-most-water/", "Medium", "two-pointers", "Two Pointers", "Find two lines that together with the x-axis form a container to store the most water."),
            new Question(14, "Trapping Rain Water", "https://leetcode.com/problems/trapping-rain-water/", "Hard", "two-pointers", "Two Pointers", "Compute how much water can be trapped after raining."),
            new Question(15, "Best Time to Buy and Sell Stock", "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/", "Easy", "arrays-and-strings", "Sliding Window", "Maximize profit given stock prices where you can complete only one transaction."),
            new Question(16, "Longest Substring Without Repeating Characters", "https://leetcode.com/problems/longest-substring-without-repeating-characters/", "Medium", "arrays-and-strings", "Sliding Window", "Find the length of the longest substring without repeating characters."),
            new Question(17, "Longest Repeating Character Replacement", "https://leetcode.com/problems/longest-repeating-character-replacement/", "Medium", "arrays-and-strings", "Sliding Window", "Find the length of the longest substring after replacing up to k characters."),
            new Question(18, "Permutation in String", "https://leetcode.com/problems/permutation-in-string/", "Medium", "arrays-and-strings", "Sliding Window", "Return true if s2 contains a permutation of s1."),
            new Question(19, "Minimum Window Substring", "https://leetcode.com/problems/minimum-window-substring/", "Hard", "arrays-and-strings", "Sliding Window", "Return the minimum window substring of s that contains all characters of t."),
            new Question(20, "Climbing Stairs", "https://leetcode.com/problems/climbing-stairs/", "Easy", "dynamic-programming", "1D Dynamic Programming", "Count the distinct ways to climb to the top of a staircase with 1 or 2 steps."),
            new Question(21, "Valid Parentheses", "https://leetcode.com/problems/valid-parentheses/", "Easy", "arrays-and-strings", "Stack", "Determine if the input string of brackets is valid."),
            new Question(22, "Min Stack", "https://leetcode.com/problems/min-stack/", "Medium", "arrays-and-strings", "Stack", "Design a stack that supports push, pop, top, and retrieving the minimum element."),
            new Question(23, "Evaluate Reverse Polish Notation", "https://leetcode.com/problems/evaluate-reverse-polish-notation/", "Medium", "arrays-and-strings", "Stack", "Evaluate the value of an arithmetic expression in Reverse Polish Notation."),
            new Question(24, "Generate Parentheses", "https://leetcode.com/problems/generate-parentheses/", "Medium", "arrays-and-strings", "Stack", "Generate all combinations of well-formed parentheses."),
            new Question(25, "Daily Temperatures", "https://leetcode.com/problems/daily-temperatures/", "Medium", "arrays-and-strings", "Stack", "Return the number of days until a warmer temperature for each day."),
            new Question(26, "Car Fleet", "https://leetcode.com/problems/car-fleet/", "Medium", "arrays-and-strings", "Stack", "Return the number of car fleets that will arrive at the destination."),
            new Question(27, "Largest Rectangle in Histogram", "https://leetcode.com/problems/largest-rectangle-in-histogram/", "Hard", "arrays-and-strings", "Stack", "Find the area of the largest rectangle in the histogram."),
            new Question(28, "Binary Search", "https://leetcode.com/problems/binary-search/", "Easy", "arrays-and-strings", "Binary Search", "Search target in a sorted array in O(log n)."),
            new Question(29, "Search a 2D Matrix", "https://leetcode.com/problems/search-a-2d-matrix/", "Medium", "arrays-and-strings", "Binary Search", "Search a target in a 2D matrix."),
            new Question(30, "Koko Eating Bananas", "https://leetcode.com/problems/koko-eating-bananas/", "Medium", "arrays-and-strings", "Binary Search", "Find the minimum eating speed to finish bananas in h hours."),
            new Question(31, "Find Minimum in Rotated Sorted Array", "https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/", "Medium", "arrays-and-strings", "Binary Search", "Find the minimum element in a rotated sorted array."),
            new Question(32, "Search in Rotated Sorted Array", "https://leetcode.com/problems/search-in-rotated-sorted-array/", "Medium", "arrays-and-strings", "Binary Search", "Search target in a rotated sorted array."),
            new Question(33, "Time Based Key-Value Store", "https://leetcode.com/problems/time-based-key-value-store/", "Medium", "hash-map", "Design", "Design a time-based key-value data structure."),
            new Question(34, "Median of Two Sorted Arrays", "https://leetcode.com/problems/median-of-two-sorted-arrays/", "Hard", "arrays-and-strings", "Binary Search", "Find the median of the two sorted arrays."),
            new Question(35, "Reverse Linked List", "https://leetcode.com/problems/reverse-linked-list/", "Easy", "linked-list", "Linked List", "Reverse a singly linked list."),
            new Question(36, "Merge Two Sorted Lists", "https://leetcode.com/problems/merge-two-sorted-lists/", "Easy", "linked-list", "Linked List", "Merge two sorted linked lists."),
            new Question(37, "Reorder List", "https://leetcode.com/problems/reorder-list/", "Medium", "linked-list", "Linked List", "Reorder a linked list in a specific pattern."),
            new Question(38, "Remove Nth Node From End of List", "https://leetcode.com/problems/remove-nth-node-from-end-of-list/", "Medium", "linked-list", "Linked List", "Remove the nth node from the end of a linked list."),
            new Question(39, "Copy List with Random Pointer", "https://leetcode.com/problems/copy-list-with-random-pointer/", "Medium", "linked-list", "Linked List", "Deep copy a linked list with random pointers."),
            new Question(40, "Add Two Numbers", "https://leetcode.com/problems/add-two-numbers/", "Medium", "linked-list", "Linked List", "Add two numbers represented by linked lists."),
            new Question(41, "Linked List Cycle", "https://leetcode.com/problems/linked-list-cycle/", "Easy", "linked-list", "Linked List", "Determine if a linked list has a cycle."),
            new Question(42, "Find the Duplicate Number", "https://leetcode.com/problems/find-the-duplicate-number/", "Medium", "linked-list", "Linked List", "Find the duplicate number in an array using Floyd's algorithm."),
            new Question(43, "Binary Tree Level Order Traversal", "https://leetcode.com/problems/binary-tree-level-order-traversal/", "Medium", "trees", "Binary Tree", "Return the level order traversal of a binary tree."),
            new Question(44, "Binary Tree Right Side View", "https://leetcode.com/problems/binary-tree-right-side-view/", "Medium", "trees", "Binary Tree", "Return the right side view of a binary tree."),
            new Question(45, "Maximum Depth of Binary Tree", "https://leetcode.com/problems/maximum-depth-of-binary-tree/", "Easy", "trees", "Binary Tree", "Return the maximum depth of a binary tree."),
            new Question(46, "Diameter of Binary Tree", "https://leetcode.com/problems/diameter-of-binary-tree/", "Easy", "trees", "Binary Tree", "Return the length of the diameter of a binary tree."),
            new Question(47, "Balanced Binary Tree", "https://leetcode.com/problems/balanced-binary-tree/", "Easy", "trees", "Binary Tree", "Determine if a binary tree is height-balanced."),
            new Question(48, "Same Tree", "https://leetcode.com/problems/same-tree/", "Easy", "trees", "Binary Tree", "Determine if two binary trees are identical."),
            new Question(49, "Subtree of Another Tree", "https://leetcode.com/problems/subtree-of-another-tree/", "Easy", "trees", "Binary Tree", "Check if tree t is a subtree of s."),
            new Question(50, "Lowest Common Ancestor of a Binary Search Tree", "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/", "Easy", "trees", "Binary Tree", "Find the LCA of two nodes in a BST."),
            new Question(51, "Construct Binary Tree from Preorder and Inorder Traversal", "https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/", "Medium", "trees", "Binary Tree", "Construct a binary tree from preorder and inorder traversal."),
            new Question(52, "Implement Trie (Prefix Tree)", "https://leetcode.com/problems/implement-trie-prefix-tree/", "Medium", "tries", "Trie", "Implement the Trie data structure."),
            new Question(53, "Design Add and Search Words Data Structure", "https://leetcode.com/problems/design-add-and-search-words-data-structure/", "Medium", "tries", "Trie", "Design a data structure that supports adding and searching words with dot '.' wildcard."),
            new Question(54, "Word Search II", "https://leetcode.com/problems/word-search-ii/", "Hard", "tries", "Trie", "Find all words in a board using a trie and DFS."),
            new Question(55, "Design Search Autocomplete System", "https://leetcode.com/problems/design-search-autocomplete-system/", "Hard", "tries", "Trie", "Design an autocomplete system using a trie."),
            new Question(56, "Kth Largest Element in a Stream", "https://leetcode.com/problems/kth-largest-element-in-a-stream/", "Easy", "heap", "Priority Queue", "Design a class to find the kth largest element in a stream."),
            new Question(57, "Last Stone Weight", "https://leetcode.com/problems/last-stone-weight/", "Easy", "heap", "Priority Queue", "Simulate smashing stones using a max heap."),
            new Question(58, "K Closest Points to Origin", "https://leetcode.com/problems/k-closest-points-to-origin/", "Medium", "heap", "Priority Queue", "Find the k closest points to the origin."),
            new Question(59, "Task Scheduler", "https://leetcode.com/problems/task-scheduler/", "Medium", "heap", "Priority Queue", "Given tasks with cooling interval, find the least interval needed to finish all tasks."),
            new Question(60, "Find Median from Data Stream", "https://leetcode.com/problems/find-median-from-data-stream/", "Hard", "heap", "Priority Queue", "Design a data structure that supports median finding from a data stream."),
            new Question(61, "Merge K Sorted Lists", "https://leetcode.com/problems/merge-k-sorted-lists/", "Hard", "heap", "Priority Queue", "Merge k sorted linked lists and return as one sorted list."),
            new Question(62, "Subsets", "https://leetcode.com/problems/subsets/", "Medium", "dynamic-programming", "Backtracking", "Return all possible subsets of a set of numbers."),
            new Question(63, "Combination Sum", "https://leetcode.com/problems/combination-sum/", "Medium", "dynamic-programming", "Backtracking", "Find combinations that sum to target with unlimited candidates."),
            new Question(64, "Permutations", "https://leetcode.com/problems/permutations/", "Medium", "dynamic-programming", "Backtracking", "Return all possible permutations of an array."),
            new Question(65, "Subsets II", "https://leetcode.com/problems/subsets-ii/", "Medium", "dynamic-programming", "Backtracking", "Return all possible subsets without duplicates."),
            new Question(66, "Word Search", "https://leetcode.com/problems/word-search/", "Medium", "dynamic-programming", "Backtracking", "Check if a word exists in the grid using DFS."),
            new Question(67, "Palindrome Partitioning", "https://leetcode.com/problems/palindrome-partitioning/", "Medium", "dynamic-programming", "Backtracking", "Partition a string into all palindromic substrings."),
            new Question(68, "Clone Graph", "https://leetcode.com/problems/clone-graph/", "Medium", "graphs", "Graph", "Return a deep copy of the graph."),
            new Question(69, "Course Schedule", "https://leetcode.com/problems/course-schedule/", "Medium", "graphs", "Graph", "Determine if you can finish all courses given prerequisites."),
            new Question(70, "Pacific Atlantic Water Flow", "https://leetcode.com/problems/pacific-atlantic-water-flow/", "Medium", "graphs", "Graph", "Find cells where water can flow to both Pacific and Atlantic oceans."),
            new Question(71, "Number of Islands", "https://leetcode.com/problems/number-of-islands/", "Medium", "graphs", "Graph", "Count the number of islands in a grid."),
            new Question(72, "Graph Valid Tree", "https://leetcode.com/problems/graph-valid-tree/", "Medium", "graphs", "Graph", "Determine if an undirected graph is a valid tree."),
            new Question(73, "Word Ladder", "https://leetcode.com/problems/word-ladder/", "Hard", "graphs", "Graph", "Return the length of the shortest transformation sequence."),
            new Question(74, "House Robber", "https://leetcode.com/problems/house-robber/", "Medium", "dynamic-programming", "1D Dynamic Programming", "Maximize the amount robbed without alerting the police."),
            new Question(75, "Coin Change", "https://leetcode.com/problems/coin-change/", "Medium", "dynamic-programming", "1D Dynamic Programming", "Return the fewest number of coins needed to make up a given amount.")
    );

    private QuestionData() {
    }

    public static List<Question> all() {
        return QUESTIONS;
    }
}
