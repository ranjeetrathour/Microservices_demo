package com.employee.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Email;

public class EmployeeDto {
	private Long Id;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Only characters are allowed")
	private String firstName;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Only characters are allowed")
	private String lastName;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z' ']*$", message = "Only characters are allowed")
	private String City;
	@NotNull
	@Positive
	private int age;
	@NotNull
	@Email
	private String Email;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z' ']*$", message = "Only characters are allowed")
	private String departmentCode;

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(Long id, String firstName, String lastName, String city, String email, String departmentCode) {
		super();
		this.Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.City = city;
		this.age = age;
		this.Email = email;
		this.departmentCode = departmentCode;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "EmployeeDto [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", City=" + City
				+ ", age=" + age + ", Email=" + Email + ", departmentCode=" + departmentCode + "]";
	}
}
