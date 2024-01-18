package com.springcloud.employeeservice.service;

import com.springcloud.employeeservice.Dtos.APIResponseDto;
import com.springcloud.employeeservice.Dtos.DepartmentDto;
import com.springcloud.employeeservice.Dtos.EmployeeDto;

public interface EmployeeService {
    public EmployeeDto save(EmployeeDto employeeDto);
    public APIResponseDto getById(Long id);
    //public DepartmentDto getDepartment(EmployeeDto employeeDto);
}
