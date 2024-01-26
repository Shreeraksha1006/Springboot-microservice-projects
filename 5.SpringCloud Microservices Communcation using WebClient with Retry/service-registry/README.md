# Service Registry Application

## Overview

The Service Registry application is hosted on Netflix Eureka Server and provides service registry and discovery for various microservices in your ecosystem. It registers and enables discovery for the Employee Service, Department Service, Organization Service, Config Service, and API Gateway Service.

## Features

- **Netflix Eureka Server:** The application is hosted as a Netflix Eureka Server, offering service registry and discovery capabilities.

- **Service Registration:** Microservices, including Employee Service, Department Service, Organization Service, Config Service, and API Gateway Service, register themselves with the Service Registry.

- **Service Discovery:** Microservices can discover and communicate with each other through the Service Registry.

## Prerequisites

Before running the Service Registry application, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Spring Boot version 3.0 or higher

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/Shreeraksha1006/Springboot-microservice-projects.git
    ```

2. Navigate to the project directory:

    ```bash
    cd 3.SpringCloud/service-registry
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

## Running the Service Registry Application

1. Run the Service Registry application:

    ```bash
    mvn spring-boot:run
    ```

2. Access the Eureka Dashboard:

   Open a web browser and navigate to [http://localhost:8761](http://localhost:8761) to view the Eureka Server dashboard.

## Registered Microservices

The following microservices are registered with the Service Registry:

- **Employee Service**
- **Department Service**
- **Organization Service**
- **Config Service**
- **API Gateway Service**


