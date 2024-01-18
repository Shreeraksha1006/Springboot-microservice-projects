package com.springcloud.departmentservice.service;

import com.springcloud.departmentservice.DepartmentDto.DepartmentDto;
import com.springcloud.departmentservice.entity.Department;
import com.springcloud.departmentservice.mapper.MapperImpl;
import com.springcloud.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService{
    private DepartmentRepository departmentRepository;
    private MapperImpl mapper;
    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        Department department=mapper.mapToDepartment(departmentDto);
       Department savedDepartment= departmentRepository.save(department);
       DepartmentDto departmentDto1=mapper.mapToDepartmentDto(savedDepartment);
        return departmentDto1;
    }

    @Override
    public DepartmentDto getById(Long id) {
        Department department=departmentRepository.findById(id).get();
        DepartmentDto departmentDto1=mapper.mapToDepartmentDto(department);
        return departmentDto1;
    }

    @Override
    public List<DepartmentDto> getAll() {
        List<Department> departments=departmentRepository.findAll();
        List<DepartmentDto> departmentDtos=departments.stream().map((department) -> new DepartmentDto(department.getId(), department.getDepartmentName(), department.getDepartmentDescription(), department.getDepartmentCode())).toList();
        return departmentDtos;
    }

    @Override
    public DepartmentDto getByDepartmentCode(String departmentCode) {
        Department department=departmentRepository.findByDepartmentCode(departmentCode);
        return  mapper.mapToDepartmentDto(department);
    }
}
