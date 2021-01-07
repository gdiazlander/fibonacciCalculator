FROM openjdk:8

ADD build/libs/*.jar calculatorfb.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","calculatorfb.jar" ]