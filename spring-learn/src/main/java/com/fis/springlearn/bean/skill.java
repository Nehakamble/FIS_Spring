package com.fis.springlearn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class skill {
	private static final Logger LOGGER = LoggerFactory.getLogger(skill.class);

	int id;
	String name;
	public skill() {
		LOGGER.debug("Inside Skill Constructor");
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
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	

}