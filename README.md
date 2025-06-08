# Task Tracker API - Spring Boot

This is a simple REST API built with Spring Boot that allows users to manage their daily tasks with support for status tracking, due date filtering, pagination, sorting, and user-task mapping.

---

## 📌 Features

- Add, update, delete, view tasks
- Filter tasks by status (`PENDING`, `IN_PROGRESS`, `COMPLETED`)
- Filter tasks by due date
- Pagination and sorting
- Swagger UI for API documentation

---

## 🧪 Sample API Endpoints

| Method | Endpoint                         | Description                    |
|--------|----------------------------------|--------------------------------|
| POST   | `/tasks`                         | Create a new task              |
| GET    | `/tasks/getall`                         | Get all tasks with paging      |
| GET    | `/tasks/{id}`                    | Get task by ID                 |
| PUT    | `/tasks/{id}`                    | Update task by ID              |
| DELETE | `/tasks/{id}`                    | Delete task by ID              |
| GET    | `/tasks/status/{status}`         | Get tasks by status            |
| GET    | `/tasks/due/{yyyy-MM-dd}`        | Get tasks by due date          |

---

## 📥 How to Run

**Clone the Repository:**

```bash
git clone https://github.com/Dhiraj-2003/Task-Tracker-APIs.git
cd Task-Tracker-APIs
```
## ⚙️ Tech Stack

- 🛠 **Java 21**
- 🚀 **Spring Boot 3.x**
- 🗃 **Spring Data JPA**
- 📦 **Maven**
- 💡 **Lombok**
- 📘 **Swagger UI (Springdoc OpenAPI)**

---

## 🔍 Swagger UI

Once the application is running, you can access the Swagger UI at:
```bash
http://localhost:8080/swagger-ui/index.html
```

Swagger provides an interactive interface for exploring and testing your REST APIs.

### 📸 Example:

![Swagger UI Screenshot](screenshots/swaggerPost.png)
![Swagger UI Screenshot](screenshots/swaggerResponse.png)
![Swagger UI Screenshot](screenshots/Database.png)
