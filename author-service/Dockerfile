FROM openjdk:17
ARG JAR_FILE=./build/libs/author-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} author-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","author-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8082