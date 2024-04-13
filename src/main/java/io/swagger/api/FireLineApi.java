/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.54).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.FireLine;
import io.swagger.model.NewFireLine;
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
public interface FireLineApi {

    @Operation(summary = "Get all fire line checks", description = "", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "List of fire line checks", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = FireLine.class)))) })
    @RequestMapping(value = "/fire-line",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<FireLine>> fireLineGet();


    @Operation(summary = "Delete a specific fire line check by ID", description = "", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Fire line check deleted successfully") })
    @RequestMapping(value = "/fire-line/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> fireLineIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to delete", required=true, schema=@Schema()) @PathVariable("id") Long id
);


    @Operation(summary = "Get a specific fire line check by ID", description = "", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Fire line check details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FireLine.class))) })
    @RequestMapping(value = "/fire-line/{id}",
        produces = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<FireLine> fireLineIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to retrieve", required=true, schema=@Schema()) @PathVariable("id") Long id
);


    @Operation(summary = "Update a specific fire line check by ID", description = "", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Fire line check updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FireLine.class))) })
    @RequestMapping(value = "/fire-line/{id}",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<FireLine> fireLineIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the fire line check to update", required=true, schema=@Schema()) @PathVariable("id") Long id
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewFireLine body
);


    @Operation(summary = "Create a new fire line check", description = "", tags={  })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Fire line check created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FireLine.class))) })
    @RequestMapping(value = "/fire-line",
        produces = { "application/json" },
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<FireLine> fireLinePost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewFireLine body
);

}

