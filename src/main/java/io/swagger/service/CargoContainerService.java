package io.swagger.service;

import io.swagger.model.CargoContainer;
import io.swagger.model.NewCargoContainer;

import java.util.List;
import java.util.Optional;

public interface CargoContainerService {

    List<CargoContainer> getAllCargoContainers();

    Optional<CargoContainer> getCargoContainerById(String id);

    CargoContainer createCargoContainer(NewCargoContainer cargoContainer);

    CargoContainer updateCargoContainer(String id, CargoContainer updatedCargoContainer);

    void deleteCargoContainer(String id);
}
