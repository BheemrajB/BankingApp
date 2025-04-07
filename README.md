# 🏦 Banking Application - Spring Boot REST API

This project demonstrates how to build **RESTful APIs** for a simple **Banking Application** using **Spring Boot**, **Spring Data JPA (Hibernate)**, and **MySQL**.

---

## 🚀 Features

- ✅ Create new bank accounts
- 💰 Deposit & withdraw operations
- 📄 Get account details
- ❌ Proper error handling and input validation
- 🔐 Layered architecture (Controller → Service → Repository)
- 📦 DTOs for data transfer
- 📘 Swagger support for API testing (Optional)

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **MySQL**
- **Lombok**
- **Maven**

---

## ⚙️ Getting Started

### ✅ Prerequisites

- Java 17+
- Maven
- MySQL server running

### 📦 Clone the repo

```bash
git clone https://github.com/BheemrajB/BankingApp.git
cd banking-app

⚙️ Configure Database
In src/main/resources/application.properties, update your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

🎯 API Endpoints
Method       Endpoint                     Description
POST       /api/accounts               Create a new account
GET       /api/accounts/{id}           Get account details
PUT      /api/accounts/deposit/{id}    Deposit amount
PUT     /api/accounts/withdraw/{id}    Withdraw amount

