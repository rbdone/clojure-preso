FROM openjdk:8-alpine

COPY target/uberjar/my-web.jar /my-web/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/my-web/app.jar"]
