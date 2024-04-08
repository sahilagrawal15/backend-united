package io.swagger.service;


import io.swagger.model.Luggage;
import io.swagger.model.NewLuggage;
import io.swagger.repository.LuggageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LuggageServiceImpl implements LuggageService {
    private final LuggageRepository luggageRepository;

    @Autowired
    public LuggageServiceImpl(LuggageRepository luggageRepository) {
        this.luggageRepository = luggageRepository;
    }

    public List<Luggage> getAllLuggages() {
        return luggageRepository.findAll();
    }


    public Luggage createLuggage(NewLuggage luggage) {
        Luggage newLuggage = new Luggage();
        newLuggage.setDescription(luggage.getDescription());
        newLuggage.setWeightKg(luggage.getWeightKg());
        newLuggage.setStatus(luggage.getStatus());
        newLuggage.setContainerId(luggage.getContainerId());

        return luggageRepository.save(newLuggage);
    }

    public Optional<Luggage> getLuggageById(String id) {
        return luggageRepository.findById(id);
    }

    public Luggage updateLuggage(String id, Luggage updatedLuggage) {
        // Check if the luggage exists
        if (luggageRepository.existsById(id)) {
            // Set the ID for the updated luggage
            updatedLuggage.setLuggageId(id);
            return luggageRepository.save(updatedLuggage);
        } else {
            // Handle the case when the luggage with the given ID doesn't exist
            // You can throw an exception, return null, or handle it according to your application's requirements
            return null;
        }
    }

    public void deleteLuggage(String id) {
        luggageRepository.deleteById(id);
    }
}
