FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/aws-ebs-1.0.0.jar
COPY ${JAR_FILE} uct.jar
RUN mkdir /var/tmp/logs
EXPOSE 8090
ENTRYPOINT ["java","-jar","/uct.jar"]
