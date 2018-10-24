FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ARG JAR_FILE
ARG PROXY_SERVERS
ARG PORT
ADD target/${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom ${PROXY_SERVERS}","-jar","/app.jar"]
EXPOSE ${PORT}