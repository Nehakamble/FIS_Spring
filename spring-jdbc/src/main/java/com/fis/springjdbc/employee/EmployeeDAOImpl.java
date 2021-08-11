package com.fis.springjdbc.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.fis.springjdbc.product.IProduct;
import com.fis.springjdbc.product.Product;
import com.fis.springjdbc.product.ProductMapper;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployee{
	
	
	public List<employee> getAllemployee() {
		String sql = "select * from springdb.employee";
		List<employee> employee = getJdbcTemplate().query(sql, new EmployeeMapper());
		return employee;
	}

	@Override
	public void insertemployee(employee employee) {
		// TODO Auto-generated method stub
		String sql = "delete from springdb.employee where id=?";
		Object id = null;
		Object[] args = { id };
		int deletedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Deleted: " + deletedRows);
		
	}

	
	@Override
	public void updateemployee(employee employee) {
		// TODO Auto-generated method stub
		String sql = "update springdb.employee set name=? where id=?";
		Object[] args = { employee.getName(), employee.getId() };
		int updatedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Updated: " + updatedRows);
		
	}

	@Override
	public void deleteemployee(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from springdb.employee where id=?";
		Object[] args = { id };
		int deletedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Deleted: " + deletedRows);

	}

	@Override
	public employee getemployeeById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from springdb.employee where id=?";
		Object[] args = { id };
		employee employeeById = getJdbcTemplate().queryForObject(sql, args, new EmployeeMapper());
		return employeeById;
	}

	
	}
	
