package io.swagger.service;

import io.swagger.model.LockStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LockStatusConverter implements AttributeConverter<LockStatus, String> {

    @Override
    public String convertToDatabaseColumn(LockStatus attribute) {
        return attribute != null ? attribute.name() : null;
    }

    @Override
    public LockStatus convertToEntityAttribute(String dbData) {
        return dbData != null ? LockStatus.valueOf(dbData) : null;
    }
}
