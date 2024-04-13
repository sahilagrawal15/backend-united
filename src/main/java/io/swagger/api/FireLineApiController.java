package io.swagger.api;

import io.swagger.model.FireLine;
import io.swagger.model.NewFireLine;
import io.swagger.service.FireLineService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")
@RestController
public class FireLineApiController implements FireLineApi {

    @Autowired
    private final FireLineService fireLineService;

    private static final Logger log = LoggerFactory.getLogger(FireLineApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FireLineApiController(FireLineService fireLineService, ObjectMapper objectMapper, HttpServletRequest request) {
        this.fireLineService = fireLineService;
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<FireLine>> fireLineGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            List<FireLine> fireLines = fireLineService.getAllFireLine();
            return new ResponseEntity<>(fireLines, HttpStatus.OK);
        }

        return new ResponseEntity<List<FireLine>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> fireLineIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to delete", required=true, schema=@Schema()) @PathVariable("id") Long id
) {
        String accept = request.getHeader("Accept");
        fireLineService.deleteFireLine(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<FireLine> fireLineIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to retrieve", required=true, schema=@Schema()) @PathVariable("id") Long id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return fireLineService.getFireLineById(id)
                    .map(container -> new ResponseEntity<>(container, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        return new ResponseEntity<FireLine>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FireLine> fireLineIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to update", required=true, schema=@Schema()) @PathVariable("id") Long id
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewFireLine body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            FireLine updatedFireline = new FireLine();
            updatedFireline.setlistId(body.getlistId());
            updatedFireline.setFirelineStatus(body.getFirelineStatus());
            updatedFireline.setFirelineImg(body.getFirelineImg());
            updatedFireline.setTagImg(body.getTagImg());
            updatedFireline.setProbability(body.getProbability());
            updatedFireline.setTag(body.getTag());

            FireLine updated = fireLineService.updateFireLine(id, updatedFireline);

            return new ResponseEntity<>(updated, HttpStatus.OK);

        }

        return new ResponseEntity<FireLine>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<FireLine> fireLinePost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewFireLine body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            FireLine createdContainer = fireLineService.createFireLine(body);
            return new ResponseEntity<>(createdContainer, HttpStatus.CREATED);
        }

        return new ResponseEntity<FireLine>(HttpStatus.NOT_IMPLEMENTED);
    }

}
