# Gigablog Spring Boot Application

## Description
Gigablog is a Spring Boot application for a scalable blogging platform with user authentication, post creation, commenting, and more.

## Features
- User authentication
- CRUD blog posts
- Commenting
- Search
- Responsive design

## Technologies
- Spring Boot
- Spring Security
- Thymeleaf
- JPA/Hibernate
- MySQL
- Maven

## Getting Started
### Prerequisites
- Java 11+
- Maven
- Postgres

### Installation
1. Clone the repo:
    ```sh
    git clone https://github.com/yourusername/gigablog.git
    ```
2. Navigate to the project:
    ```sh
    cd gigablog
    ```
3. Update `application.properties` with MySQL credentials.
4. Build the project:
    ```sh
    mvn clean install
    ```
5. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Usage
Access at `http://localhost:8080`. Register or log in to manage blog posts.
