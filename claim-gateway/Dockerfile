FROM openjdk:17-jdk-slim
ADD target/claim-gateway-*.*.jar claim-application.jar
ENTRYPOINT ["java", "-jar", "/claim-application.jar"]