//package io.swagger.service;
//
//import io.swagger.model.Employee;
//import io.swagger.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private EmployeeRepository userRepository;
//
////    @Override
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        Employee user = userRepository.findByEmployeeId(username)
////                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
////
////        return org.springframework.security.core.userdetails.User
////                .withUsername(username)
////                .password(user.getPassword())
////                .authorities("USER")
////                .accountExpired(false)
////                .accountLocked(false)
////                .credentialsExpired(false)
////                .disabled(false)
////                .build();
////    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if ("sahil".equals(username)) {
//            return User.builder()
//                    .username("sahil")
//                    .password("$2a$10$P1w3DYw1g24rxAsrv2ZWcOtj1q/LwM0yDTn4t8dET6sGrGChQ7N2K") // Password: sahil123
//                    .roles("USER")
//                    .build();
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//    }
//
//    public void createEmployee(String employeeId, String password) {
//        Employee employee = new Employee();
//        employee.setEmployeeId(employeeId);
//        employee.setPassword(password);
//
//        userRepository.save(employee);
//    }
//}
//
