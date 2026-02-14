FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew
RUN ./gradlew build

EXPOSE 10000

CMD ["java", "-jar", "build/libs/stock-calculator-0.0.1-SNAPSHOT.jar"]
