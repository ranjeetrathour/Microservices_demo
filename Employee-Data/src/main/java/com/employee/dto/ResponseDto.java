package com.employee.dto;

public class ResponseDto {

	private EmployeeDto dto;
	private DepartmentDto dto2;

	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseDto(EmployeeDto dto, DepartmentDto dto2) {
		super();
		this.dto = dto;
		this.dto2 = dto2;
	}

	public EmployeeDto getDto() {
		return dto;
	}

	public void setDto(EmployeeDto dto) {
		this.dto = dto;
	}

	public DepartmentDto getDto2() {
		return dto2;
	}

	public void setDto2(DepartmentDto dto2) {
		this.dto2 = dto2;
	}

	@Override
	public String toString() {
		return "ResponseDto [dto=" + dto + ", dto2=" + dto2 + "]";
	}

}
