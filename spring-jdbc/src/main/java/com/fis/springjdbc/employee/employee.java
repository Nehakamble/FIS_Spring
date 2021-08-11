package com.fis.springjdbc.employee;

public class employee {

	int id;
	String name;

	public employee() {
		super();
	}

	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}

}
