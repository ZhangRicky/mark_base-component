package com.entity;

import java.io.Serializable;

public class Person implements Serializable {
	private String id;		//ID
	private String name;	//����
	private int age;		//����
	private String sex;		//�Ա�
	private String phone;	//�绰
	
	
	public Person() {
		super();
	}
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public Person(String id, String name, int age, String sex, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", phone=" + phone + "]";
	}
	
	
}
