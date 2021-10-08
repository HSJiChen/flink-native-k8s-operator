FROM openjdk:8-jdk-slim-buster

COPY target/flink-native-k8s-operator-2.1.3-SNAPSHOT.jar /

CMD ["java", "-jar", "/flink-native-k8s-operator-2.1.3-SNAPSHOT.jar"]