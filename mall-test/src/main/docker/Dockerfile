FROM stand_jkd18:v1.0
VOLUME /app
ADD mall-test.jar app.jar
ENV JAVA_HOME /app/jdk18
ENV CLASSPATH $JAVA_HOME/jre/lib/rt.jar:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV PATH $PATH:$JAVA_HOME/bin
#RUN /bin/bash -c 'source /etc/profile'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080