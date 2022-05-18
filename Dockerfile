# ./mvnw package -Pnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true
# docker build . -t local/kogito-demo
# docker run -i --rm -p 8081:8080 local/kogito-demo
# Open http://localhost:8081/persons
FROM quay.io/quarkus/quarkus-micro-image:1.0
WORKDIR /work/
COPY target/*-runner /work/application
RUN chmod 775 /work
EXPOSE 8080
CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]