package com.springcloud.departmentservice.mapper;

import com.springcloud.departmentservice.DepartmentDto.DepartmentDto;
import com.springcloud.departmentservice.entity.Department;
import org.springframework.stereotype.Component;

@Component
public class MapperImpl implements Mapper{
    @Override
    public Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentCode());
    }

    @Override
    public DepartmentDto mapToDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentName(),
                department.getDepartmentCode());
    }
}
