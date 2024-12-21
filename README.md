Inventory Management System
Overview
The Inventory Management System is a Spring Boot-based application designed to manage products, categories, and inventories in a store. The system allows administrators to perform CRUD (Create, Read, Update, Delete) operations on products, categories, and inventory items. It also provides endpoints to interact with the inventory, such as adding products to the store, updating inventory levels, and deleting or retrieving inventory records.

Features
Category Management:

Create, update, and delete categories for products.
View all categories or get a category by ID.
Product Management:

Create and manage products.
View product details, such as price and name.
Inventory Management:

Add products to the store and manage stock levels.
Update inventory levels and delete inventory items.
API Documentation:

The project includes an integrated Swagger UI for easy testing and documentation of API endpoints.
Technologies Used
Spring Boot: Framework for building the backend of the application.
Spring Data JPA: Used for interacting with the MySQL database.
MySQL: Database to store category, product, and inventory data.
Swagger/OpenAPI: API documentation for easy interaction with the backend.
Lombok: Java library to reduce boilerplate code (e.g., getters, setters).
Getting Started
Prerequisites
Before running the project, ensure you have the following installed:

Java 17 or higher
Maven
MySQL Database
IDE (e.g., IntelliJ IDEA, Eclipse)
Setup
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/InventoryManagementSystem.git
cd InventoryManagementSystem
Configure Database:

Set up your MySQL database and create a schema (e.g., inventory_db).

Example application.properties configuration for MySQL:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Build the Project:

Use Maven to build the project.

bash
Copy code
mvn clean install
Run the Application:

Run the Spring Boot application.

bash
Copy code
mvn spring-boot:run
The application will start on port 8080 by default.

Accessing the Application
Swagger UI:

Visit http://localhost:8080/swagger-ui.html to access the interactive API documentation.
API Endpoints: The following endpoints are available for interacting with the system:

Categories:

POST /api/categories: Create a new category.
GET /api/categories: Get all categories.
GET /api/categories/{categoryId}: Get a category by ID.
PUT /api/categories/{categoryId}: Update a category.
DELETE /api/categories/{categoryId}: Delete a category.
Products:

POST /api/products: Create a new product.
GET /api/products: Get all products.
GET /api/products/{productId}: Get a product by ID.
PUT /api/products/{productId}: Update a product.
DELETE /api/products/{productId}: Delete a product.
Inventory:

POST /api/inventory: Add a product to the inventory.
GET /api/inventory: Get all inventory records.
GET /api/inventory/{inventoryId}: Get inventory by ID.
PUT /api/inventory/{inventoryId}: Update inventory record.
DELETE /api/inventory/{inventoryId}: Delete inventory record.
Contributing
Contributions are welcome! Feel free to fork the repository, make changes, and submit a pull request.
