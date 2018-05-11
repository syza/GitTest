package springbootrestapiexample.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootrestapiexample.model.Employee;
import springbootrestapiexample.repository.EmployeeReposity;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeReposity employeeRepository;
	
	
	public Employee save(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	

	public List<Employee> findAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	
	public Employee findOne(Long id)
	{
		return employeeRepository.findOne(id);
	}
	
	public void delete(Employee emp)
	{
		employeeRepository.delete(emp);
	}
	
	public Employee update(Employee emp)
	{
		return employeeRepository.save(emp);
	}
}
