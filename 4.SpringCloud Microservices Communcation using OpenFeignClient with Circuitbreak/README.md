# Upgraded Microservices Application

## Overview

This upgraded microservices application builds upon the previous version by introducing OpenFeign for communication between the Employee Service, Department Service, and Organization Service. Additionally, a circuit breaker is implemented to enhance the system's resilience.

## Features

- **OpenFeign Integration:** Employee Service communicates with Department Service and Organization Service using OpenFeign, simplifying microservices interactions.

- **Circuit Breaker:** A circuit breaker pattern is applied to handle potential failures gracefully, providing fault tolerance and preventing cascading failures.

- **Microservices Architecture:** Utilizes a modular architecture with independent microservices.

- **Service Registry and Discovery:** Service Registry powered by Netflix Eureka allows seamless service registration and discovery.

- **Centralized Configuration:** Config Server manages externalized configurations for all microservices.

- **API Gateway:** Centralized API entry point simplifying routing and request handling.

## Prerequisites

Before running the upgraded application, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Spring Boot version 3.0 or higher
- Docker installed and running (for RabbitMQ if used)
- Internet connectivity for fetching configurations and dependencies

## Setup

1. Clone the repositories for each microservice:

    ```bash
   https://github.com/Shreeraksha1006/Springboot-microservice-projects.git
    ```

2. Navigate to the respective project directories and build each microservice using Maven:

    ```bash
    cd 4.SpringCloud Microservices Communcation using OpenFeignClient with Circuitbreak/employee-service && mvn clean install
    cd 4.SpringCloud Microservices Communcation using OpenFeignClient with Circuitbreak/epartment-service && mvn clean install
    cd 4.SpringCloud Microservices Communcation using OpenFeignClient with Circuitbreak/organization-service && mvn clean install
    cd 4.SpringCloud Microservices Communcation using OpenFeignClient with Circuitbreak/config-server && mvn clean install
    cd 4.SpringCloud Microservices Communcation using OpenFeignClient with Circuitbreak/api-gateway && mvn clean install
    cd 4.SpringCloud Microservices Communcation using OpenFeignClient with Circuitbreak/service-registry && mvn clean install
    ```

3. Run each microservice in the following order:

    - Config Server
    - Service Registry
    - Employee Service
    - Department Service
    - Organization Service
    - API Gateway

4. Access the Eureka Dashboard:

   Open a web browser and navigate to [http://localhost:8761](http://localhost:8761) to view the Eureka Server dashboard.

## Circuit Breaker Configuration

The circuit breaker is configured in the `employee-service` microservice. The relevant properties can be found in the `employee-service.properties` file.


