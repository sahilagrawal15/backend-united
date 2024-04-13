//package io.swagger.service;
//
//import io.swagger.model.Employee;
//import io.swagger.model.MyEmployeeDetails;
//import io.swagger.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class MyEmployeeDetailsService implements UserDetailsService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String employeeId) throws UsernameNotFoundException {
//        // Load employee details from the database based on the employee ID
//        Optional<Employee> employeeOptional = employeeRepository.findByEmployeeId(employeeId);
//
//        // If employee is not found, throw an exception
//        Employee employee = employeeOptional.orElseThrow(() -> new UsernameNotFoundException("Employee not found with ID: " + employeeId));
//
//        // Return a UserDetails object containing employee details
//        return new MyEmployeeDetails(employee);
//    }
//}
//
