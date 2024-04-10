package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Luggage;
import io.swagger.model.NewLuggage;
import io.swagger.service.LuggageService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")
@RestController
public class LuggageApiController implements LuggageApi {

    @Autowired
    private final LuggageService luggageService;

    private static final Logger log = LoggerFactory.getLogger(LuggageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LuggageApiController(LuggageService luggageService, ObjectMapper objectMapper, HttpServletRequest request) {
        this.luggageService = luggageService;
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Luggage>> luggageGet(@Parameter(in = ParameterIn.QUERY, description = "Filter luggage items by status", schema = @Schema()) @Valid @RequestParam(value = "status", required = false) String status
            , @Parameter(in = ParameterIn.QUERY, description = "Filter luggage items by container ID", schema = @Schema()) @Valid @RequestParam(value = "container_id", required = false) String containerId
            , @Parameter(in = ParameterIn.QUERY, description = "Limit the number of results returned. Default is 10.", schema = @Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit
            , @Parameter(in = ParameterIn.QUERY, description = "Offset the results returned for pagination", schema = @Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            List<Luggage> luggages = luggageService.getAllLuggages();
            return new ResponseEntity<>(luggages, HttpStatus.OK);
        }

        return new ResponseEntity<List<Luggage>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Luggage> luggagePost(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody NewLuggage body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            Luggage createdLuggage = luggageService.createLuggage(body);
            return new ResponseEntity<>(createdLuggage, HttpStatus.CREATED);

        }

        return new ResponseEntity<Luggage>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> luggageIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the luggage to delete", required=true, schema=@Schema()) @PathVariable("luggage_id") String luggageId
    ) {
        String accept = request.getHeader("Accept");
        luggageService.deleteLuggage(luggageId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
