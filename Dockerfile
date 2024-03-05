# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/productSpring-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
