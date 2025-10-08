# Blind 75 Portal

A full-stack web application that lets you explore the Blind 75 NeetCode question list by topic, subtopic, or question ID. The backend is a Spring Boot REST API, while the frontend is a React/Vite single page application.

## Project structure

```
.
├── backend/   # Spring Boot REST API powered by Maven
└── frontend/  # React + Vite client
```

## Requirements

- Java 17+
- Maven 3.9+
- Node.js 18+
- npm 9+

## Running the backend

```bash
cd backend
mvn spring-boot:run
```

This starts the API on [http://localhost:8080](http://localhost:8080). Key endpoints include:

| Method | Path | Full local URL | Description | Query parameters |
| ------ | ---- | -------------- | ----------- | ---------------- |
| `GET` | `/api/questions` | `http://localhost:8080/api/questions` | Returns every Blind 75 question. Use query parameters to limit the results. | `topic` (optional): topic slug such as `arrays-and-strings`; `subtopic` (optional): human readable subtopic such as `Binary Search` |
| `GET` | `/api/questions/{id}` | `http://localhost:8080/api/questions/{id}` | Fetches a single question by its numeric identifier from the sheet. Replace `{id}` with the desired question ID (e.g., `http://localhost:8080/api/questions/1`). | _None_ |
| `GET` | `/api/topics` | `http://localhost:8080/api/topics` | Lists all available topics with their slugs and display names. | _None_ |
| `GET` | `/api/topics/{slug}/questions` | `http://localhost:8080/api/topics/{slug}/questions` | Returns every question that belongs to the provided topic slug. Example: `http://localhost:8080/api/topics/dynamic-programming/questions`. | _None_ |
| `GET` | `/api/subtopics` | `http://localhost:8080/api/subtopics` | Lists every subtopic across all Blind 75 categories. | _None_ |
| `GET` | `/api/subtopics/{name}/questions` | `http://localhost:8080/api/subtopics/{name}/questions` | Returns questions scoped to a given subtopic name. Replace `{name}` with the exact subtopic string, URL-encoded when necessary (e.g., `http://localhost:8080/api/subtopics/Two%20Pointers/questions`). | _None_ |

Each of these URLs can be pasted directly into Postman while the Spring Boot app is running locally.

## Running the frontend

```bash
cd frontend
npm install
npm run dev
```

By default the Vite dev server runs on [http://localhost:5173](http://localhost:5173) and proxies API calls to the Spring Boot backend.

## Running tests

```bash
cd backend
mvn test
```

## Features

- Browse and filter all Blind 75 questions grouped by topic and subtopic.
- Instant search by question ID with deep links back to the original LeetCode problem.
- Responsive UI themed for dark/light contexts with difficulty highlighting.

## Data source

The question catalog is seeded from the Blind 75 sheet curated by [neetcode.io](https://neetcode.io/).
