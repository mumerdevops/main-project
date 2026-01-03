FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
# File path ab change ho chuka hai
RUN javac src/main/java/OrderProcessor.java
CMD ["java", "-cp", "src/main/java", "OrderProcessor"]