package io.swagger.repository;

import io.swagger.model.CargoContainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoContainerRepository extends JpaRepository<CargoContainer, Long> {
}

