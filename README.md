# Spring Boot Test API

This is a **Spring Boot** application demonstrating a basic CRUD API with:

- **User management** (Create, Read, Update, Delete)
- **Pagination support**
- **External API call** (`Products API`)
- **Global exception handling**
- **Request/Response logging**
- **Database integration** with MySQL (`TESTDB`)
- **Postman collection & environment**
---

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)
- [Postman Collection](#postman-collection)
- [Logging](#logging)
---

## Prerequisites

- Java 17+ (JDK)
- Maven
- MySQL Server (Local)
    - Database: `TESTDB`
- Postman (optional, for API testing)

---

## Setup

1. **Clone the repository:**
```bash
git clone https://github.com/yourusername/demo.git
cd demo
```

2. **Create TESTDB database manually if it doesn't exist:**
```bash
CREATE TABLE TESTDB.dbo.users (
	id bigint IDENTITY(1,1) NOT NULL,
	name varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	email varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	CONSTRAINT PK__users__3213E83FCCD56799 PRIMARY KEY (id)
);
```

3. **Run the Application:**
```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints
| Method | Endpoint              | Description                       |
| ------ | --------------------- |-----------------------------------|
| POST   | `/api/users`          | Create user                       |
| PUT    | `/api/users/{id}`     | Update user                       |
| GET    | `/api/users`          | Get users (paginated, default 10) |
| GET    | `/api/users/all`      | Get all users (no pagination)     |
| GET    | `/api/users/external` | Call external API (`Products`)    |
| DELETE | `/api/users/{id}`     | Delete user                       |

## Postman Collection
1. Environment Variables:

| Key     | Value                                          |
| ------- | ---------------------------------------------- |
| baseUrl | [http://localhost:8080](http://localhost:8080) |
| page    | 0                                              |

2. Collection:
   Import the JSON file: SpringBoot Test API.postman_collection.json (includes Create, Update, Get, Delete, External API endpoints)

## Logging
1. Logs are saved to:
```bash
<project_root>/logs/api.log
```
2. Logs include:
   1. HTTP request method & path
   2. HTTP response status
   3. Exceptions (via GlobalExceptionHandler)
---

## Author

Nuqman Manja – Spring Boot & Java Backend Developer