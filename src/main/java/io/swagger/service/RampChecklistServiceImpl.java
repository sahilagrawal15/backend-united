package io.swagger.service;

import io.swagger.model.RampChecklist;
import io.swagger.model.NewRampChecklist;
import io.swagger.repository.RampChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RampChecklistServiceImpl implements RampChecklistService {

        private final RampChecklistRepository rampChecklistRepository;

        @Autowired
        public RampChecklistServiceImpl(RampChecklistRepository rampChecklistRepository) {
            this.rampChecklistRepository = rampChecklistRepository;
        }

        public List<RampChecklist> getAllRampChecklists() {
            return rampChecklistRepository.findAll();
        }

        public Optional<RampChecklist> getRampChecklistById(Long id) {
            return rampChecklistRepository.findById(id);
        }

        public RampChecklist createRampChecklist(NewRampChecklist rampChecklist) {
            RampChecklist newRampChecklist = new RampChecklist();
            newRampChecklist.setDate(rampChecklist.getDate());
            newRampChecklist.setType(rampChecklist.getType());
            newRampChecklist.setFlightNumber(rampChecklist.getFlightNumber());
            newRampChecklist.setTailNumber(rampChecklist.getTailNumber());
            newRampChecklist.setGate(rampChecklist.getGate());
            newRampChecklist.setStandardClear(rampChecklist.getStandardClear());
            newRampChecklist.setSafetyClear(rampChecklist.getSafetyClear());
            newRampChecklist.setPpe(rampChecklist.getPpe());
            newRampChecklist.setWheelChocks(rampChecklist.getWheelChocks());
            newRampChecklist.setEnginesOff(rampChecklist.getEnginesOff());
            newRampChecklist.setNoLeak(rampChecklist.getNoLeak());
            newRampChecklist.setCargoDamage(rampChecklist.getCargoDamage());
            newRampChecklist.setDoorsSecure(rampChecklist.getDoorsSecure());
            newRampChecklist.setBeltLoaderSecure(rampChecklist.getBeltLoaderSecure());


            // Save the RampChecklist object
            return rampChecklistRepository.save(newRampChecklist);
        }

        public RampChecklist updateRampChecklist(Long id, RampChecklist updatedRampChecklist) {
            if (rampChecklistRepository.existsById(id)) {
                updatedRampChecklist.setListId(id);
                return rampChecklistRepository.save(updatedRampChecklist);
            } else {
                return null;
            }
        }

        public void deleteRampChecklist(Long id) {
            rampChecklistRepository.deleteById(id);
        }
    }
