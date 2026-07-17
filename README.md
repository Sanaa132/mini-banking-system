# Mini Banking System
Spring Boot backend application developed as part of the **Banfico Java Backend Training Program**.

Week 1 includes project setup, PostgreSQL integration, REST API development, Git metadata integration, and clean project organization.

## Tech Stack
Java 17 · Spring Boot 4.1.0 · Maven · PostgreSQL · Spring Data JPA · Git · GitHub · Postman

## Setup
Configure the following environment variables before running the application:

| Variable      | Description         |
| ------------- | -------------------- |
| `DB_URL`      | PostgreSQL JDBC URL |
| `DB_USERNAME` | PostgreSQL username |
| `DB_PASSWORD` | PostgreSQL password |

Run the application:

**Windows**
```bash
mvnw.cmd spring-boot:run
```
**Linux/macOS**
```bash
./mvnw spring-boot:run
```

The application runs on **http://localhost:8080**.

## API Endpoints
* `GET /health` – Returns the application health status.
* `GET /api/info` – Returns application metadata along with the current Git branch and commit ID, generated using `git-commit-id-maven-plugin`.

## Postman
The Postman collection containing all implemented API requests is available in the `postman/` directory.

## Notes

- Configured database connectivity using environment variables to avoid storing credentials in source control.
- Integrated `git-commit-id-maven-plugin` to expose Git branch and commit information through the `/api/info` endpoint.
- Imported the generated `git.properties` file using `spring.config.import` to make Git metadata available at runtime.


## Features
* Spring Boot project setup
* PostgreSQL integration
* REST API development
* Git metadata integration
* Environment variable-based configuration
* Maven build setup
* GitHub repository setup
* Postman collection


