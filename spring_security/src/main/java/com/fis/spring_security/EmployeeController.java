package com.fis.spring_security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository EmployeeRepository;

	// @PostMapping(path="/add") // Map ONLY POST Requests
	/*
	 * public @ResponseBody String addNewEmployee (@RequestParam int id
	 * ,@RequestParam String name) {
	 * 
	 * Employee n = new Employee(); n.setId(id); n.setName(name);
	 * 
	 * EmployeeRepository.save(n); return "Saved";
	 */
	@PostMapping
	public String addEmployee(@RequestBody Employee employee) {
		EmployeeRepository.save(employee);
		return "Saved";
	}

	@PutMapping
	public String updateEmployee(@RequestBody Employee employee) {
		Optional<Employee> p = EmployeeRepository.findById(employee.getId());
		if (p.isPresent()) {
			EmployeeRepository.save(employee);
			return "Updated";
		} else {
			return "Product Not Found!!";
		}
	}

	@DeleteMapping
	public String deleteEmployee(@RequestParam int id) {
		Optional<Employee> p = EmployeeRepository.findById(id);
		if (p.isPresent()) {
			EmployeeRepository.delete(p.get());
			return "Deleted";
		} else {
			return "Product Not Found!!";
		}
	}

	@GetMapping("/{id}")
	public Object getAEmployee(@PathVariable int id) {
		Optional<Employee> p = EmployeeRepository.findById(id);
		if (p.isPresent()) {
			return p.get();
		} else {
			return "Product Not Found!!";
		}
	}

	@GetMapping
	public @ResponseBody Iterable<Employee> getAllEmployee() {
		// This returns a JSON or XML with the users
		return EmployeeRepository.findAll();
	}

}