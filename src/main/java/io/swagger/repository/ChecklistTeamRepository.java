package io.swagger.repository;

import io.swagger.model.ChecklistTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistTeamRepository extends JpaRepository<ChecklistTeam, Long> {
}

