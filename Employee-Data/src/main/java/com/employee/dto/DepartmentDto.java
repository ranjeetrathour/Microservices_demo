package com.employee.dto;


public class DepartmentDto {

	private Long id;
	private String departmenatName;
	private String departmentCode;
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
