# Use Java 17 base image
FROM eclipse-temurin:17-jdk
 
# Set working directory
WORKDIR /app
 
# Copy jar file
COPY target/user_service-0.0.1-SNAPSHOT.jar app.jar
 
# Expose port
EXPOSE 8081
 
# Run application
ENTRYPOINT ["java","-jar","app.jar"]