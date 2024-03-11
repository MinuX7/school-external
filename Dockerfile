#
# Build stage

FROM maven:3.9-eclipse-temurin-17-alpine AS Build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM amazoncorretto:17-al2-full
COPY --from=Build /home/app/target/externalschool*.jar /usr/local/lib/externalschool.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/externalschool.jar"]