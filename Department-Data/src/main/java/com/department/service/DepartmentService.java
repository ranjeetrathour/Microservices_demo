package com.department.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.dto.DepartmentDto;
import com.department.model.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	private DepartmentRepository departmentRepository;
	private ModelMapper modelMapper;
	@Autowired
	public DepartmentService(DepartmentRepository departmentRepository, ModelMapper modelMapper) {
		super();
		this.departmentRepository = departmentRepository;
		this.modelMapper = modelMapper;
	}
	
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		Department department = departmentRepository.save(modelMapper.map(departmentDto, Department.class));
		return modelMapper.map(department, DepartmentDto.class);
	}
	
	public DepartmentDto findUserById(Long id) {
		Department department = departmentRepository.findById(id).orElse(null);
		return modelMapper.map(department, DepartmentDto.class);
	}

	public DepartmentDto findUserByDepartmentCode(String departmentCode) {
		Department department = departmentRepository.findByDepartmentCode(departmentCode);
		return modelMapper.map(department, DepartmentDto.class);
	}
}
