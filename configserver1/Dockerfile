# Note that you need a build before running this Dockerfile

FROM openjdk:11.0.9-jre
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]