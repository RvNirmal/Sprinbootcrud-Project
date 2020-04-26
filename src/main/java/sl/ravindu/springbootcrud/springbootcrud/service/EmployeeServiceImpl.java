package sl.ravindu.springbootcrud.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sl.ravindu.springbootcrud.springbootcrud.dao.EmployeeDAO;
import sl.ravindu.springbootcrud.springbootcrud.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	public List<Employee> get() {
		return employeeDAO.get();
	}

	@Transactional
	public Employee get(int id) {
		return employeeDAO.get(id);
	}

	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Transactional
	public void delete(int id) {
		employeeDAO.delete(id);
	}

}
