# Kafka Example

Aplicação Spring Boot que permite o envio de mensagem através de uma API REST para um tópico
e posteriormente realiza o consumo dessa mensagem.

## Requisitos

* Java 16+
* Apache Kafka

## Como testar

1) ./bin/zookeeper-server-start.sh config/zookeeper.properties
2) ./bin/kafka-server-start.sh config/server.properties
3) Executar a API:
   POST http://localhost:8080/api/v1/messages
   Content-Type: application/json

{
"message": "Test Message for API"
}
