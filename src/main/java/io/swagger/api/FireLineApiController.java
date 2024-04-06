package io.swagger.api;

import io.swagger.model.FireLine;
import io.swagger.model.NewFireLine;
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
public class FireLineApiController implements FireLineApi {

    private static final Logger log = LoggerFactory.getLogger(FireLineApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FireLineApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<FireLine>> fireLineGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FireLine>>(objectMapper.readValue("[ {\n  \"Type\" : \"Type\",\n  \"probability\" : 0.8008281904610115,\n  \"safety_id\" : \"safety_id\",\n  \"fireline_img\" : \"fireline_img\",\n  \"id\" : \"id\",\n  \"tag\" : \"tag\",\n  \"fireline_status\" : true,\n  \"tag_img\" : \"tag_img\"\n}, {\n  \"Type\" : \"Type\",\n  \"probability\" : 0.8008281904610115,\n  \"safety_id\" : \"safety_id\",\n  \"fireline_img\" : \"fireline_img\",\n  \"id\" : \"id\",\n  \"tag\" : \"tag\",\n  \"fireline_status\" : true,\n  \"tag_img\" : \"tag_img\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FireLine>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FireLine>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fireLineIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to delete", required=true, schema=@Schema()) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FireLine> fireLineIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to retrieve", required=true, schema=@Schema()) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FireLine>(objectMapper.readValue("{\n  \"Type\" : \"Type\",\n  \"probability\" : 0.8008281904610115,\n  \"safety_id\" : \"safety_id\",\n  \"fireline_img\" : \"fireline_img\",\n  \"id\" : \"id\",\n  \"tag\" : \"tag\",\n  \"fireline_status\" : true,\n  \"tag_img\" : \"tag_img\"\n}", FireLine.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FireLine>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FireLine>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FireLine> fireLineIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to update", required=true, schema=@Schema()) @PathVariable("id") String id
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewFireLine body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FireLine>(objectMapper.readValue("{\n  \"Type\" : \"Type\",\n  \"probability\" : 0.8008281904610115,\n  \"safety_id\" : \"safety_id\",\n  \"fireline_img\" : \"fireline_img\",\n  \"id\" : \"id\",\n  \"tag\" : \"tag\",\n  \"fireline_status\" : true,\n  \"tag_img\" : \"tag_img\"\n}", FireLine.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FireLine>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FireLine>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FireLine> fireLinePost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewFireLine body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<FireLine>(objectMapper.readValue("{\n  \"Type\" : \"Type\",\n  \"probability\" : 0.8008281904610115,\n  \"safety_id\" : \"safety_id\",\n  \"fireline_img\" : \"fireline_img\",\n  \"id\" : \"id\",\n  \"tag\" : \"tag\",\n  \"fireline_status\" : true,\n  \"tag_img\" : \"tag_img\"\n}", FireLine.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<FireLine>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<FireLine>(HttpStatus.NOT_IMPLEMENTED);
    }

}
