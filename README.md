# 🛍️ Product Catalog - React + Spring Boot + MySQL

A full-stack product catalog web application built using **React** for the frontend and **Spring Boot** for the backend. It allows users to view, search, filter, and sort products by categories, with real-time filtering and dynamic data fetching from a MySQL database.

---

## ✅ Features

- 📦 Product listing with images, description, and pricing.
- 🔍 Search functionality by product name.
- 🔃 Sorting (Low to High & High to Low) by price.
- 🗂️ Filter by category.
- 🔁 Real-time filtering and searching.
- 🚀 React + Bootstrap UI.
- 🛠️ REST APIs with Spring Boot.
- 💾 MySQL database with auto-seeding on startup.

---

## 🧑‍💻 Frontend - React

### 📁 Tech Stack

- ReactJS (Functional Components)
- React Hooks (`useState`, `useEffect`)
- Bootstrap for styling
- Vite for fast development
- Fetch API for data retrieval

### 🔍 Components

1. **App.jsx**: Root component; handles fetching, search, sort, and filter logic.
2. **ProductList.jsx**: Displays product cards.
3. **CategoryFilter.jsx**: Dropdown to filter by category.
4. **index.jsx**: Renders React DOM and includes Bootstrap.

### ⚙️ Frontend Features Implemented

- Dynamic filtering based on category selection.
- Client-side search and sort operations.
- `fetch` used to consume backend REST APIs.
- Clean, responsive UI with Bootstrap.

---

## ☕ Backend - Spring Boot

### 📁 Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Web (REST APIs)
- Spring Data JPA
- MySQL Database
- Hibernate ORM
- Lombok (for boilerplate reduction)

### 📦 Packages

- `Model`: Entity classes (`Product`, `Category`)
- `Repo`: Repository interfaces extending `JpaRepository`
- `Service`: Business logic layer
- `Controllers`: RESTful APIs
- `Config`: `DataSeeder` class to auto-populate products & categories on startup

### ✅ Backend Features Implemented

- Entity relationships: `ManyToOne` and `OneToMany`
- Category to Product → Bi-directional mapping
- Auto JSON handling with `@JsonIgnoreProperties` to avoid infinite recursion
- REST endpoints for fetching all products, products by category, and all categories
- CORS enabled for React (`localhost:5173`)

📡 API Endpoints
Method	Endpoint	Description
GET	/storefront/product/get-all	Fetch all products
GET	/storefront/product/get/{categoryId}	Fetch products by category ID
GET	/storefront/category/all	Fetch all categories

📦 storefront-backend
 ┣ 📂Model
 ┃ ┣ 📄Category.java
 ┃ ┗ 📄Product.java
 ┣ 📂Repo
 ┃ ┣ 📄CategoryRepo.java
 ┃ ┗ 📄ProductRepo.java
 ┣ 📂Service
 ┃ ┣ 📄CategoryService.java
 ┃ ┗ 📄ProductService.java
 ┣ 📂Controllers
 ┃ ┣ 📄CategoryController.java
 ┃ ┗ 📄ProductController.java
 ┣ 📂Config
 ┃ ┗ 📄DataSeeder.java
 ┗ 📄application.properties

📦 storefront-frontend
 ┣ 📄App.jsx
 ┣ 📄ProductList.jsx
 ┣ 📄CategoryFilter.jsx
 ┣ 📄index.jsx
 ┣ 📄App.css
 ┗ 📄index.css
