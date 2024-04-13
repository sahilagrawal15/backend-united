package io.swagger.service;

import io.swagger.model.ChecklistTeam;
import io.swagger.model.NewChecklistTeam;
import io.swagger.repository.ChecklistTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChecklistTeamServiceImpl implements ChecklistTeamService {

    private final ChecklistTeamRepository checklistTeamRepository;

    @Autowired
    public ChecklistTeamServiceImpl(ChecklistTeamRepository checklistTeamRepository) {
        this.checklistTeamRepository = checklistTeamRepository;
    }

    public List<ChecklistTeam> getAllChecklistTeam() {
        return checklistTeamRepository.findAll();
    }

    public Optional<ChecklistTeam> getChecklistTeamById(Long id) {
        return checklistTeamRepository.findById(id);
    }

    public ChecklistTeam createChecklistTeam(NewChecklistTeam checklistTeam) {
        ChecklistTeam newChecklistTeam = new ChecklistTeam();
        newChecklistTeam.setEmployeeId(checklistTeam.getEmployeeId());
        newChecklistTeam.setListId(checklistTeam.getListId());

        // Save the ChecklistTeam object
        return checklistTeamRepository.save(newChecklistTeam);
    }

    public ChecklistTeam updateChecklistTeam(Long id, ChecklistTeam updatedChecklistTeam) {
        if (checklistTeamRepository.existsById(id)) {
            updatedChecklistTeam.setId(id);
            return checklistTeamRepository.save(updatedChecklistTeam);
        } else {
            return null;
        }
    }

    public void deleteChecklistTeam(Long id) {
        checklistTeamRepository.deleteById(id);
    }
}

