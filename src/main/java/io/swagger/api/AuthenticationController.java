//package io.swagger.api;
//
//import io.swagger.auth.JwtUtils;
//import io.swagger.model.AuthenticationResponse;
//import io.swagger.model.Employee;
//import io.swagger.service.MyEmployeeDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class AuthenticationController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtUtils jwtTokenUtil;
//
//    @Autowired
//    private MyEmployeeDetailsService userDetailsService;
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody Employee authenticationRequest) throws Exception {
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(authenticationRequest.getEmployeeId(), authenticationRequest.getPassword())
//            );
//        } catch (BadCredentialsException e) {
//            throw new Exception("Incorrect username or password", e);
//        }
//
//        final UserDetails userDetails = userDetailsService
//                .loadUserByUsername(authenticationRequest.getEmployeeId());
//
//        final String jwt = jwtTokenUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(new AuthenticationResponse(jwt));
//    }
//}
