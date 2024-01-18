package com.springcloud.employeeservice.service.webclient;

import com.springcloud.employeeservice.Dtos.DepartmentDto;
import com.springcloud.employeeservice.Dtos.EmployeeDto;
import com.springcloud.employeeservice.Dtos.OrganizationDto;
import com.springcloud.employeeservice.service.EmployeeServiceImpl;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RetryClass {
    private static final Logger LOGGER= LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    @Qualifier("DepartmentService")
    private WebClient webclient1;
    @Autowired
    @Qualifier("OrganizationService")
    private WebClient webclient2;
    @Retry(name="${spring.application.name}", fallbackMethod="getDefaultDepartment")
    public DepartmentDto getDepartment(EmployeeDto employeeDto) {
        //Calling department microservice
        LOGGER.info("Inside getDepartment");
        return webclient1.get()
                .uri("/api/departments/code/" + employeeDto.getDepartmentCode())
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();

    }
     @Retry(name="${spring.application.name}", fallbackMethod="getDefaultOrganization")
    public OrganizationDto getOrganization(EmployeeDto employeeDto) {
        LOGGER.info("Inside getOrganization");
        //Calling organization microservice
        return webclient2.get()
                .uri("/api/organization/" + employeeDto.getOrganizationCode())
                .retrieve()
                .bodyToMono(OrganizationDto.class)
                .block();
    }


    public DepartmentDto getDefaultDepartment(EmployeeDto dto,Exception exception) {
        LOGGER.info("Inside default department");
        DepartmentDto departmentDto=new DepartmentDto();
        departmentDto.setDepartmentName("R&D");
        departmentDto.setDepartmentCode("RAD001");
        departmentDto.setDepartmentDescription("This is default");
        return departmentDto;
    }
    public OrganizationDto getDefaultOrganization(EmployeeDto dto,Exception exception) {
        LOGGER.info("Inside default organization");
        OrganizationDto organizationDto=new OrganizationDto();
        organizationDto.setOrganizationName("EAS");
        organizationDto.setOrganizationCode("RAD001");
        organizationDto.setOrganizationDescription("This is default");
        return organizationDto;
    }
}
