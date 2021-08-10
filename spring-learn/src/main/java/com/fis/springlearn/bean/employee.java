package com.fis.springlearn.bean;

import java.util.Arrays;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.SpringLearnApplication;

public class employee {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(employee.class);

		int id;
		String name;
		double salary;
		boolean permanent;
		Date dateOfBirth;
		department Department;
		skill[] skills;
		public employee() {
			LOGGER.debug("Inside Employee Constructor");
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

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public boolean isPermanent() {
			return permanent;
		}

		public void setPermanent(boolean permanent) {
			this.permanent = permanent;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public department getDepartment() {
			return Department;
		}

		public void setDepartment(department department) {
			Department = department;
		}
		public skill[] getSkills() {
			return skills;
		}

		public void setSkills(skill[] skills) {
			this.skills = skills;
		}

		@Override
		public String toString() {
			return "employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
					+ ", dateOfBirth=" + dateOfBirth + ", Department=" + Department + ", skills="
					+ Arrays.toString(skills) + "]";
		}
		
		
		
	
}




