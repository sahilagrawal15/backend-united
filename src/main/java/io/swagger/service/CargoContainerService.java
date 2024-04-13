package io.swagger.service;

import io.swagger.model.CargoContainer;
import io.swagger.model.NewCargoContainer;

import java.util.List;
import java.util.Optional;

public interface CargoContainerService {

    List<CargoContainer> getAllCargoContainers();

    Optional<CargoContainer> getCargoContainerById(Long id);

    CargoContainer createCargoContainer(NewCargoContainer cargoContainer);

    CargoContainer updateCargoContainer(Long id, CargoContainer updatedCargoContainer);

    void deleteCargoContainer(Long id);
}
