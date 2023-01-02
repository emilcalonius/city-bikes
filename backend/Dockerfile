FROM maven:latest AS maven

COPY . .
RUN mvn package 

FROM openjdk:17-alpine

ARG JAR_FILE=target/*.jar

COPY --from=maven ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]