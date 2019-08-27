FROM maven:3-jdk-11-slim AS build

ADD settings.xml /root/.m2/settings.xml
ADD . /code
WORKDIR /code
RUN mvn clean package

FROM openjdk:11-slim

COPY --from=build /code/rewards-web/target/sampleset-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app

EXPOSE 8080
EXPOSE 8787

CMD java ${DEBUG_CONFIG} -jar sampleset-0.0.1-SNAPSHOT.jar
