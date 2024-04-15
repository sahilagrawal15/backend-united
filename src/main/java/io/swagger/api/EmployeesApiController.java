package io.swagger.api;

import io.swagger.model.Employee;
import io.swagger.model.NewEmployee;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.repository.EmployeeRepository;
import io.swagger.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")
@RestController
public class EmployeesApiController implements EmployeesApi {

    private static final Logger log = LoggerFactory.getLogger(EmployeesApiController.class);

    private final ObjectMapper objectMapper;

    @Autowired
    private EmployeeService employeeService;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmployeesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> employeesEmployeeIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the employee to delete", required=true, schema=@Schema()) @PathVariable("employee_id") String employeeId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Employee> employeesEmployeeIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the employee to retrieve", required=true, schema=@Schema()) @PathVariable("employee_id") String employeeId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Employee>(objectMapper.readValue("{\n  \"password\" : \"password\",\n  \"employee_id\" : \"employee_id\"\n}", Employee.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Employee>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Employee> employeesEmployeeIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the employee to update", required=true, schema=@Schema()) @PathVariable("employee_id") String employeeId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewEmployee body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Employee>(objectMapper.readValue("{\n  \"password\" : \"password\",\n  \"employee_id\" : \"employee_id\"\n}", Employee.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Employee>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Employee>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Employee>> employeesGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Employee>>(objectMapper.readValue("[ {\n  \"password\" : \"password\",\n  \"employee_id\" : \"employee_id\"\n}, {\n  \"password\" : \"password\",\n  \"employee_id\" : \"employee_id\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Employee>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Employee>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Employee> employeesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewEmployee body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Employee employee = employeeService.saveEmployee(body);
            return new ResponseEntity<>(employee, HttpStatus.CREATED);

        }

        return new ResponseEntity<Employee>(HttpStatus.NOT_IMPLEMENTED);
    }

}
