package io.swagger.service;

import io.swagger.model.FireLine;
import io.swagger.model.NewFireLine;
import io.swagger.repository.FireLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FireLineServiceImpl implements FireLineService {

    private final FireLineRepository fireLineRepository;

    @Autowired
    public FireLineServiceImpl(FireLineRepository fireLineRepository) {
        this.fireLineRepository = fireLineRepository;
    }

    public List<FireLine> getAllFireLine() {
        return fireLineRepository.findAll();
    }

    public Optional<FireLine> getFireLineById(String id) {
        return fireLineRepository.findById(id);
    }

    public FireLine createFireLine(NewFireLine fireLine) {
        FireLine newFireLine = new FireLine();
        newFireLine.setlistId(fireLine.getlistId());
        newFireLine.setFirelineStatus(fireLine.getFirelineStatus());
        newFireLine.setFirelineImg(fireLine.getFirelineImg());
        newFireLine.setTagImg(fireLine.getTagImg());
        newFireLine.setProbability(fireLine.getProbability());
        newFireLine.setTag(fireLine.getTag());

        // Save the FireLine object
        return fireLineRepository.save(newFireLine);
    }

    public FireLine updateFireLine(String id, FireLine updatedFireLine) {
        if (fireLineRepository.existsById(id)) {
            updatedFireLine.setId(id);
            return fireLineRepository.save(updatedFireLine);
        } else {
            return null;
        }
    }

    public void deleteFireLine(String id) {
        fireLineRepository.deleteById(id);
    }
}
