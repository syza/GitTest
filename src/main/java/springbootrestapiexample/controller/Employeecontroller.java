package springbootrestapiexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootrestapiexample.doa.EmployeeDAO;
import springbootrestapiexample.model.Employee;

@RestController
@RequestMapping(value="/company")
public class Employeecontroller {
	
	@Autowired
	EmployeeDAO employeedao;
	
	
	@GetMapping(value="/list")
	public List<Employee> employees(){
		return employeedao.findAllEmployee();	
	}
	
	
	@GetMapping(value="/add")
	public Employee createE(){
		
		Employee emp= new Employee();	
		emp.setPersonID(123);
		emp.setName("Vusi");
		emp.setSurname("zUN");
		
		return employeedao.save(emp);	
	}
}
