package com.fis.springjdbc.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.fis.springjdbc.product.Product;

public class EmployeeMapper implements  RowMapper<employee> {


	@Override
	public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		employee employee = new employee();
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		return employee;
	}

}
