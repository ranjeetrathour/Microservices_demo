package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDto;
import com.employee.dto.ResponseDto;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/")
	public String home() {
		System.out.println("hasgdjaghj");
		return "hello";
	}
	
	@PostMapping("/save")
	public ResponseEntity<EmployeeDto> saveEmp(@Valid @RequestBody EmployeeDto employee){
		return new ResponseEntity<EmployeeDto>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<ResponseDto> getById(@PathVariable Long id){
		return new ResponseEntity<ResponseDto>(employeeService.findById(id), HttpStatus.OK);
	}
	

	@GetMapping("/getByAge/{age}")
	public ResponseEntity<EmployeeDto> getByAge(@PathVariable int age){
		return new ResponseEntity<EmployeeDto>(employeeService.findByAge(age), HttpStatus.OK);
	}
	
	@GetMapping("/getDepartmentCode/{departmentCode}")
	public ResponseEntity<EmployeeDto> findByDepartmentCode(@PathVariable String departmentCode){
		return new ResponseEntity<EmployeeDto>(employeeService.findByDepartmentCode(departmentCode), HttpStatus.OK);
	}
}
