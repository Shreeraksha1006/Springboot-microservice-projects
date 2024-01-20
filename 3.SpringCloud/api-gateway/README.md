# API Gateway Application

## Overview

The API Gateway application serves as the central entry point for the microservices ecosystem. It provides routes to the Employee Service, Department Service, and Organization Service. The application is registered with a Service Registry using Netflix Eureka Server. Externalized configurations are fetched from GitHub using the Config Server.

## Features

- **Centralized Routing:** The API Gateway manages and provides routes to the Employee Service, Department Service, and Organization Service.

- **Service Registry Integration:** The application is registered with a Service Registry using Netflix Eureka Server, enabling service discovery and dynamic routing.

- **Externalized Configurations:** Configurations for the API Gateway are externalized and managed by the Config Server. The configurations are stored in a GitHub repository.

## Prerequisites

Before running the API Gateway application, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Spring Boot version 3.0 or higher
- Netflix Eureka Server running for Service Registry
- Config Server application running to provide externalized configurations
- Internet connectivity to fetch configurations from the GitHub repository

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/Shreeraksha1006/Springboot-microservice-projects.git
    ```

2. Navigate to the project directory:

    ```bash
    cd 3.SpringCloud/api-gateway
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

## Configuration

- Configurations for the API Gateway are stored in a GitHub repository: [Config Server Repo](https://github.com/Shreeraksha1006/config-server-repo.git)).

- Ensure that the Config Server is properly configured to fetch configurations from the GitHub repository.

## Running the API Gateway Application

1. Ensure Netflix Eureka Server is running.

2. Ensure the Config Server is running.

3. Run the API Gateway application:

    ```bash
    mvn spring-boot:run
    ```

4. Access the Eureka Dashboard:

   Open a web browser and navigate to [http://localhost:8761](http://localhost:8761) to view the Eureka Server dashboard.

5. Access the API Gateway routes:

   Open a web browser and navigate to the configured routes, e.g. [http://localhost:8761/employee](http://localhost:8761/employee).


