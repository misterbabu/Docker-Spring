FROM openjdk:8
EXPOSE 2222
ADD target/DockerTest-1.0-SNAPSHOT.jar docker-test.jar
ENTRYPOINT ["java","-jar","/docker-test.jar"]