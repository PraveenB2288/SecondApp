FROM openjdk:18
ADD target/springboot-first-0.0.1-SNAPSHOT.jar springboot-first.jar
ENTRYPOINT ["java","-jar","springboot-first.jar"]