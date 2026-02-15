# Back-End Programming - Spring Boot E-Commerce Application

[![Java](https://img.shields.io/badge/Java-Spring%20Boot-green)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-Database-blue)](https://www.mysql.com/)
[![WGU](https://img.shields.io/badge/WGU-D288-purple)](https://www.wgu.edu/)

## 📋 Project Overview

This repository contains an **e-commerce vacation booking application** built with Spring Boot, MySQL, and Angular. The project demonstrates object-oriented programming with the Spring Framework, implementing standard design patterns and database integration for a full-stack travel booking system.

**Course**: D288 – Back-End Programming  
**Institution**: Western Governors University  
**Focus**: Object-oriented applications with Spring Framework and relational database integration

⚠️ **ACADEMIC INTEGRITY NOTICE**  
This repository contains academic coursework. In accordance with WGU's Student Code of Conduct:
- **DO NOT** distribute or publicly post solutions
- **DO NOT** copy code for your assignments  
- **Keep all forks PRIVATE**

Please refer to WGU's Student Code of Conduct and Ethical Expectations for College of IT Students.

## 🌿 Branch Structure

| Branch | Status | Description | Use Case |
|--------|--------|-------------|----------|
| **`main`** | 📦 Template | Base starter code from WGU | Reference, starting point |
| **`working_branch`** | ✅ Production | Complete implementation | Review completed work |

### 🔀 Viewing the Complete Implementation

👉 **[Switch to working_branch to see the full application →](https://github.com/wallacemendoza/back-end-programming/tree/working_branch)**

**To switch branches:**
```bash
git checkout working_branch
```

## 🎯 Project Goals

This project involves developing an object-oriented Spring Boot application that:

1. **Integrates with MySQL Database**
   - Design and implement relational database schema
   - Create entity relationships (One-to-Many, Many-to-One)
   - Use Spring Data JPA for database operations

2. **Implements Spring Framework**
   - Build RESTful API endpoints
   - Use dependency injection and IoC
   - Implement MVC architecture pattern

3. **Applies Design Patterns**
   - Repository pattern for data access
   - Service layer for business logic
   - DTO pattern for data transfer
   - Factory and Builder patterns

4. **Develops E-Commerce Features**
   - Shopping cart functionality
   - Customer management (CRUD operations)
   - Vacation package browsing
   - Excursion add-ons
   - Checkout and purchase workflow

## 🛠️ Technology Stack

### Backend
- **Java** - Core programming language
- **Spring Boot** - Application framework
- **Spring Data JPA** - ORM with Hibernate
- **MySQL** - Relational database
- **Maven** - Build and dependency management

### Frontend
- **Angular** - Single-page application
- **TypeScript** - Type-safe JavaScript
- **HTML/CSS** - UI markup and styling

### Tools
- **IntelliJ IDEA Ultimate** - Primary IDE
- **MySQL Workbench** - Database management
- **Git** - Version control

## 📁 Base Project Structure

```
/ (root)
├── src/
│   ├── main/
│   │   ├── java/               # Java source code
│   │   │   ├── controllers/    # REST endpoints
│   │   │   ├── dao/            # Repositories
│   │   │   ├── entities/       # JPA entities
│   │   │   └── services/       # Business logic
│   │   └── resources/
│   │       └── application.properties
│   └── test/                   # Unit tests
├── .mvn/wrapper/               # Maven wrapper
├── pom.xml                     # Maven configuration
└── README.md                   # This file
```

## 🚀 Getting Started

### Prerequisites
- **JDK 11+** - Java Development Kit
- **MySQL 8.0+** - Database server
- **Maven 3.6+** - Build tool (or use wrapper)
- **IntelliJ IDEA Ultimate 2022.3.2+** - IDE
- **Node.js & npm** - For Angular frontend
- **Git** - Version control

### Clone the Repository

#### Using IntelliJ IDEA
1. Ensure IntelliJ is installed via [JetBrains Toolbox](https://www.jetbrains.com/toolbox-app/)
2. Use version **2022.3.2** or later
3. Click **Clone** on GitHub
4. Select **IntelliJ IDEA (HTTPS)**
5. Choose directory and click **Clone**
6. Enter credentials when prompted

#### Using Command Line
```bash
git clone https://github.com/wallacemendoza/back-end-programming.git
cd back-end-programming
```

### Database Setup

1. **Install MySQL** (if not already installed)
2. **Create database:**
```sql
CREATE DATABASE vacation_booking;
```

3. **Configure connection** in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vacation_booking
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Build and Run

```bash
# Using Maven Wrapper
./mvnw clean install
./mvnw spring-boot:run

# On Windows
mvnw.cmd clean install
mvnw.cmd spring-boot:run
```

**Or using IntelliJ:**
1. Open project
2. Wait for Maven sync
3. Run `DemoApplication.java`

Application starts on **http://localhost:8080**

## 📚 Assignment Instructions

For this assessment, you will:

1. **Work in IntelliJ IDEA Ultimate** in WGU lab environment
2. **Integrate with existing MySQL database** provided in lab
3. **Connect to Angular frontend** supplied in lab
4. **Share to private GitLab repository** and backup regularly
5. **Implement required features** per course specifications

**Optional**: Download Angular frontend and create local MySQL database for local development.

**For specific task instructions, refer to the course page.**

## 📖 How to Create a Development Branch

### Using Git
```bash
git checkout -b my-dev-branch
```

### Using IntelliJ
1. Go to **Git** in toolbar
2. Select **New Branch**
3. Name your branch
4. Ensure **checkout branch** is selected
5. Click **Create**

### Using GitLab
1. Press **+** near branch name
2. Select **New branch**
3. Enter branch name
4. Click **Create Branch**

## 🎓 Learning Objectives

By completing this project, you will demonstrate:

- **Object-Oriented Programming** - Classes, inheritance, encapsulation
- **Spring Framework Expertise** - Spring Boot, Spring Data, MVC
- **Database Integration** - JPA, Hibernate, MySQL
- **RESTful API Design** - HTTP methods, endpoints, JSON
- **Design Patterns** - Repository, Service, DTO, MVC
- **Full-Stack Development** - Backend-frontend integration
- **Build Tools** - Maven dependency management
- **Version Control** - Git branching and commits

## 📊 What's in the Working Branch?

| Feature | Main Branch | Working Branch |
|---------|-------------|----------------|
| Status | Template | ✅ Complete |
| Shopping Cart | ❌ Basic | ✅ Fully functional |
| Customer CRUD | ❌ Basic | ✅ Complete |
| Purchase Flow | ❌ Basic | ✅ Implemented |
| Database Schema | ❌ Partial | ✅ Complete |
| REST APIs | ❌ Partial | ✅ All endpoints |
| Validation | ❌ Basic | ✅ Full validation |
| Documentation | ⚠️ Minimal | ✅ Comprehensive |
| Screenshots | ❌ None | ✅ Database & App |

## 📞 Support

### For WGU Students
- Navigate to **course page** for resources
- Contact your **course instructor**
- Use **course chatter** for discussions

### Technical Resources
- [Spring Boot Docs](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [Maven Guide](https://maven.apache.org/guides/)

## 💼 Portfolio Use

This project demonstrates:
- Enterprise Java development with Spring Boot
- Database design and ORM implementation
- RESTful API development
- Full-stack application architecture
- Object-oriented design patterns

Use this project to showcase your backend development skills in:
- Resume portfolio
- Job applications
- Technical interviews
- Professional development

## ⚠️ Important Reminders

### Academic Integrity
- **DO NOT distribute solutions**
- **Make forks PRIVATE**
- Complete your own work
- Use as reference only
- Follow WGU Code of Conduct

### Best Practices
- Commit code regularly
- Write meaningful commit messages
- Test thoroughly before submission
- Document your work
- Follow Java coding conventions

## 🔄 Next Steps

1. **Review starter code** in main branch
2. **Set up development environment** (IntelliJ, MySQL)
3. **Create development branch** for your work
4. **Refer to course materials** for requirements
5. **Implement features** incrementally
6. **Test each feature** as you build
7. **Document your progress** with screenshots
8. **Backup regularly** to private repository

### Want to See the Complete Implementation?

👉 **[View completed project on working_branch](https://github.com/wallacemendoza/back-end-programming/tree/working_branch)**

```bash
git checkout working_branch
```

## 👤 Author

**Wallace Mendoza**

- GitHub: [@wallacemendoza](https://github.com/wallacemendoza)
- Course: D288 - Back-End Programming
- Institution: Western Governors University

## 📄 License

This project is for educational purposes as part of WGU coursework. All rights reserved.

---

**🎓 Good luck with your Back-End Programming course!**

*For the complete implementation with full features, database schemas, and screenshots, switch to `working_branch`.*

---

**Last Updated**: February 15, 2026  
**Branch**: main (Base Template)  
**Status**: 📦 Starter Code
