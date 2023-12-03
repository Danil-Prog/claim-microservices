FROM openjdk:17-jdk-slim
ADD target/claim-user-*.*.jar claim-user-application.jar
ENTRYPOINT ["java", "-jar", "/claim-user-application.jar"]