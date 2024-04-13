package io.swagger.service;

import io.swagger.model.ChecklistTeam;
import io.swagger.model.NewChecklistTeam;

import java.util.List;
import java.util.Optional;

public interface ChecklistTeamService {

    List<ChecklistTeam> getAllChecklistTeam();

    Optional<ChecklistTeam> getChecklistTeamById(Long id);

    ChecklistTeam createChecklistTeam(NewChecklistTeam checklistTeam);

    ChecklistTeam updateChecklistTeam(Long id, ChecklistTeam updatedChecklistTeam);

    void deleteChecklistTeam(Long id);
}


