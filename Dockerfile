# Gunakan base image resmi untuk Spring Boot
FROM openjdk:11-jre-slim

# Set working directory
WORKDIR /app

# Salin file jar aplikasi ke container
COPY target/*.jar app.jar

# Tentukan command untuk menjalankan aplikasi
ENTRYPOINT ["java", "-jar", "app.jar"]
