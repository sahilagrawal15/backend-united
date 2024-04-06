package io.swagger.api;

import io.swagger.model.NewRampChecklist;
import io.swagger.model.RampChecklist;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class RampChecklistsApiController implements RampChecklistsApi {

    private static final Logger log = LoggerFactory.getLogger(RampChecklistsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RampChecklistsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<RampChecklist>> rampChecklistsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<RampChecklist>>(objectMapper.readValue("[ {\n  \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"standard_clear\" : \"standard_clear\",\n  \"list_id\" : \"list_id\",\n  \"safety_clear\" : \"safety_clear\",\n  \"flight_number\" : \"flight_number\",\n  \"tail_number\" : \"tail_number\",\n  \"gate\" : \"gate\",\n  \"type\" : \"type\"\n}, {\n  \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"standard_clear\" : \"standard_clear\",\n  \"list_id\" : \"list_id\",\n  \"safety_clear\" : \"safety_clear\",\n  \"flight_number\" : \"flight_number\",\n  \"tail_number\" : \"tail_number\",\n  \"gate\" : \"gate\",\n  \"type\" : \"type\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<RampChecklist>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<RampChecklist>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rampChecklistsListIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to delete", required=true, schema=@Schema()) @PathVariable("list_id") String listId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RampChecklist> rampChecklistsListIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to retrieve", required=true, schema=@Schema()) @PathVariable("list_id") String listId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RampChecklist>(objectMapper.readValue("{\n  \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"standard_clear\" : \"standard_clear\",\n  \"list_id\" : \"list_id\",\n  \"safety_clear\" : \"safety_clear\",\n  \"flight_number\" : \"flight_number\",\n  \"tail_number\" : \"tail_number\",\n  \"gate\" : \"gate\",\n  \"type\" : \"type\"\n}", RampChecklist.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RampChecklist>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RampChecklist>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RampChecklist> rampChecklistsListIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to update", required=true, schema=@Schema()) @PathVariable("list_id") String listId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewRampChecklist body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RampChecklist>(objectMapper.readValue("{\n  \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"standard_clear\" : \"standard_clear\",\n  \"list_id\" : \"list_id\",\n  \"safety_clear\" : \"safety_clear\",\n  \"flight_number\" : \"flight_number\",\n  \"tail_number\" : \"tail_number\",\n  \"gate\" : \"gate\",\n  \"type\" : \"type\"\n}", RampChecklist.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RampChecklist>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RampChecklist>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RampChecklist> rampChecklistsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewRampChecklist body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RampChecklist>(objectMapper.readValue("{\n  \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"standard_clear\" : \"standard_clear\",\n  \"list_id\" : \"list_id\",\n  \"safety_clear\" : \"safety_clear\",\n  \"flight_number\" : \"flight_number\",\n  \"tail_number\" : \"tail_number\",\n  \"gate\" : \"gate\",\n  \"type\" : \"type\"\n}", RampChecklist.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RampChecklist>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RampChecklist>(HttpStatus.NOT_IMPLEMENTED);
    }

}
