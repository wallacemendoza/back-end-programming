# `VACATION_BOOKING_PLATFORM`

```ascii
███████╗      ██████╗ ██████╗ ███╗   ███╗███╗   ███╗███████╗██████╗  ██████╗███████╗
██╔════╝     ██╔════╝██╔═══██╗████╗ ████║████╗ ████║██╔════╝██╔══██╗██╔════╝██╔════╝
█████╗█████╗ ██║     ██║   ██║██╔████╔██║██╔████╔██║█████╗  ██████╔╝██║     █████╗  
██╔══╝╚════╝ ██║     ██║   ██║██║╚██╔╝██║██║╚██╔╝██║██╔══╝  ██╔══██╗██║     ██╔══╝  
███████╗     ╚██████╗╚██████╔╝██║ ╚═╝ ██║██║ ╚═╝ ██║███████╗██║  ██║╚██████╗███████╗
╚══════╝      ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝ ╚═════╝╚══════╝
```

<div align="center">

### 🌴 ENTERPRISE TRAVEL & TOURISM E-COMMERCE ENGINE 🌴

**`SPRING_BOOT`** × **`MYSQL`** × **`JPA_HIBERNATE`** × **`ANGULAR`** × **`REST_API`**

*Full-stack vacation booking system demonstrating enterprise Java patterns, database design, and transactional commerce workflows*

-----

![Java](https://img.shields.io/badge/JAVA-Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MYSQL-Database-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Angular](https://img.shields.io/badge/ANGULAR-Frontend-DD0031?style=for-the-badge&logo=angular&logoColor=white)

</div>

-----

## 🎯 `SYSTEM_OVERVIEW`

**Production-grade e-commerce platform** for vacation package booking with complete shopping cart, customer management, and payment processing. Built with Spring Boot backend, MySQL persistence, and Angular frontend — showcasing enterprise software architecture patterns.

### `CORE_CAPABILITIES`

```yaml
domain: "Travel & Tourism E-Commerce"
architecture: "Spring MVC + Service Layer + Repository Pattern"
database: "MySQL with JPA/Hibernate ORM"
features:
  - Shopping cart management
  - Vacation package catalog
  - Excursion add-ons
  - Customer CRUD operations
  - Checkout & purchase workflow
  - Transaction processing
frontend: "Angular SPA"
```

-----

## 🔥 `FEATURES_IMPLEMENTED`

<table>
<tr>
<td width="50%">

### `COMMERCE_ENGINE`

```java
✓ Shopping cart (add/remove/clear)
✓ Vacation packages catalog
✓ Excursion selections
✓ Purchase workflow
✓ Inventory management
✓ Order tracking numbers
✓ Cart status (pending/ordered/canceled)
```

</td>
<td width="50%">

### `DATA_MANAGEMENT`

```java
✓ Customer CRUD operations
✓ Entity relationships (1-M, M-M)
✓ Transaction management
✓ Database constraints
✓ Cascading operations
✓ Data validation
✓ Error handling
```

</td>
</tr>
</table>

### `TECHNICAL_STACK`

|Layer       |Technology              |Implementation              |
|------------|------------------------|----------------------------|
|**Backend** |Spring Boot 2.x         |REST controllers, services  |
|**ORM**     |JPA/Hibernate           |Entity mapping, repositories|
|**Database**|MySQL 8.0               |Relational data storage     |
|**Frontend**|Angular                 |Single-page application     |
|**API**     |REST                    |JSON endpoints              |
|**Build**   |Maven                   |Dependency management       |
|**Patterns**|MVC, Repository, Service|Clean architecture          |

-----

## 🛠️ `ARCHITECTURE`

```
╔═══════════════════════════════════════════════════════════════╗
║                     ANGULAR FRONTEND                           ║
║   • Vacation catalog browsing                                 ║
║   • Shopping cart interface                                   ║
║   • Customer data forms                                       ║
║   • Checkout workflow                                         ║
╚══════════════════════╦════════════════════════════════════════╝
                       ║ HTTP/REST
╔══════════════════════╩════════════════════════════════════════╗
║                   SPRING MVC CONTROLLERS                       ║
║   ├─ CheckoutController → Purchase processing                ║
║   ├─ CartController → Cart operations                        ║
║   └─ CustomerController → Customer management                ║
╚══════════════════════╦════════════════════════════════════════╝
                       ║
╔══════════════════════╩════════════════════════════════════════╗
║                     SERVICE LAYER                              ║
║   ├─ CheckoutService → Business logic & validation           ║
║   ├─ CartService → Cart state management                     ║
║   └─ PurchaseService → Transaction orchestration             ║
╚══════════════════════╦════════════════════════════════════════╝
                       ║
╔══════════════════════╩════════════════════════════════════════╗
║                   REPOSITORY LAYER                             ║
║   ├─ CartRepository                                           ║
║   ├─ CustomerRepository                                       ║
║   ├─ VacationRepository                                       ║
║   └─ ExcursionRepository                                      ║
╚══════════════════════╦════════════════════════════════════════╝
                       ║ JPA/Hibernate
╔══════════════════════╩════════════════════════════════════════╗
║                      MYSQL DATABASE                            ║
║   Tables: carts, cart_items, customers, vacations,           ║
║           excursions, countries, divisions                    ║
╚═══════════════════════════════════════════════════════════════╝
```

-----

## 💾 `DATABASE_SCHEMA`

### Entity Relationships

```
Customer (1) ──────── (1) Cart
                        │
                        │ (1)
                        ↓
                   (Many) CartItem
                        │
                        ├─────┐
                   (M)  │  (M)│
                        ↓     ↓
                  Vacation  Excursion
                     │         │
                     │         │
                     └────┬────┘
                      (M) │ (1)
                          ↓
                       Country
```

### Core Tables

**CUSTOMERS**

```sql
customer_id (PK) | first_name | last_name | address | 
postal_code | phone | division_id (FK)
```

**CARTS**

```sql
cart_id (PK) | package_price | party_size | status |
order_tracking_number | create_date | customer_id (FK)
```

**CART_ITEMS**

```sql
cart_item_id (PK) | cart_id (FK) | 
vacation_id (FK) | excursion_id (FK)
```

**VACATIONS**

```sql
vacation_id (PK) | vacation_title | description |
travel_price | image_url | create_date
```

**EXCURSIONS**

```sql
excursion_id (PK) | excursion_title | price |
image_url | vacation_id (FK)
```

-----

## ⚙️ `INSTALLATION`

### Prerequisites

```bash
# JDK 11+
java -version

# Maven 3.6+
mvn -version

# MySQL 8.0+
mysql --version

# Node.js 14+ (for Angular)
node -v
npm -v
```

### Database Setup

```sql
-- Create database
CREATE DATABASE vacation_booking;
USE vacation_booking;

-- Spring Boot will auto-create tables on first run
-- Or run schema.sql if provided
```

### Application Configuration

Edit `src/main/resources/application.properties`:

```properties
# Database connection
spring.datasource.url=jdbc:mysql://localhost:3306/vacation_booking
spring.datasource.username=root
spring.datasource.password=your_password

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Server
server.port=8080
```

### Build & Run

```bash
# Clone repository
git clone <repo-url>
cd back-end-programming
git checkout working_branch

# Build backend
./mvnw clean install

# Run Spring Boot
./mvnw spring-boot:run

# Backend available at: http://localhost:8080
```

### Frontend Setup

```bash
cd src/main/webapp
npm install
ng serve

# Frontend available at: http://localhost:4200
```

-----

## 🎮 `USAGE_WORKFLOWS`

### Customer Purchase Flow

```
1. Browse Vacation Catalog
   └─ GET /api/vacations

2. Select Vacation Package
   └─ GET /api/vacations/{id}

3. Choose Excursion Add-ons
   └─ GET /api/excursions?vacationId={id}

4. Add to Cart
   └─ POST /api/cart/add
   
5. Review Cart
   └─ GET /api/cart

6. Enter Customer Information
   └─ POST /api/customers

7. Complete Purchase
   └─ POST /api/checkout/purchase
   
8. Receive Order Tracking Number
   └─ Response: { orderNumber: "TRK123456" }
```

### API Endpoints

```http
# Vacations
GET    /api/vacations              → List all packages
GET    /api/vacations/{id}         → Get package details
POST   /api/vacations              → Create package
PUT    /api/vacations/{id}         → Update package
DELETE /api/vacations/{id}         → Delete package

# Excursions
GET    /api/excursions             → List all excursions
GET    /api/excursions?vacation={id} → Filter by vacation

# Cart Operations
POST   /api/cart/add               → Add item to cart
DELETE /api/cart/items/{id}        → Remove item
GET    /api/cart                   → View cart

# Checkout
POST   /api/checkout/purchase      → Process purchase
```

-----

## 🎯 `TECHNICAL_HIGHLIGHTS`

### Spring Boot Features

```java
// Entity Relationships
@Entity
public class Cart {
    @Id @GeneratedValue
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private Set<CartItem> cartItems;
    
    @Enumerated(EnumType.STRING)
    private CartStatus status;
}

// Repository Pattern
public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByCustomerId(Long customerId);
    List<Cart> findByStatus(CartStatus status);
}

// Service Layer
@Service
@Transactional
public class CheckoutServiceImpl implements CheckoutService {
    
    @Override
    public PurchaseResponse purchase(PurchaseRequest request) {
        // Validate cart
        // Process payment
        // Update inventory
        // Generate tracking number
        // Persist order
        return new PurchaseResponse(trackingNumber);
    }
}
```

### Transaction Management

```java
@Transactional
public void processCheckout(Cart cart) {
    // All operations succeed or rollback together
    cart.setStatus(CartStatus.ORDERED);
    cart.setOrderTrackingNumber(generateTrackingNumber());
    
    cartRepository.save(cart);
    // If any operation fails, entire transaction rolls back
}
```

-----

## 📊 `PROJECT_METRICS`

```yaml
Backend:
  Lines of Code: 2000+
  Controllers: 5+
  Services: 6+
  Repositories: 7+
  Entities: 8+
  
Database:
  Tables: 8
  Relationships: 6+ foreign keys
  Constraints: Primary keys, unique, not null
  
Frontend:
  Components: 10+
  Services: 5+
  Routes: 8+
  
Features:
  - Shopping cart
  - Checkout workflow
  - Customer management
  - Vacation catalog
  - Excursion options
```

-----

## 🧪 `TESTING`

```bash
# Run unit tests
./mvnw test

# Run with coverage
./mvnw clean test jacoco:report

# Integration tests
./mvnw verify
```

-----

## 🔬 `LEARNING_OBJECTIVES`

Demonstrates practical mastery of:

- **Spring Boot Framework**: Auto-configuration, starters, embedded server
- **Spring Data JPA**: Repository abstraction, query methods
- **Hibernate ORM**: Entity mapping, lazy/eager loading, cascades
- **Database Design**: Normalization, relationships, constraints
- **RESTful APIs**: HTTP methods, JSON, status codes
- **Transaction Management**: ACID properties, rollback handling
- **MVC Architecture**: Separation of concerns, layered design
- **Full-Stack Integration**: Backend-frontend communication
- **Build Automation**: Maven lifecycle, dependency management

**Real-World Application**: E-commerce patterns used in production travel booking systems.

-----

## 🐛 `TROUBLESHOOTING`

### Common Issues

**MySQL Connection Failed**

```bash
# Check MySQL is running
sudo systemctl status mysql

# Verify credentials in application.properties
spring.datasource.username=root
spring.datasource.password=your_password
```

**Port 8080 Already in Use**

```bash
# Change port in application.properties
server.port=8081

# Or kill process using port 8080
lsof -i :8080
kill -9 <PID>
```

**Hibernate DDL Errors**

```bash
# Drop and recreate database
DROP DATABASE vacation_booking;
CREATE DATABASE vacation_booking;

# Or use different strategy
spring.jpa.hibernate.ddl-auto=create
```

-----

## 📜 `LICENSE_&_USAGE`

```
┌─────────────────────────────────────────────────────────┐
│  E-COMMERCE PLATFORM DEMONSTRATION                       │
│                                                          │
│  Full-stack vacation booking system showcasing           │
│  enterprise Java development and database design.        │
│  Portfolio demonstration of backend engineering.         │
│                                                          │
│  ⚠️  Academic/portfolio project only                    │
│  ⚠️  Not for commercial deployment                     │
│  ✓  Available for technical review                      │
│  ✓  Open to discussion                                  │
└─────────────────────────────────────────────────────────┘
```

-----

## 🚀 `AUTHOR`

**Wallace Mendoza** — *Backend Engineer*

Specializing in Spring Boot, database design, and enterprise Java applications.

[GitHub](https://github.com/wallacemendoza) • [Portfolio](https://wallacemendoza.github.io/portfolio/)

-----

<div align="center">

### `TECH_FINGERPRINT`

`SPRING_BOOT` • `JPA` • `HIBERNATE` • `MYSQL` • `REST` • `MAVEN` • `ANGULAR`

-----

*Enterprise-grade e-commerce architecture*

**[⬆ back to top](#vacation_booking_platform)**

</div>
