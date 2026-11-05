
# Stage 1: Run the application
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/fraud-rule-engine-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]