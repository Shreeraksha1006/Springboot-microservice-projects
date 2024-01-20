# ConfigServer Application

## Overview

The ConfigServer application serves as a central configuration server for other microservices in your system. It connects to a GitHub repository ([Config Server Repo](https://github.com/Shreeraksha1006/config-server-repo.git)) to fetch externalized configurations for microservices.

## Features

- **Centralized Configuration:** The ConfigServer application provides a centralized location for managing and externalizing configuration properties for microservices.

- **GitHub Integration:** Configurations are stored in a GitHub repository ([Config Server Repo](https://github.com/Shreeraksha1006/config-server-repo.git)). Any changes to configuration files trigger automatic updates for microservices.

## Prerequisites

Before running the ConfigServer application, ensure the following prerequisites are met:

- Java (JDK) version 17.0 or higher
- Spring Boot version 3.0 or higher
- Internet connectivity to fetch configurations from the GitHub repository

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/Shreeraksha1006/Springboot-microservice-projects.git
    ```

2. Navigate to the project directory:

    ```bash
    cd 3.SpringCloud/config-server
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

## Configuration

- Configurations for microservices are stored in the GitHub repository: [Config Server Repo](https://github.com/Shreeraksha1006/config-server-repo).
  Clone the below repository and host in your own repository.
  git clone https://github.com/Shreeraksha1006/Springboot-microservice-projects.githttps://github.com/Shreeraksha1006/config-server-repo.git


## Running the ConfigServer Application

1. Run the ConfigServer application:

    ```bash
    mvn spring-boot:run
    ```

2. Access the ConfigServer endpoint:

   Open a web browser and navigate to [http://localhost:8888](http://localhost:8888/<microservice-name>/default) to view the ConfigServer dashboard.

