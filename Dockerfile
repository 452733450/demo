FROM java:8

EXPOSE 7001

ADD demo-0.0.1-SNAPSHOT.jar zex-rpp.jar

ENTRYPOINT ["java", "-jar", "/zex-rpp.jar"]
