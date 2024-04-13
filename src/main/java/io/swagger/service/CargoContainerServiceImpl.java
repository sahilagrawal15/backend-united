package io.swagger.service;

import io.swagger.model.CargoContainer;
import io.swagger.model.NewCargoContainer;
import io.swagger.repository.CargoContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoContainerServiceImpl implements CargoContainerService {

    private final CargoContainerRepository cargoContainerRepository;

    @Autowired
    public CargoContainerServiceImpl(CargoContainerRepository cargoContainerRepository) {
        this.cargoContainerRepository = cargoContainerRepository;
    }

    public List<CargoContainer> getAllCargoContainers() {
        return cargoContainerRepository.findAll();
    }

    public Optional<CargoContainer> getCargoContainerById(Long id) {
        return cargoContainerRepository.findById(id);
    }

    public CargoContainer createCargoContainer(NewCargoContainer cargoContainer) {
        CargoContainer newCargoContainer = new CargoContainer();
        newCargoContainer.setListId(cargoContainer.getListId());
        newCargoContainer.setDescription(cargoContainer.getDescription());
        newCargoContainer.setCapacity(cargoContainer.getCapacity());
        newCargoContainer.setDamage(cargoContainer.getDamage());
        newCargoContainer.setStatus(cargoContainer.getStatus());
        newCargoContainer.setLockStatus(cargoContainer.getLockStatus());
        newCargoContainer.setLockImg(cargoContainer.getLockImg());
        newCargoContainer.setTagImg(cargoContainer.getTagImg());
        newCargoContainer.setProbability(cargoContainer.getProbability());
        newCargoContainer.setTag(cargoContainer.getTag());

        // Save the CargoContainer object
        return cargoContainerRepository.save(newCargoContainer);
    }

    public CargoContainer updateCargoContainer(Long id, CargoContainer updatedCargoContainer) {
        // Check if the cargo container exists
        if (cargoContainerRepository.existsById(id)) {
            // Set the ID for the updated cargo container
            updatedCargoContainer.setContainerId(id);
            return cargoContainerRepository.save(updatedCargoContainer);
        } else {
            // Handle the case when the cargo container with the given ID doesn't exist
            // You can throw an exception, return null, or handle it according to your application's requirements
            return null;
        }
    }

    public void deleteCargoContainer(Long id) {
        cargoContainerRepository.deleteById(id);
    }
}
