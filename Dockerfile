From openjdk:8
ADD target/kube201-0.0.1.jar kube201-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "kube201-0.0.1.jar"]