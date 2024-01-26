# Upgraded Microservices Application

## Overview

This upgraded microservices application focuses on enhancing communication within the system, with the Employee Service now utilizing WebClient for interactions with the Department Service and Organization Service. To improve resilience, a retry mechanism has been implemented.

## Features

- **WebClient Integration:** Employee Service communicates with Department Service and Organization Service using WebClient, providing efficient and non-blocking communication.

- **Retry Mechanism:** A retry mechanism is incorporated in the Employee Service to automatically retry failed requests, ensuring robustness and improved reliability.

- **Microservices Architecture:** The application maintains a modular architecture, allowing for independent development and deployment of microservices.

- **Service Registry and Discovery:** Service Registry, powered by Netflix Eureka, facilitates seamless service registration and discovery within the microservices ecosystem.

- **Centralized Configuration:** Config Server manages externalized configurations, enabling easy configuration management and versioning.

- **API Gateway:** Centralized API entry point, provided by the API Gateway microservice, simplifies routing and request handling.

## Prerequisites

Before running the upgraded application, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Spring Boot version 3.0 or higher
- Docker installed and running (for RabbitMQ if used)
- Internet connectivity for fetching configurations and dependencies

## Setup

1. **Clone the repositories for each microservice:**

    ```bash
    git clone https://github.com/Shreeraksha1006/Springboot-microservice-projects.git
    ```

2. **Navigate to the respective project directories and build each microservice using Maven:**

    ```bash
    cd 5.SpringCloud Microservices Communication using WebClient with Retry/employee-service && mvn clean install
    cd 5.SpringCloud Microservices Communication using WebClient with Retry/department-service && mvn clean install
    cd 5.SpringCloud Microservices Communication using WebClient with Retry/organization-service && mvn clean install
    cd 5.SpringCloud Microservices Communication using WebClient with Retry/config-server && mvn clean install
    cd 5.SpringCloud Microservices Communication using WebClient with Retry/api-gateway && mvn clean install
    cd 5.SpringCloud Microservices Communication using WebClient with Retry/service-registry && mvn clean install
    ```

3. **Run each microservice in the following order:**

    - Config Server
    - Service Registry
    - Employee Service
    - Department Service
    - Organization Service
    - API Gateway

4. **Access the Eureka Dashboard:**

   Open a web browser and navigate to [http://localhost:8761](http://localhost:8761) to view the Eureka Server dashboard.

## WebClient and Retry Configuration

WebClient and retry settings for the Employee Service can be configured in the respective classes within the `employee-service` microservice. Adjust these configurations based on specific project requirements.
