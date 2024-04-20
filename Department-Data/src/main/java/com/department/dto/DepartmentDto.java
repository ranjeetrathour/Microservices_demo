package com.department.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class DepartmentDto {

	private Long id;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z' ']*$", message = "Only characters are allowed")
	private String departmenatName;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Only characters are allowed")
	private String departmentCode;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z' ']*$", message = "Only characters are allowed")
	private String departmentDescription;

	public DepartmentDto() {
	}

	public DepartmentDto(Long id, String departmenatName, String departmentCode, String departmentDescription) {
		super();
		this.id = id;
		this.departmenatName = departmenatName;
		this.departmentCode = departmentCode;
		this.departmentDescription = departmentDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmenatName() {
		return departmenatName;
	}

	public void setDepartmenatName(String departmenatName) {
		this.departmenatName = departmenatName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmenatName=" + departmenatName + ", departmentCode=" + departmentCode
				+ ", departmentDescription=" + departmentDescription + "]";
	}
}
