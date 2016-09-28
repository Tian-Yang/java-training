package com.training.softReference;

public class Employee {

	/**
	 * 雇员ID
	 */
	private String id;

	/**
	 * 雇员姓名
	 */
	private String name;

	/**
	 * 雇员所在部门
	 */
	private String department;

	public Employee(String id) {
		getDataFromlnfoCenter(id);
	}

	private void getDataFromlnfoCenter(String id) {

		System.out.println("get data from db...");
		this.id = id;
		this.name = "小明";
		this.department = "广告";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

}
