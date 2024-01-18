package com.springcloud.employeeservice.service.openfeign;

import com.springcloud.employeeservice.Dtos.DepartmentDto;
import com.springcloud.employeeservice.Dtos.EmployeeDto;
import com.springcloud.employeeservice.Dtos.OrganizationDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ORGANIZATION-SERVICE")
public interface OrganizationFeignClient {
    static final Logger LOGGER= LoggerFactory.getLogger(EmployeeServiceImpl.class);
    //Openfeign library will dynamically create implementation for this interface
    @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultOrganization")
    @GetMapping("api/organizations/code/{code}")
    public OrganizationDto getByCode(@PathVariable("code") String organizationCode);

    default public OrganizationDto getDefaultOrganization(String code, Exception exception) {
        LOGGER.info("Inside default organization");
        OrganizationDto organizationDto=new OrganizationDto();
        organizationDto.setOrganizationName("EAS");
        organizationDto.setOrganizationCode("RAD001");
        organizationDto.setOrganizationDescription("This is default");
        return organizationDto;
    }
}
