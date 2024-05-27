package com.jumpingdragon.ex01;

public class Member {
	
	private String name;
	private int age;
	private String id;
	private String pw;
	private String phone;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id, String pw, int age, String name, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
