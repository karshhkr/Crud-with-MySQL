# 🚀 Spring Boot RESTful API: User Management System

A high-performance, production-ready **RESTful CRUD application** built with **Spring Boot 3**, **Spring Data JPA**, and **MySQL**. This project demonstrates a clean, layered architecture incorporating **DTO patterns**, repository abstraction, and **Dockerization** for seamless environment consistency.



## 🎯 Key Features
* **Full CRUD Implementation:** Robust endpoints for Creating, Reading, Updating, and Deleting user records.
* **Layered Architecture:** Strict separation of concerns using Controllers, Services, and Data Access Layers.
* **DTO Pattern:** Utilizing Data Transfer Objects to decouple the internal domain model from the external API.
* **Object-Relational Mapping (ORM):** Leverages **Hibernate** and **Spring Data JPA** for efficient database persistence.
* **Environment Consistency:** Fully **Dockerized** setup using Docker Compose to orchestrate the Spring Boot app and MySQL container.
* **API Documentation:** Optimized for testing via **Postman** or Swagger/OpenAPI.

---

## 🛠️ Tech Stack & Tools

| Component | Technology |
| :--- | :--- |
| **Language** | Java 17 (LTS) |
| **Framework** | Spring Boot 3.x |
| **Persistence** | Spring Data JPA / Hibernate |
| **Database** | MySQL 8.0 |
| **Build Tool** | Gradle |
| **Containerization** | Docker & Docker Compose |
| **API Testing** | Postman |

---

## 📂 Project Structure & Design
The project follows the standard **Maven/Gradle** structure with a focus on maintainability:

```text
src/main/java/com/karshhkr/usermanagement/
├── controller/    # REST Endpoints (Entry points)
├── service/       # Business Logic & Validation
├── repository/    # Data Access Layer (JPA Abstraction)
├── model/         # Database Entities
├── dto/           # Data Transfer Objects
└── exception/     # Global Error Handling

## Installation and set-up 
git clone [https://github.com/karshhkr/Crud-with-MySQL.git](https://github.com/karshhkr/Crud-with-MySQL.git)
cd Crud-with-MySQL


## Run with Docker(Recommended)

docker-compose up --build

## Run Locally 

./gradlew bootRun

## Api Endpoint 

Method Endpoint Description
POST /api/users Create a new user
GET /api/users Retrieve all users
GET /api/users/{id} Get user by ID
PUT /api/users/{id} Update existing user
DELETE /api/users/{id} Remove a user

