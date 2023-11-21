
#
# Build Artifact
#
FROM maven:3.8.7-amazoncorretto-17 AS build
LABEL authors="papa-arthhur"
WORKDIR /home/app
COPY src src
COPY pom.xml .
RUN mvn clean package

#
# Package Artifact
#
FROM amazoncorretto:17-alpine3.16-full
WORKDIR /home/app
COPY --from=build target/*.jar /usr/local/lib/talent-safari-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/talent-safari-api.jar"]