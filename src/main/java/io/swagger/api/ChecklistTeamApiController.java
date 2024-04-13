package io.swagger.api;

import io.swagger.model.ChecklistTeam;
import io.swagger.model.NewChecklistTeam;
import io.swagger.service.ChecklistTeamService;
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

import javax.servlet.http.HttpServletRequest;

import java.util.List;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")
@RestController
public class ChecklistTeamApiController implements ChecklistTeamApi {

    @Autowired
    private final ChecklistTeamService checklistTeamService;

    private static final Logger log = LoggerFactory.getLogger(ChecklistTeamApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ChecklistTeamApiController(ChecklistTeamService checklistTeamService, ObjectMapper objectMapper, HttpServletRequest request) {
        this.checklistTeamService = checklistTeamService;
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ChecklistTeam>> checklistTeamGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            List<ChecklistTeam> checklistTeams = checklistTeamService.getAllChecklistTeam();
            return new ResponseEntity<>(checklistTeams, HttpStatus.OK);
        }

        return new ResponseEntity<List<ChecklistTeam>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> checklistTeamIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the checklist team check to delete", required=true, schema=@Schema()) @PathVariable("id") Long id
    ) {
        String accept = request.getHeader("Accept");
        checklistTeamService.deleteChecklistTeam(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ChecklistTeam> checklistTeamIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the checklist team check to retrieve", required=true, schema=@Schema()) @PathVariable("id") Long id
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return checklistTeamService.getChecklistTeamById(id)
                    .map(team -> new ResponseEntity<>(team, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        return new ResponseEntity<ChecklistTeam>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ChecklistTeam> checklistTeamIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the checklist team check to update", required=true, schema=@Schema()) @PathVariable("id") Long id
            ,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewChecklistTeam body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            ChecklistTeam updatedChecklistTeam = new ChecklistTeam();
            updatedChecklistTeam.setEmployeeId(body.getEmployeeId());
            updatedChecklistTeam.setListId(body.getListId());

            ChecklistTeam updated = checklistTeamService.updateChecklistTeam(id, updatedChecklistTeam);

            return new ResponseEntity<>(updated, HttpStatus.OK);

        }

        return new ResponseEntity<ChecklistTeam>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ChecklistTeam> checklistTeamPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewChecklistTeam body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            ChecklistTeam createdChecklist = checklistTeamService.createChecklistTeam(body);
            return new ResponseEntity<>(createdChecklist, HttpStatus.CREATED);
        }

        return new ResponseEntity<ChecklistTeam>(HttpStatus.NOT_IMPLEMENTED);
    }

}
