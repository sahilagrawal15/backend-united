package io.swagger.api;

import io.swagger.model.ChecklistTeam;
import io.swagger.model.NewChecklistTeam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")
@Validated
public interface ChecklistTeamApi {

    @Operation(summary = "Delete a specific team by ID", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "ChecklistTeam deleted successfully") })
    @RequestMapping(value = "/checklist-team/{id}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> checklistTeamIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the team to delete", required=true, schema=@Schema()) @PathVariable("id") Long id
    );


    @Operation(summary = "Get a specific team by ID", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "team details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChecklistTeam.class))) })
    @RequestMapping(value = "/checklist-team/{id}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<ChecklistTeam> checklistTeamIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the team to retrieve", required=true, schema=@Schema()) @PathVariable("ud") Long id
    );


    @Operation(summary = "Update a specific team by ID", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "team updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChecklistTeam.class))) })
    @RequestMapping(value = "/checklist-team/{id}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<ChecklistTeam> checklistTeamIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the team to update", required=true, schema=@Schema()) @PathVariable("ud") Long id
            , @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewChecklistTeam body
    );


    @Operation(summary = "Get all teams", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of teams", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ChecklistTeam.class)))) })
    @RequestMapping(value = "/checklist-team",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<ChecklistTeam>> checklistTeamGet();


    @Operation(summary = "Create a new team", description = "", tags={  })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "team created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ChecklistTeam.class))) })
    @RequestMapping(value = "/checklist-team",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<ChecklistTeam> checklistTeamPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewChecklistTeam body
    );

}
