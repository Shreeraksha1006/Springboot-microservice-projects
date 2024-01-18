package com.springcloud.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
		info = @Info(
				title = "Department service micro service",
				description = "This is department service",
				version = "1.0",
				contact = @Contact(
						name = "abc",
						url = "example.com",
						email = "abc@xyz.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "example.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				url = "swagger.org",
				description = "This is a swagger api fpr department service"
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
