# Kafka test project
In this repo, you're going to find code related to my apache kafka learning path.

### Before launching up the application
In this case, I'm using docker for setting up the kafka cluster (kafka + zookeeper), the configuration is done through
docker-compose.yml file so before launching up the application, you have to execute:  
`docker-compose up`  
(and having installed docker and docker-compose on your machine)

### Launch the App
To Launch the App you can use 
`mvnw spring-boot:run`

### REST services exposed
This Application exposes a very simple REST service so that, to test the message 
sender, you have to make a PUT call to _http://localhost:8080/kafka_
