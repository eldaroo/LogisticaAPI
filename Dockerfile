FROM openjdk:17
WORKDIR /
ADD target/Logistic-0.0.1-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT [ "java", "-Dspring.profiles.active=mysql", "-jar", "/Logistic-0.0.1-SNAPSHOT.jar"]
