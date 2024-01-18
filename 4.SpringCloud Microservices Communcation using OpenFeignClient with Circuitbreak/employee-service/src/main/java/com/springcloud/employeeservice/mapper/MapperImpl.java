package com.springcloud.employeeservice.mapper;


import com.springcloud.employeeservice.Dtos.EmployeeDto;
import com.springcloud.employeeservice.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class MapperImpl implements Mapper{
    @Override
    public Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getDepartmentCode(),
                employeeDto.getOrganizationCode());
    }

    @Override
    public EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartmentCode(),
                employee.getOrganizationCode());
    }
}
