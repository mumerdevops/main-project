FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Sab kuch copy karein (is mein ab .jar file bhi hogi)
COPY . .

# Compile karein
RUN javac src/main/java/OrderProcessor.java

# Run karte waqt Classpath (-cp) mein Driver aur apni class dono ka path dein
CMD ["java", "-cp", ".:src/main/java:mysql-connector-j-8.0.33.jar", "OrderProcessor"]