package com.springcloud.employeeservice.controller;


import com.springcloud.employeeservice.Dtos.APIResponseDto;
import com.springcloud.employeeservice.Dtos.EmployeeDto;
import com.springcloud.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/employees")
@AllArgsConstructor

public class EmployeeController {
    @Qualifier("WebClient")
    private EmployeeService employeeService;
    @Qualifier("FeignClient")
    private EmployeeService employeeService1;
    @PostMapping
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto employeeDto) {

        EmployeeDto employeeDto1 = employeeService.save(employeeDto);
        return new ResponseEntity<>(employeeDto1, HttpStatus.CREATED);
    }

@GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getById(@PathVariable("id") Long id) {
    APIResponseDto apiResponseDto1= employeeService.getById(id);
    return new ResponseEntity<>(apiResponseDto1, HttpStatus.OK);
    }

}
