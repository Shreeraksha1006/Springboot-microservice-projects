package com.springcloud.organizationservice.restcontroller;

import com.springcloud.organizationservice.dto.OrganizationDto;
import com.springcloud.organizationservice.entity.Organization;
import com.springcloud.organizationservice.service.OrganizationService;
import com.springcloud.organizationservice.service.OrganizationServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organization")
@AllArgsConstructor
public class OrganizationController {
private OrganizationService organizationService;
     @PostMapping
     public ResponseEntity<OrganizationDto> save(@RequestBody OrganizationDto dto) {
         System.out.println(dto);
         OrganizationDto dto1 = organizationService.save(dto);
         return new ResponseEntity<>(dto1, HttpStatus.CREATED);
     }
     @GetMapping("{code}")
        public ResponseEntity<OrganizationDto> getByCode(@PathVariable String code){
            OrganizationDto dto=organizationService.getByCode(code);
            return new ResponseEntity<>(dto,HttpStatus.OK);
         }

}
