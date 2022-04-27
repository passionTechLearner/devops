FROM amazoncorretto:11-alpine-jdk
MAINTAINER tech.com
COPY target/coolsprings-0.0.1-SNAPSHOT.jar coolsprings-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/coolsprings-0.0.1-SNAPSHOT.jar"]