FROM openjdk:8
ADD target/order-creator-1145PM.jar /app/order-creator.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/app/order-creator.jar"]
