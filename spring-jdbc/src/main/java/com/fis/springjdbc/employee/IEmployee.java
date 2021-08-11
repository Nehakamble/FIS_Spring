package com.fis.springjdbc.employee;

import java.util.List;

public interface IEmployee {

	public void insertemployee(employee employee);

	public List<employee> getAllemployee();

	public void updateemployee(employee employee);

	public void deleteemployee(int id);

	public employee getemployeeById(int id);

}
