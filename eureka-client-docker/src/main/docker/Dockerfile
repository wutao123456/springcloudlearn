FROM frolvlad/alpine-oraclejdk8:latest
VOLUME /tmp
ADD eureka-client-docker-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 9004

#mvn clean package docker:build