package io.swagger.repository;

import io.swagger.model.FireLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FireLineRepository extends JpaRepository<FireLine, Long> {
}
