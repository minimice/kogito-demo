Quarkus guide: https://quarkus.io/guides/kogito

Guide
- https://quarkus.pro/guides/kogito.html

Requirements
- Graalvm https://www.graalvm.org/downloads/
- Maven
- Java

Env variables
- GRAALVM_HOME=/opt/graalvm-ce-java11-22.1.0/Contents/Home
- PATH=/opt/jdk-11.0.15.jdk/Contents/Home/Bin:/opt/apache-maven-3.8.5/bin:/opt/graalvm-ce-java11-22.1.0/Contents/Home/bin
- JAVA_HOME=/opt/jdk-11.0.15.jdk/Contents/Home

Test cases
`curl -X POST http://localhost:8080/persons     -H 'content-type: application/json'     -H 'accept: application/json'     -d '{"person": {"name":"Marcus John Quark", "age": 25}}'`

`curl -X POST http://localhost:8080/persons     -H 'content-type: application/json'     -H 'accept: application/json'     -d '{"person": {"name":"Marcus John Quark", "age": 15}}'`

`curl -X POST http://localhost:8080/persons     -H 'content-type: application/json'     -H 'accept: application/json'     -d '{"person": {"name":"Cherry Jones", "age": 15}}'`

`
curl -X GET http://localhost:8080/persons \
    -H 'content-type: application/json' \
    -H 'accept: application/json'
`

`http://localhost:8080/persons`
`http://localhost:8080/persons/3dfdef60-4913-408e-a795-2a7c5ceef378/tasks`
`http://localhost:8080/persons/3dfdef60-4913-408e-a795-2a7c5ceef378/ChildrenHandling/f8dca8fd-02ff-427b-ac8b-aa7870472321`

`
curl -X POST http://localhost:8080/persons/3dfdef60-4913-408e-a795-2a7c5ceef378/ChildrenHandling/f8dca8fd-02ff-427b-ac8b-aa7870472321 \
    -H 'content-type: application/json' \
    -H 'accept: application/json' \
    -d '{}'
`

- Building docker image  
https://quarkus.io/guides/building-native-image

- Building commands
./mvnw package -Pnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true  
#-Dquarkus.container-image.name=local/kogito-demo -Dquarkus.container-image.tag=latest -Dquarkus.container-image.builder=docker

- Task management  
https://blog.kie.org/2021/09/manage-processes-and-tasks-using-kogito-consoles.html

- Dockerhub link  
minimice/kogito-demo