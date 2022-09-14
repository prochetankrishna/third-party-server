FROM adoptopenjdk/openjdk11:latest

COPY target/*.jar third-party-application.jar
COPY src/main/resources/application.properties application.properties

EXPOSE 8095

CMD ["java", "-jar", "third-party-application.jar"]
