FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/scientific-calculator-1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]