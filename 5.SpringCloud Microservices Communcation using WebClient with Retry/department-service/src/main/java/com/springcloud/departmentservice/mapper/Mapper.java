package com.springcloud.departmentservice.mapper;

import com.springcloud.departmentservice.DepartmentDto.DepartmentDto;
import com.springcloud.departmentservice.entity.Department;

public interface Mapper {
    public Department mapToDepartment(DepartmentDto departmentDto);
    public DepartmentDto mapToDepartmentDto(Department department);
}
