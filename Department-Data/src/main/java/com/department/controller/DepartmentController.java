package com.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.dto.DepartmentDto;
import com.department.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	private DepartmentService departmentService;

	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@PostMapping("/save")
	public ResponseEntity<DepartmentDto> saveDept(@Valid @RequestBody DepartmentDto departmentDto) {
		return new ResponseEntity<DepartmentDto>(departmentService.saveDepartment(departmentDto), HttpStatus.CREATED);
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<DepartmentDto> findUserById(@PathVariable Long id) {
		return new ResponseEntity<DepartmentDto>(departmentService.findUserById(id), HttpStatus.OK);
	}

	@GetMapping("/findByDepartmentCode/{departmentCode}")
	public ResponseEntity<DepartmentDto> findUserByDepartmentCode(@PathVariable String departmentCode) {
		return new ResponseEntity<DepartmentDto>(departmentService.findUserByDepartmentCode(departmentCode),
				HttpStatus.OK);
	}

}
