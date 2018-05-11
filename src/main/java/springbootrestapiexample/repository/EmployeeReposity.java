package springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import springbootrestapiexample.model.Employee;

@Component
public interface EmployeeReposity extends JpaRepository<Employee,Long> {

}
