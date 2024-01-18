package com.springcloud.employeeservice.service;

import com.springcloud.employeeservice.Dtos.APIResponseDto;
import com.springcloud.employeeservice.Dtos.DepartmentDto;
import com.springcloud.employeeservice.Dtos.EmployeeDto;
import com.springcloud.employeeservice.entity.Employee;
import com.springcloud.employeeservice.mapper.MapperImpl;
import com.springcloud.employeeservice.repository.EmployeeRepository;
import com.springcloud.employeeservice.Dtos.OrganizationDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    MapperImpl mapper = new MapperImpl();

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = mapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return mapper.mapToEmployeeDto(savedEmployee);
    }


    @Override
    public EmployeeDto getById(Long id) {
        LOGGER.info("Inside getEmployee");
        Employee employee = employeeRepository.findById(id).get();
        EmployeeDto employeeDto = mapper.mapToEmployeeDto(employee);
        return employeeDto;
    }
}
