FROM adoptopenjdk/openjdk11:latest

WORKDIR /app

COPY target/swagger-spring-1.0.0.jar /app/swagger-spring-1.0.0.jar

EXPOSE 8080

CMD ["java", "-jar", "swagger-spring-1.0.0.jar"]
