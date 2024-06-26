/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.54).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.NewRampChecklist;
import io.swagger.model.RampChecklist;
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
public interface RampChecklistsApi {

    @Operation(summary = "Get all ramp checklists", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "List of ramp checklists", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = RampChecklist.class)))) })
    @RequestMapping(value = "/ramp-checklists",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<RampChecklist>> rampChecklistsGet();


    @Operation(summary = "Delete a specific ramp checklist by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Ramp checklist deleted successfully") })
    @RequestMapping(value = "/ramp-checklists/{list_id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> rampChecklistsListIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to delete", required=true, schema=@Schema()) @PathVariable("list_id") Long listId
);


    @Operation(summary = "Get a specific ramp checklist by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Ramp checklist details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RampChecklist.class))) })
    @RequestMapping(value = "/ramp-checklists/{list_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RampChecklist> rampChecklistsListIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to retrieve", required=true, schema=@Schema()) @PathVariable("list_id") Long listId
);


    @Operation(summary = "Update a specific ramp checklist by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Ramp checklist updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RampChecklist.class))) })
    @RequestMapping(value = "/ramp-checklists/{list_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<RampChecklist> rampChecklistsListIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the ramp checklist to update", required=true, schema=@Schema()) @PathVariable("list_id") Long listId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewRampChecklist body
);


    @Operation(summary = "Create a new ramp checklist", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Ramp checklist created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RampChecklist.class))) })
    @RequestMapping(value = "/ramp-checklists",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<RampChecklist> rampChecklistsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewRampChecklist body
);

}

