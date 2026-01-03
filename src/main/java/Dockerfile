FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Sab kuch copy karein
COPY . .

# Driver ko Java ke default library folder mein daalein (Automatic loading)
RUN cp mysql-connector-j-8.0.33.jar /opt/java/openjdk/lib/

# Compile karein
RUN javac src/main/java/OrderProcessor.java

# Simple run command
CMD ["java", "-cp", "src/main/java:mysql-connector-j-8.0.33.jar", "OrderProcessor"]