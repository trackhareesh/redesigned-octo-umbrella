FROM openjdk:8-jre-alpine
#RUN addgroup --system spring && adduser --system --ingroup spring spring
#USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
