package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Employee;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findByAge(int age);

	Employee findByDepartmentCode(String departmentCode);


}
