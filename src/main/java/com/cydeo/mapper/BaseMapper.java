package com.cydeo.mapper;

import lombok.Getter;
import org.modelmapper.ModelMapper;

@Getter
public abstract class BaseMapper<T, R> {
    private final ModelMapper modelmapper;

    public BaseMapper(ModelMapper modelmapper) {
        this.modelmapper = modelmapper;
    }

    public abstract T convertToDto(R r);
    public abstract R convertToEntity(T t);
}
