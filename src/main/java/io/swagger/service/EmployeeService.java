package io.swagger.service;

import io.swagger.model.Employee;
import io.swagger.model.NewEmployee;

public interface EmployeeService {

    Employee saveEmployee(NewEmployee employee);
}
