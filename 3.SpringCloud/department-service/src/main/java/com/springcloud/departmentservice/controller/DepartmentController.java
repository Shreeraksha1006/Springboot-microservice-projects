package com.springcloud.departmentservice.controller;

import com.springcloud.departmentservice.DepartmentDto.DepartmentDto;
import com.springcloud.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("api/departments"))
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody  DepartmentDto departmentDto){
       DepartmentDto savedDepartment = departmentService.save(departmentDto);
       return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

  @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getById(@PathVariable("id") Long id){
        DepartmentDto departmentDto=departmentService.getById(id);
      return new ResponseEntity<>(departmentDto, HttpStatus.OK);
  }
    @GetMapping()
    public ResponseEntity<List<DepartmentDto>> getAll(){
        List<DepartmentDto> departmentDtos=departmentService.getAll();
        return new ResponseEntity<>(departmentDtos, HttpStatus.OK);
    }
    @GetMapping("/code/{code}")
    public ResponseEntity<DepartmentDto> getByDepartmentCode(@PathVariable("code") String departmentCode){
        DepartmentDto departmentDto=departmentService.getByDepartmentCode(departmentCode);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }


}
