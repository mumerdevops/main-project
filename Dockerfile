# 1. Start with a Java environment (JDK)
FROM eclipse-temurin:17-jdk-alpine

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy everything from your computer folder into the container
COPY . .

# 4. Compile the Java code
# Since your file is in src/main/java, we point the compiler there
RUN javac src/main/java/OrderProcessor.java

# 5. Run the application
# We use -cp (classpath) to tell Java where the compiled .class file is
CMD ["java", "-cp", "src/main/java", "OrderProcessor"]
