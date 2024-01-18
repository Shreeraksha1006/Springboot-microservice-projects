# Employee Service

## Overview

The Employee Service is a microservice designed to store and retrieve employee details from a database. The API documentation is available at [http://localhost:8081/swagger-ui/index.html]. The service's routes are configured using the API Gateway microservice. It is also registered with the Service Registry, hosted on the Service Registry microservice. Configuration parameters are externalized using a GitHub repository: [Employee Service Config](https://github.com/Shreeraksha1006/config-server-repo.git/employee-service.properties), and managed by the Spring Cloud Config Server. The service is integrated with the Spring Cloud Bus, using RabbitMQ for dynamic configuration updates.

## Features

- **Database Interaction:** The Employee Service efficiently stores and retrieves employee details from a database.

- **API Documentation:** Detailed API documentation is available at [http://localhost:8081/swagger-ui/index.html] for easy integration and testing.

- **API Gateway Integration:** Routes are configured using the API Gateway microservice, providing a centralized entry point to the microservices ecosystem.

- **Service Registry:** The Employee Service is registered with the Service Registry, allowing for service discovery and seamless communication with other microservices.

- **Externalized Configurations:** Configuration parameters are externalized to a GitHub repository, ensuring easy management and versioning. The Spring Cloud Config Server fetches and manages these configurations.

- **Spring Cloud Bus with RabbitMQ:** The service is integrated with Spring Cloud Bus, using RabbitMQ as the message broker. This integration allows for dynamic configuration updates across the microservices architecture.

## Prerequisites

Before running the Employee Service, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Springboot version 3.0 or higher
- Docker installed and running (for RabbitMQ)
- SQL scripts to be executed to create schemeas and tables
- Config-server application should be running.

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/Shreeraksha1006/employee-service.git
    ```

2. Navigate to the project directory:

    ```bash
    cd employee-service
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

## Configuration

- Configurations are externalized and managed by the Spring Cloud Config Server. The configuration repository is hosted on GitHub: [Employee Service Config](https://github.com/Shreeraksha1006/config-server-repo.git/employee-service.properties).

- The Spring Cloud Config Server should be properly configured to fetch configurations from the GitHub repository.

- Spring Cloud Bus with RabbitMQ is integrated for dynamic configuration updates.

## Running the Employee Service

1. Run RabbitMQ using Docker:

    ```bash
    docker run -d --name rabbitmq -p 5672:5672 rabbitmq:latest
    ```

2. Run the Employee Service:

    ```bash
    mvn spring-boot:run
    ```

3. Access the Swagger Documentation:

   Open a web browser and navigate to [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html) to view the API documentation.
