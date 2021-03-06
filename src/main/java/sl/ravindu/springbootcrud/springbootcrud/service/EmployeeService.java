package sl.ravindu.springbootcrud.springbootcrud.service;

import java.util.List;

import sl.ravindu.springbootcrud.springbootcrud.model.Employee;

public interface EmployeeService {
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
