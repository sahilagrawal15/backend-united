package io.swagger.service;

import io.swagger.model.Luggage;
import io.swagger.model.Luggage;
import io.swagger.model.NewLuggage;

import java.util.List;
import java.util.Optional;

public interface LuggageService {

    List<Luggage> getAllLuggages();

    Luggage createLuggage(NewLuggage luggage);

    Optional<Luggage> getLuggageById(String id);

    Luggage updateLuggage(String id, Luggage updatedLuggage);

    void deleteLuggage(String id);



}

