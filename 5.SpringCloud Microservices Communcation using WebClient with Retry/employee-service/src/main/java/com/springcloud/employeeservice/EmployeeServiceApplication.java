package com.springcloud.employeeservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.web.reactive.function.client.WebClient;
import java.lang.String;
import java.time.Duration;


@SpringBootApplication
@EnableFeignClients
@AllArgsConstructor
public class EmployeeServiceApplication {

	@Value("${spring.department.host}")
	private String departmentHost;
	@Value("${spring.organization.host}")
	private String organizationHost;
	@Bean
	@Qualifier("DepartmentService")
	public WebClient webclientA() {
		return WebClient.builder().baseUrl(departmentHost).build();
	}
	@Bean
	@Qualifier("OrganizationService")
	public WebClient webclientB(){

		return WebClient.builder().baseUrl(organizationHost).build();
	}

	public EmployeeServiceApplication(){}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
