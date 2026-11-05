# Fraud Rule Engine Service

A Java-based Fraud Rule Engine Service built with Spring Boot.

## Features

- Evaluate financial transactions against fraud detection rules.
- Identify high-value transactions.
- Handle null transaction inputs.
- Use BigDecimal for accurate monetary calculations.
- Include automated tests using JUnit and Spring Boot testing tools.

## Technologies Used

- Java 21
- Spring Boot
- Maven
- JUnit
- Git and GitHub


## Build the Project

Make sure Java 21 and Maven are installed.

On Windows, open PowerShell in the project root directory and run:

```powershell
.\mvnw.cmd clean package
```

This command compiles the application, runs the automated tests, and packages the application into a JAR file.

## Run the Application

### Run locally using Maven

```powershell
.\mvnw.cmd spring-boot:run
```

The application will start on:

http://localhost:8081

### Run using Docker

Build the Docker image from the project root directory:

```powershell
docker build -t fraud-rule-engine-service .
```

Run the Docker container:

```powershell
docker run -p 8081:8081 fraud-rule-engine-service
```

The application will be accessible at:

http://localhost:8081

## Run Tests

To run all automated tests:

```powershell
.\mvnw.cmd clean test
```

The tests use JUnit and Spring Boot testing tools.

## API Documentation

Swagger UI is available at:

http://localhost:8081/swagger-ui/index.html

OpenAPI documentation is available at:

http://localhost:8081/v3/api-docs

## Health Check

The application health endpoint is available at:

http://localhost:8081/actuator/health