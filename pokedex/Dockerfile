FROM openjdk:8-alpine

COPY target/uberjar/pokedex.jar /pokedex/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/pokedex/app.jar"]
