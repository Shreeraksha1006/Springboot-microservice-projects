# Microservices Application

## Overview

This microservices application is a comprehensive system composed of multiple services that collectively handle employee details, department information, organization data, configuration management, API routing, and service discovery. The services include:

- **Employee Service:** Manages storage and retrieval of employee details from a database.

- **Department Service:** Handles operations related to department information.

- **Organization Service:** Deals with organizational data.

- **Config Server:** Centralized configuration management for microservices.

- **API Gateway Service:** Provides a unified entry point for API routing.

- **Service Registry:** Hosted on Netflix Eureka Server, offers service registry and discovery.

## Features

- **Microservices Architecture:** Utilizes a modular architecture with independent microservices.

- **Service Registry and Discovery:** Service Registry powered by Netflix Eureka allows seamless service registration and discovery.

- **Centralized Configuration:** Config Server manages externalized configurations for all microservices.

- **API Gateway:** Centralized API entry point simplifying routing and request handling.

## Prerequisites

Before running the application, ensure the following prerequisites are met:

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
    cd 3.SpringCloud/employee-service && mvn clean install
    cd 3.SpringCloud/department-service && mvn clean install
    cd 3.SpringCloud/organization-service && mvn clean install
    cd 3.SpringCloud/config-server && mvn clean install
    cd 3.SpringCloud/api-gateway && mvn clean install
    cd 3.SpringCloud/service-registry && mvn clean install
    ```

3. Run each microservice in the following order:

    - Config Server
    - Service Registry
    - Employee Service
    - Department Service
    - Organization Service
    - API Gateway

4. Access the Eureka Dashboard:

   Open a web browser and navigate to [http://localhost:8761](http://localhost:8761/eurekha) to view the Eureka Server dashboard.

