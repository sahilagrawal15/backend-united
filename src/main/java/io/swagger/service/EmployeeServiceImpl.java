package io.swagger.service;

import io.swagger.model.Employee;
import io.swagger.model.NewEmployee;
import io.swagger.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(NewEmployee employee) {
        Employee employee1 = new Employee();
        employee1.setEmployeeId(employee.getEmployeeId());
        employee1.setPassword(employee.getPassword());
        return employeeRepository.save(employee1);
    }
}
