# Employee Service

## Overview

The Employee Service is a microservice in the upgraded application that communicates with the Department Service and Organization Service using OpenFeign. It also incorporates a circuit breaker pattern to enhance fault tolerance and prevent cascading failures.

## Features

- **OpenFeign Integration:** Utilizes OpenFeign for seamless communication with the Department Service and Organization Service, simplifying microservices interactions.

- **Circuit Breaker:** Implements a circuit breaker pattern to handle potential failures gracefully, providing fault tolerance and preventing cascading failures.

- **Microservices Architecture:** Part of a modular architecture with independent microservices.

- **Service Registry and Discovery:** Registered with a Service Registry powered by Netflix Eureka for seamless service registration and discovery.

- **Centralized Configuration:** Externalized configurations are managed by the Config Server.

## Prerequisites

Before running the Employee Service, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Spring Boot version 3.0 or higher
- Docker installed and running (for RabbitMQ if used)
- Internet connectivity for fetching configurations and dependencies

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/Shreeraksha1006/Springboot-microservice-projects.git
    ```

2. Navigate to the project directory:

    ```bash
    cd 4.SpringCloud Microservices Communcation using OpenFeignClient with Circuitbreak/employee-service
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

## WebClient and Retry Configuration

- WebClient is configured in the `EmployeeServiceApplication` class. Check the `employee-service.properties` file for WebClient-specific configurations.

- Retry settings can be adjusted in the `employee-service.properties` class. Fine-tune the retry behavior based on your specific requirements.

## Running the Employee Service

1. Ensure that the Config Server and Service Registry are running.

2. Run the Employee Service:

    ```bash
    mvn spring-boot:run
    ```

3. Access the Eureka Dashboard:

   Open a web browser and navigate to [http://localhost:8761](http://localhost:8761) to view the Eureka Server dashboard.

4. Access the Swagger Documentation:

   Open a web browser and navigate to [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html) to view the API documentation.
