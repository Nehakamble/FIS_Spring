package com.fis.springjdbc.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoexample.xml");
		EmployeeDAOImpl bean = context.getBean("employeeDao", EmployeeDAOImpl.class);

		System.out.println("===============================");
		System.out.println("Insert a Employee");
		employee newEmployee = new employee();
		newEmployee.setId(30);
		newEmployee.setName("eraser");
		bean.insertemployee(newEmployee);
		System.out.println("===============================");
		System.out.println("Delete Employee");
		int id = 10;
		bean.deleteemployee(id);
		System.out.println("===============================");
		System.out.println("Get Employee Based on Id");
		id = 1;
		employee productById = bean.getemployeeById(id);
		System.out.println(productById);
		System.out.println("===============================");
		System.out.println("Update Employee");
		newEmployee = new employee();
		newEmployee.setId(30);
		newEmployee.setName("browneraser");
		bean.updateemployee(newEmployee);
		System.out.println("===============================");
		System.out.println("Get All Employee");
		System.out.println(bean.getAllemployee());
		System.out.println("===============================");

		context.close();
	}

}
