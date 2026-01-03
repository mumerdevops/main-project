FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Sab kuch copy karein (Check karein ke .jar file aapke folder mein hai)
COPY . .

# Code compile karein
RUN javac src/main/java/OrderProcessor.java

# Yeh line sab se zaroori hai: 
# '.' (current folder), 'src/main/java' aur '.jar' file ko milakar classpath banta hai
CMD ["java", "-cp", ".:src/main/java:mysql-connector-j-8.0.33.jar", "OrderProcessor"]