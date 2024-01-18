package com.springcloud.departmentservice.repository;

import com.springcloud.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
public Department findByDepartmentCode(String departmentCode);
//The above is equivalent to
// findBy ~ select * from Department
// DepartmentCode ~ where department_code=departmentCode
}
