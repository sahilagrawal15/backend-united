package io.swagger.repository;

import io.swagger.model.RampChecklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RampChecklistRepository extends JpaRepository<RampChecklist, Long> {
}

