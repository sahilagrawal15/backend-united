package io.swagger.api;

import io.swagger.model.CargoContainer;
import io.swagger.model.NewCargoContainer;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.service.CargoContainerService;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T19:16:46.028037-04:00[America/New_York]")
@RestController
public class CargoContainersApiController implements CargoContainersApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargoContainersApiController.class);



    @Autowired
    private final CargoContainerService cargoContainerService;

    private static final Logger log = LoggerFactory.getLogger(CargoContainersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CargoContainersApiController(CargoContainerService cargoContainerService, ObjectMapper objectMapper, HttpServletRequest request) {
        this.cargoContainerService = cargoContainerService;
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> cargoContainersContainerIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the cargo container to delete", required=true, schema=@Schema()) @PathVariable("container_id") Long containerId
) {
        String accept = request.getHeader("Accept");
        cargoContainerService.deleteCargoContainer(containerId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<CargoContainer> cargoContainersContainerIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the cargo container to retrieve", required=true, schema=@Schema()) @PathVariable("container_id") Long containerId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return cargoContainerService.getCargoContainerById(containerId)
                    .map(container -> new ResponseEntity<>(container, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        return new ResponseEntity<CargoContainer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CargoContainer> cargoContainersContainerIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the cargo container to update", required=true, schema=@Schema()) @PathVariable("container_id") Long containerId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewCargoContainer body
) {
        String accept = request.getHeader("Accept");
//        LOGGER.debug("Saving CargoContainer with list_id: {}", body.getListId());
//        LOGGER.debug("body: {}", body);
        if (accept != null && accept.contains("application/json")) {

            CargoContainer updatedCargoContainer = new CargoContainer();
            updatedCargoContainer.setListId(body.getListId());
            updatedCargoContainer.setDescription(body.getDescription());
            updatedCargoContainer.setCapacity(body.getCapacity());
            updatedCargoContainer.setStatus(body.getStatus());
            updatedCargoContainer.setDamage(body.getDamage());
            updatedCargoContainer.setLockStatus(body.getLockStatus());
            updatedCargoContainer.setLockImg(body.getLockImg());
            updatedCargoContainer.setTagImg(body.getTagImg());
            updatedCargoContainer.setProbability(body.getProbability());
            updatedCargoContainer.setTag(body.getTag());

            // Call the service method to update the cargo container
            CargoContainer updatedContainer = cargoContainerService.updateCargoContainer(containerId, updatedCargoContainer);

            // Return the updated cargo container with OK status
            return new ResponseEntity<>(updatedContainer, HttpStatus.OK);
        }

        return new ResponseEntity<CargoContainer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CargoContainer>> cargoContainersGet(@Parameter(in = ParameterIn.QUERY, description = "Filter cargo containers by status" ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status
,@Parameter(in = ParameterIn.QUERY, description = "Limit the number of results returned. Default is 10." ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit
,@Parameter(in = ParameterIn.QUERY, description = "Offset the results returned for pagination" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            List<CargoContainer> cargoContainers = cargoContainerService.getAllCargoContainers();
            return new ResponseEntity<>(cargoContainers, HttpStatus.OK);
        }

        return new ResponseEntity<List<CargoContainer>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CargoContainer> cargoContainersPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody NewCargoContainer body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            CargoContainer createdContainer = cargoContainerService.createCargoContainer(body);
            return new ResponseEntity<>(createdContainer, HttpStatus.CREATED);
        }

        return new ResponseEntity<CargoContainer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
