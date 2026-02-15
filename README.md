# Back-End Programming - Spring Boot E-Commerce Application
## 🌿 Working Branch - Production Ready

[![Java](https://img.shields.io/badge/Java-Spring%20Boot-green)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-Database-blue)](https://www.mysql.com/)
[![Angular](https://img.shields.io/badge/Angular-Frontend-red)](https://angular.io/)
[![WGU](https://img.shields.io/badge/WGU-D288-purple)](https://www.wgu.edu/)

## 📋 Overview
This is a fully functional **e-commerce vacation booking application** built with Spring Boot backend, MySQL database, and Angular frontend. The project demonstrates enterprise-level object-oriented programming with the Spring Framework, implementing standard design patterns, RESTful APIs, and database integration.

**Academic Project**: Western Governors University - Back-End Programming  
**Application Type**: Travel & Tourism E-Commerce Platform  
**Architecture**: MVC Pattern with Spring Boot


## ✨ Features Implemented

### ✅ Core Functionality
- **Shopping Cart System** - Add/remove items, manage cart state
- **Customer Management** - CRUD operations for customers
- **Vacation Packages** - Browse and purchase vacation packages
- **Excursion Add-Ons** - Select additional excursions for trips
- **Checkout Process** - Complete purchase workflow
- **Database Integration** - MySQL with JPA/Hibernate ORM
- **RESTful API** - Complete REST endpoints for all operations
- **Data Validation** - Server-side validation and error handling

### 🎯 Technical Implementations
- ✅ **Spring Boot Framework** - Enterprise Java application
- ✅ **Spring Data JPA** - ORM with Hibernate
- ✅ **MySQL Database** - Relational data storage
- ✅ **MVC Architecture** - Model-View-Controller pattern
- ✅ **Repository Pattern** - Data access abstraction
- ✅ **Service Layer** - Business logic separation
- ✅ **DTO Pattern** - Data transfer objects
- ✅ **Entity Relationships** - One-to-Many, Many-to-One mappings
- ✅ **Angular Integration** - Full-stack application

## 🛠️ Technology Stack

### Backend
- **Java** - Core programming language
- **Spring Boot 2.x** - Application framework
- **Spring Data JPA** - Database ORM
- **Hibernate** - JPA implementation
- **Maven** - Build and dependency management
- **Lombok** - Reduce boilerplate code

### Database
- **MySQL 8.0** - Relational database
- **MySQL Workbench** - Database administration
- **Spring Data Repositories** - Database queries

### Frontend
- **Angular** - Single-page application framework
- **TypeScript** - Type-safe JavaScript
- **HTML5/CSS3** - UI markup and styling
- **Bootstrap** - Responsive design

### Development Tools
- **IntelliJ IDEA Ultimate** - Primary IDE
- **Git** - Version control
- **Postman** - API testing (optional)

## 📁 Project Structure

```
/ (root)
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── controllers/          # REST Controllers
│   │   │   │   ├── CheckoutController.java
│   │   │   │   └── ...
│   │   │   ├── dao/                   # Data Access Objects (Repositories)
│   │   │   │   ├── CartRepository.java
│   │   │   │   ├── CartItemRepository.java
│   │   │   │   ├── CustomerRepository.java
│   │   │   │   ├── ExcursionRepository.java
│   │   │   │   └── VacationRepository.java
│   │   │   ├── entities/              # JPA Entities (Models)
│   │   │   │   ├── Cart.java
│   │   │   │   ├── CartItem.java
│   │   │   │   ├── Customer.java
│   │   │   │   ├── Excursion.java
│   │   │   │   ├── Vacation.java
│   │   │   │   └── ...
│   │   │   ├── services/              # Business Logic
│   │   │   │   ├── CheckoutService.java
│   │   │   │   ├── CheckoutServiceImpl.java
│   │   │   │   └── ...
│   │   │   └── DemoApplication.java   # Main Spring Boot class
│   │   └── resources/
│   │       ├── application.properties # Configuration
│   │       └── data.sql               # Sample data
│   └── test/                          # Unit tests
├── .mvn/wrapper/                      # Maven wrapper
├── CARTS_TABLE.PNG                    # Database screenshot
├── CART_ITEMS_TABLE.PNG              # Database screenshot
├── CUSTOMERS_TABLE.PNG               # Database screenshot
├── EXCURSION_CARTITEM_TABLE.PNG      # Database screenshot
├── PURCHASE_SCREENSHOT.PNG           # Application screenshot
├── CLEAN_PURCHASE_SCREENSHOT.PNG     # Application screenshot
├── COMMITS_HISTORY.PNG               # Git history
├── mvnw / mvnw.cmd                   # Maven wrapper scripts
├── pom.xml                           # Maven configuration
└── README.md                         # This file
```

## 🗄️ Database Schema

### Entity Relationships

```
Customer (1) ━━━━━━━━ (1) Cart
                         │
                         │ (1)
                         │
                         ↓
                     (Many) CartItem
                         │
                         │ (Many)
                         │
                  ┌──────┴──────┐
                  │             │
              (1) ↓         (1) ↓
            Vacation    Excursion
```

### Tables

**CUSTOMERS**
- customer_id (PK)
- customer_first_name
- customer_last_name
- address
- postal_code
- phone
- division_id (FK)

**CARTS**
- cart_id (PK)
- package_price
- party_size
- status (enum: pending, ordered, canceled)
- order_tracking_number
- create_date
- last_update
- customer_id (FK)

**CART_ITEMS**
- cart_item_id (PK)
- cart_id (FK)
- vacation_id (FK)
- excursion_id (FK)

**VACATIONS**
- vacation_id (PK)
- vacation_title
- description
- travel_fare_price
- image_url
- create_date
- last_update

**EXCURSIONS**
- excursion_id (PK)
- excursion_title
- excursion_price
- image_url
- create_date
- last_update
- vacation_id (FK)

## 🚀 Getting Started

### Prerequisites
- ☑️ **JDK 11+** installed
- ☑️ **Maven 3.6+** or use included wrapper
- ☑️ **MySQL 8.0+** installed and running
- ☑️ **IntelliJ IDEA Ultimate 2022.3.2+**
- ☑️ **Node.js 14+** and npm (for Angular)
- ☑️ **Git** for version control

### Database Setup

#### 1. Create MySQL Database
```sql
-- Create database
CREATE DATABASE IF NOT EXISTS vacation_booking;
USE vacation_booking;

-- Run the schema creation scripts
-- (Schemas will be auto-created by Spring Boot on first run)
```

#### 2. Configure Database Connection
Edit `src/main/resources/application.properties`:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/vacation_booking
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Server Configuration
server.port=8080
```

### Backend Setup

#### 1. Clone and Build
```bash
# Clone repository
git clone https://github.com/wallacemendoza/back-end-programming.git
cd back-end-programming

# Switch to working branch
git checkout working_branch

# Build with Maven
./mvnw clean install

# Or on Windows
mvnw.cmd clean install
```

#### 2. Run the Application

**Using Maven:**
```bash
./mvnw spring-boot:run
```

**Using IntelliJ:**
1. Open project in IntelliJ IDEA
2. Wait for Maven to sync dependencies
3. Find `DemoApplication.java`
4. Right-click → Run 'DemoApplication'

Backend will start on **http://localhost:8080**

### Frontend Setup

```bash
# Navigate to Angular frontend directory
cd [angular-frontend-directory]

# Install dependencies
npm install

# Run development server
ng serve

# Or build for production
ng build --prod
```

Frontend will be available on **http://localhost:4200**

## 🧪 Testing the Application

### Test REST Endpoints

#### Get All Customers
```bash
GET http://localhost:8080/api/customers
```

#### Get Customer by ID
```bash
GET http://localhost:8080/api/customers/1
```

#### Get All Vacations
```bash
GET http://localhost:8080/api/vacations
```

#### Get Cart Items
```bash
GET http://localhost:8080/api/cart-items
```

#### Create Purchase
```bash
POST http://localhost:8080/api/checkout/purchase
Content-Type: application/json

{
  "customer": { ... },
  "cart": { ... },
  "cartItems": [ ... ]
}
```

### Sample Test Flow
1. Browse available vacation packages
2. Add vacation to cart
3. Select excursion add-ons
4. Fill in customer information
5. Complete checkout process
6. Verify purchase in database

## 📸 Application Screenshots

### Database Tables
- **CARTS_TABLE.PNG** - Shopping carts table structure
- **CART_ITEMS_TABLE.PNG** - Cart items with relationships
- **CUSTOMERS_TABLE.PNG** - Customer data
- **EXCURSION_CARTITEM_TABLE.PNG** - Excursion associations

### Application Flow
- **PURCHASE_SCREENSHOT.PNG** - Checkout process
- **CLEAN_PURCHASE_SCREENSHOT.PNG** - Successful purchase
- **COMMITS_HISTORY.PNG** - Development progression

## 🏗️ Architecture & Design Patterns

### MVC Architecture
```
┌─────────────────────────────────────┐
│         Presentation Layer           │
│     (Angular Frontend / REST API)    │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│         Controller Layer             │
│  @RestController - Handle HTTP       │
│  - CheckoutController                │
│  - CustomerController                │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│         Service Layer                │
│  @Service - Business Logic           │
│  - CheckoutServiceImpl               │
│  - Validation & Processing           │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│         Repository Layer             │
│  @Repository - Data Access           │
│  - CartRepository                    │
│  - CustomerRepository                │
└──────────────┬──────────────────────┘
               │
┌──────────────▼──────────────────────┐
│         Database Layer               │
│      MySQL - Persistent Storage      │
└──────────────────────────────────────┘
```

### Design Patterns Used
- **Repository Pattern** - Data access abstraction
- **Service Pattern** - Business logic encapsulation
- **DTO Pattern** - Data transfer between layers
- **Dependency Injection** - Spring IoC container
- **Factory Pattern** - Entity creation
- **Builder Pattern** - Object construction
- **Singleton Pattern** - Spring beans

## 🔧 Configuration

### Application Properties
```properties
# Server Configuration
server.port=8080

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/vacation_booking
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Logging
logging.level.root=INFO
logging.level.com.example.demo=DEBUG

# Data Initialization
spring.jpa.defer-datasource-initialization=true
spring.sql.init.mode=always
```

## 🎓 Learning Outcomes

This project demonstrates proficiency in:
- ✅ **Object-Oriented Programming** - Classes, inheritance, polymorphism
- ✅ **Spring Framework** - Boot, Data JPA, MVC
- ✅ **Database Design** - Entity relationships, normalization
- ✅ **RESTful APIs** - HTTP methods, JSON, endpoints
- ✅ **ORM with JPA** - Entity mapping, repositories, queries
- ✅ **Design Patterns** - Repository, Service, MVC, DTO
- ✅ **Full-Stack Development** - Backend-frontend integration
- ✅ **Build Tools** - Maven dependency management
- ✅ **Version Control** - Git branching and commits

## 📊 Project Statistics
- **Total Commits**: 9 commits
- **Database Tables**: 6 core tables
- **REST Endpoints**: 10+ API endpoints
- **Entity Classes**: 5+ JPA entities
- **Repositories**: 5+ Spring Data repositories
- **Service Classes**: Multiple business logic services
- **Status**: ✅ Production Ready

## 🐛 Troubleshooting

### MySQL Connection Issues
```bash
# Check MySQL is running
sudo systemctl status mysql  # Linux
brew services list           # Mac

# Verify connection
mysql -u root -p
```

### Port Already in Use
```bash
# Find process using port 8080
lsof -i :8080  # Mac/Linux
netstat -ano | findstr :8080  # Windows

# Change port in application.properties
server.port=8081
```

### Maven Build Failures
```bash
# Clean and rebuild
./mvnw clean install -U

# Skip tests if needed
./mvnw clean install -DskipTests
```

## ⚠️ Academic Integrity Policy

**CRITICAL**: This is academic coursework for WGU's D288 Back-End Programming course.

### Strict Guidelines:
- ✅ Use as reference for learning concepts
- ✅ Understand the implementation techniques
- ✅ Study design patterns and architecture
- ❌ **DO NOT** copy code for assignments
- ❌ **DO NOT** share solutions publicly
- ❌ **DO NOT** make forks with solutions public
- ❌ **DO NOT** distribute to other students

Refer to **WGU Student Code of Conduct** for complete policies.

## 📞 Support

### WGU Students
- Contact your **course instructor** via course page
- Use **course chatter** for discussions
- Review **course materials** and resources

### Technical Resources
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA Guide](https://spring.io/projects/spring-data-jpa)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [Angular Documentation](https://angular.io/docs)

## 👤 Author

**Wallace Mendoza**

- GitHub: [@wallacemendoza](https://github.com/wallacemendoza)
- Branch: `working_branch` (Production Ready)
- Course: D288 - Back-End Programming
- Institution: Western Governors University

## 📄 License

This project is for educational purposes as part of WGU coursework. All rights reserved.

---

**Built with ☕ Java, 🍃 Spring Boot, and 🐬 MySQL**

*Branch: working_branch (Production)*  
*Status: ✅ Complete*
