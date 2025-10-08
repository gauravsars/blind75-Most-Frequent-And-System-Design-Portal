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

- `GET /api/questions` – all questions or filtered by `topic`/`subtopic`
- `GET /api/questions/{id}` – single question lookup
- `GET /api/topics` – list of available topics
- `GET /api/topics/{slug}/questions` – questions scoped to a topic
- `GET /api/subtopics` – list of subtopics
- `GET /api/subtopics/{name}/questions` – questions scoped to a subtopic

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
