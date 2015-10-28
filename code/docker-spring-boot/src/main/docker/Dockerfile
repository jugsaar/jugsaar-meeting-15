FROM java:8

VOLUME /tmp

ADD @project.build.finalName@.jar app.jar

RUN bash -c 'touch /app.jar'

EXPOSE 8080 42424

#configure JRE to use a non-blocking entropy source see: http://wiki.apache.org/tomcat/HowTo/FasterStartUp#Entropy_Source
ENTRYPOINT [ \
   "java" \
  ,"-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=42424" \
  ,"-Djava.security.egd=file:/dev/./urandom" \
  ,"-jar" \
  ,"/app.jar" \
  ]
