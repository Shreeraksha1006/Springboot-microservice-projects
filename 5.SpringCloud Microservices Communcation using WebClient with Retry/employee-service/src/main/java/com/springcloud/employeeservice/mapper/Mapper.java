package com.springcloud.employeeservice.mapper;


import com.springcloud.employeeservice.Dtos.EmployeeDto;
import com.springcloud.employeeservice.entity.Employee;

public interface Mapper {
    public Employee  mapToEmployee(EmployeeDto employeeDto);
    public EmployeeDto mapToEmployeeDto(Employee employee);
}
