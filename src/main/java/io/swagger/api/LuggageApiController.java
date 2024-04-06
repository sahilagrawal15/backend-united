package io.swagger.api;

import io.swagger.model.Luggage;
import io.swagger.model.NewLuggage;
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
public class LuggageApiController implements LuggageApi {

    private static final Logger log = LoggerFactory.getLogger(LuggageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LuggageApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Luggage>> luggageGet(@Parameter(in = ParameterIn.QUERY, description = "Filter luggage items by status" ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status
,@Parameter(in = ParameterIn.QUERY, description = "Filter luggage items by container ID" ,schema=@Schema()) @Valid @RequestParam(value = "container_id", required = false) String containerId
,@Parameter(in = ParameterIn.QUERY, description = "Limit the number of results returned. Default is 10." ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "Offset the results returned for pagination" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Luggage>>(objectMapper.readValue("[ {\n  \"weight_kg\" : 0,\n  \"description\" : \"description\",\n  \"luggage_id\" : \"luggage_id\",\n  \"container_id\" : \"container_id\",\n  \"status\" : \"status\"\n}, {\n  \"weight_kg\" : 0,\n  \"description\" : \"description\",\n  \"luggage_id\" : \"luggage_id\",\n  \"container_id\" : \"container_id\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Luggage>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Luggage>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Luggage> luggagePost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewLuggage body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Luggage>(objectMapper.readValue("{\n  \"weight_kg\" : 0,\n  \"description\" : \"description\",\n  \"luggage_id\" : \"luggage_id\",\n  \"container_id\" : \"container_id\",\n  \"status\" : \"status\"\n}", Luggage.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Luggage>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Luggage>(HttpStatus.NOT_IMPLEMENTED);
    }

}
