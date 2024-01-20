# organization Service

## Overview

The organization Service is a microservice designed to store and retrieve organization details from a database. The API documentation is available [here](http://localhost:8084/swagger-ui/index.html). The service's routes are configured using the API Gateway microservice, and it's registered with the Service Registry hosted on the Service Registry microservice. Configuration parameters are externalized using a GitHub repository: [organization Service Config](https://github.com/Shreeraksha1006/config-server-repo.git/organization-service.properties), and managed by the Spring Cloud Config Server. The service is integrated with the Spring Cloud Bus, using RabbitMQ for dynamic configuration updates.

## Features

- **Database Interaction:** The organization Service efficiently stores and retrieves organization details from a database.

- **API Documentation:** Detailed API documentation is available [here](http://localhost:8084/swagger-ui/index.html) for easy integration and testing.

- **API Gateway Integration:** Routes are configured using the API Gateway microservice, providing a centralized entry point to the microservices ecosystem.

- **Service Registry:** The organization Service is registered with the Service Registry, allowing for service discovery and seamless communication with other microservices.

- **Externalized Configurations:** Configuration parameters are externalized to a GitHub repository, ensuring easy management and versioning. The Spring Cloud Config Server fetches and manages these configurations.

- **Spring Cloud Bus with RabbitMQ:** The service is integrated with Spring Cloud Bus, using RabbitMQ as the message broker. This integration allows for dynamic configuration updates across the microservices architecture.

## Prerequisites

Before running the organization Service, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Spring Boot version 3.0 or higher
- Docker installed and running (for RabbitMQ)
- SQL scripts to be executed to create schemas and tables
- Config server should be running.
- Service Registry should be running
- API Gateway should be running to use routing functionality.

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/Shreeraksha1006/Springboot-microservice-projects.git
    ```

2. Navigate to the project directory:

    ```bash
    cd 3.SpringCloud/organization-service
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

## Configuration

- Configurations are externalized and managed by the Spring Cloud Config Server. The configuration repository is hosted on GitHub: [organization Service Config](https://github.com/Shreeraksha1006/config-server-repo.git).
  File: `organization-service.properties`

- The Spring Cloud Config Server should be properly configured to fetch configurations from the GitHub repository.

- Spring Cloud Bus with RabbitMQ is integrated for dynamic configuration updates. It can be accessed with the following endpoint: [http://localhost:8084/actuator/busrefresh](http://localhost:8084/actuator/busrefresh).

## Running the organization Service

1. Run RabbitMQ using Docker:

    ```bash
    docker run -d --name rabbitmq -p 5672:5672 rabbitmq:latest
    ```

2. Run the organization Service:

    ```bash
    mvn spring-boot:run
    ```

3. Access the Swagger Documentation:

   Open a web browser and navigate to [http://localhost:8084/swagger-ui/index.html](http://localhost:8084/swagger-ui/index.html) to view the API documentation.
