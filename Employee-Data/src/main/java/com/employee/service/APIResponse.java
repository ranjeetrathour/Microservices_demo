package com.employee.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.dto.DepartmentDto;

@FeignClient(url = "http://localhost:8081", name = "Department-Data")
public interface APIResponse {

	@GetMapping("/dept/findByDepartmentCode/{departmentCode}")
	DepartmentDto findUserByDepartmentCode(@PathVariable String departmentCode);
}
