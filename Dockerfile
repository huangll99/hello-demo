FROM 10.3.10.131:5000/java:8-jre

MAINTAINER huangll99@126.com
ADD target/hello-demo-1.0.0.Release.jar /app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
