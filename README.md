# order-details-service
The purpose of that microservice is to present OpenFeign integration for Spring Boot apps.
Spring Cloud OpenFeign is a declarative REST client which simplifies the communication between our producer and consumer services. </br>
My consumer service https://github.com/szintia/order-service will consume the service of the producer side: order-details-service. </br>
Order-details-service validates the orders before persisting those into DB/Kafka topic.

My additional plan to add service discovery and load balacing with Netflix Eureka and Consul.
