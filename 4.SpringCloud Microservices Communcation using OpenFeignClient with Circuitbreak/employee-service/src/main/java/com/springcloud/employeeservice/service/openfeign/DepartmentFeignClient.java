package com.springcloud.employeeservice.service.openfeign;

import com.springcloud.employeeservice.Dtos.DepartmentDto;
import com.springcloud.employeeservice.Dtos.OrganizationDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8083" , value ="DEPARTMENT-SERVICE")
//Modified for load balancing

@FeignClient(name = "DEPARTMENT-SERVICE")
public interface DepartmentFeignClient {
    //Openfeign library will dynamically create implementation for this interface
     static final Logger LOGGER= LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @GetMapping("api/departments/code/{code}")
    public DepartmentDto getByDepartmentCode(@PathVariable("code") String departmentCode);

    default public DepartmentDto getDefaultDepartment(String code, Exception exception) {
        LOGGER.info("Inside default organization");
        DepartmentDto departmentDto=new DepartmentDto();
        departmentDto.setDepartmentName("EAS");
        departmentDto.setDepartmentCode("RAD001");
        departmentDto.setDepartmentDescription("This is default");
        return departmentDto;
    }
}

