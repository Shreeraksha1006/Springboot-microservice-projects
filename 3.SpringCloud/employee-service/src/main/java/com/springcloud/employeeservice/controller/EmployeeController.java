package com.springcloud.employeeservice.controller;


import com.springcloud.employeeservice.Dtos.APIResponseDto;
import com.springcloud.employeeservice.Dtos.EmployeeDto;
import com.springcloud.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/employees")
@AllArgsConstructor

public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto employeeDto) {

        EmployeeDto employeeDto1 = employeeService.save(employeeDto);
        return new ResponseEntity<>(employeeDto1, HttpStatus.CREATED);
    }

@GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable("id") Long id) {
    EmployeeDto employeeDto= employeeService.getById(id);
    return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

}
