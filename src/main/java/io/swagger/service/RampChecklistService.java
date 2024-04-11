package io.swagger.service;
import io.swagger.model.RampChecklist;
import io.swagger.model.NewRampChecklist;

import java.util.List;
import java.util.Optional;

public interface RampChecklistService {

    List<RampChecklist> getAllRampChecklists();

    RampChecklist createRampChecklist(NewRampChecklist rampChecklist);

    Optional<RampChecklist> getRampChecklistById(Long id);

    RampChecklist updateRampChecklist(Long id, RampChecklist updatedRampChecklist);

    void deleteRampChecklist(Long id);
}

