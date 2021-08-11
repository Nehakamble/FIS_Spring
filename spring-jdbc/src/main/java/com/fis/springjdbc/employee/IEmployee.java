package com.fis.springjdbc.employee;

import java.util.List;

public interface IEmployee {

	public void insertProduct(employee employee);

	public List<employee> getAllProducts();

	public void updateemployee(employee employee);

	public void deleteemployee(int id);

	public employee getemployeeById(int id);

}
