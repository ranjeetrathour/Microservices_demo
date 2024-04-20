package com.department.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dep_details")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departmenatName;
	private String departmentCode;
	private String departmentDescription;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long id, String departmenatName, String departmentCode, String departmentDescription) {
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
