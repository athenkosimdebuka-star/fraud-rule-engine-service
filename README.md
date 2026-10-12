Fraud Rule Engine Service
A Java-based Fraud Rule Engine Service built with Spring Boot. This project evaluates financial transactions against configurable fraud rules to help identify potentially suspicious activity.

Features
Evaluate financial transactions against fraud detection rules.
Identify high-value transactions.
Handle null transaction inputs.
Use BigDecimal for accurate monetary calculations.
Include automated tests using JUnit and Spring Boot testing tools.
Technologies Used
Java 21
Spring Boot
Maven
JUnit
Git and GitHub
Project Structure
fraud-rule-engine-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── za/co/fraudengine/
│   │   └── resources/
│   └── test/
│       └── java/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
Getting Started
Prerequisites
Java Development Kit (JDK) 21
Run the Tests
On Windows, open a terminal in the project directory and run:

.\mvnw.cmd clean test
Run the Application
.\mvnw.cmd spring-boot:run
Testing
The project includes automated tests for the application, fraud rule engine, and fraud rule service.

Run the test command above to verify that the project builds and the tests pass.

Author
Athenkosi Mdebuka

GitHub: athenkosimdebuka-star
