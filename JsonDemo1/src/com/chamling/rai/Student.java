package com.chamling.rai;

public class Student {
	
	String name;
	String phone;
	String city;
	int studentId;
	
	public Student() {
		super();
	}
	
	

	public Student(String name, String phone, String city, int studentId) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.studentId = studentId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
	

}
