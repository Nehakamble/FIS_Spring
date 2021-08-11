

package com.fis.springjpa.employee;

import org.hibernate.query.spi.NamedQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fis.springjpa.User;

@Controller 
@RequestMapping(path="/employee") 
public class EmployeeController {
  @Autowired 
  private EmployeeRepository EmployeeRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String name) {

    Employee n = new Employee();
    n.setName(name);
    EmployeeRepository.save(n);
    return "Saved";
  }
  
  @GetMapping(path="/all")
  public @ResponseBody Iterable<Employee> getAllUsers() {
    // This returns a JSON or XML with the users
    return EmployeeRepository.findAll();
  }

}