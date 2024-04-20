package com.employee.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.DepartmentDto;
import com.employee.dto.EmployeeDto;
import com.employee.dto.ResponseDto;
import com.employee.exception.ResourceNotFound;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;
	private ModelMapper modelMapper;
	private APIResponse apiResponse;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper, APIResponse apiResponse) {
		this.employeeRepository = employeeRepository;
		this.modelMapper = modelMapper;
		this.apiResponse = apiResponse;
	}

	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee employee = employeeRepository.save(modelMapper.map(employeeDto, Employee.class));
		return modelMapper.map(employee, EmployeeDto.class);
	}

	public ResponseDto findById(Long id) {
		Employee emp = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Employee", "id", id));
		DepartmentDto department = apiResponse.findUserByDepartmentCode(emp.getDepartmentCode());
		EmployeeDto employeeDto = modelMapper.map(emp, EmployeeDto.class);

		ResponseDto responseDto = new ResponseDto();
		responseDto.setDto(employeeDto);
		responseDto.setDto2(department);
		return responseDto;

	}

	public EmployeeDto findByAge(int age) {
		Employee employee = employeeRepository.findByAge(age);
		return modelMapper.map(employee, EmployeeDto.class);
	}

	public EmployeeDto findByDepartmentCode(String departmentCode) {
		Employee employee = employeeRepository.findByDepartmentCode(departmentCode);
		return modelMapper.map(employee, EmployeeDto.class);
	}

}
