package com.springcloud.departmentservice.service;

import com.springcloud.departmentservice.DepartmentDto.DepartmentDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    public DepartmentDto save(DepartmentDto departmentDto);
    public DepartmentDto getById(Long id);
    public List<DepartmentDto> getAll();
    public DepartmentDto getByDepartmentCode(String departmentCode);
}
