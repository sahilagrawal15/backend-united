package io.swagger.api;

import io.swagger.model.CargoContainer;
import io.swagger.model.NewRampChecklist;
import io.swagger.model.RampChecklist;
import io.swagger.service.RampChecklistService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.service.CargoContainerService;
import io.swagger.service.RampChecklistService;
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
public class RampChecklistsApiController implements RampChecklistsApi {

    @Autowired
    private final RampChecklistService rampChecklistService;

    private static final Logger log = LoggerFactory.getLogger(RampChecklistsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RampChecklistsApiController(RampChecklistService rampChecklistService, ObjectMapper objectMapper, HttpServletRequest request) {
        this.rampChecklistService = rampChecklistService;
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<RampChecklist>> rampChecklistsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
                List<RampChecklist> checklists = rampChecklistService.getAllRampChecklists();
                return new ResponseEntity<>(checklists, HttpStatus.OK);

        }

        return new ResponseEntity<List<RampChecklist>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rampChecklistsListIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to delete", required=true, schema=@Schema()) @PathVariable("list_id") String listId
) {
        String accept = request.getHeader("Accept");
        rampChecklistService.deleteRampChecklist(listId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<RampChecklist> rampChecklistsListIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to retrieve", required=true, schema=@Schema()) @PathVariable("list_id") String listId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

                return rampChecklistService.getRampChecklistById(listId)
                        .map(checklist -> new ResponseEntity<>(checklist, HttpStatus.OK))
                        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        return new ResponseEntity<RampChecklist>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RampChecklist> rampChecklistsListIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to update", required=true, schema=@Schema()) @PathVariable("list_id") String listId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewRampChecklist body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
                RampChecklist updatedRampChecklist = new RampChecklist();
                updatedRampChecklist.setDate(body.getDate());
                updatedRampChecklist.setType(body.getType());
                updatedRampChecklist.setFlightNumber(body.getFlightNumber());
                updatedRampChecklist.setTailNumber(body.getTailNumber());
                updatedRampChecklist.setGate(body.getGate());
                updatedRampChecklist.setStandardClear(body.getStandardClear());
                updatedRampChecklist.setSafetyClear(body.getSafetyClear());
                updatedRampChecklist.setPpe(body.getPpe());
                updatedRampChecklist.setWheelChocks(body.getWheelChocks());
                updatedRampChecklist.setEnginesOff(body.getEnginesOff());
                updatedRampChecklist.setNoLeak(body.getNoLeak());
                updatedRampChecklist.setCargoDamage(body.getCargoDamage());
                updatedRampChecklist.setDoorsSecure(body.getDoorsSecure());
                updatedRampChecklist.setBeltLoaderSecure(body.getBeltLoaderSecure());
                RampChecklist updatedChecklist = rampChecklistService.updateRampChecklist(listId, updatedRampChecklist);

                return new ResponseEntity<>(updatedChecklist, HttpStatus.OK);

        }

        return new ResponseEntity<RampChecklist>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RampChecklist> rampChecklistsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewRampChecklist body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

                RampChecklist createdChecklist = rampChecklistService.createRampChecklist(body);
                return new ResponseEntity<>(createdChecklist, HttpStatus.CREATED);

        }

        return new ResponseEntity<RampChecklist>(HttpStatus.NOT_IMPLEMENTED);
    }

}
