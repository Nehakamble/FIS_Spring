package com.fis.springlearn.bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class department {
	private static final Logger LOGGER = LoggerFactory.getLogger(department.class);
	int id;
	String name;
	void department() {
		LOGGER.debug("Inside department Constructor");
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
		return "department [id=" + id + ", name=" + name + "]";
	}
}
