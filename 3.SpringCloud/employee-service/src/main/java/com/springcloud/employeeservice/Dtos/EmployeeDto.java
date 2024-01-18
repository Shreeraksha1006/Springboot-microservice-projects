package com.springcloud.employeeservice.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor

    public class EmployeeDto {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String departmentCode;
        private String organizationCode;


        @Override
        public String toString() {
            return "EmployeeDto{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", departmentCode='" + departmentCode + '\'' +
                    '}';
        }
    }


