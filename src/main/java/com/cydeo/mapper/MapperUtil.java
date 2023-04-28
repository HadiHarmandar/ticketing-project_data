package com.cydeo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;

@Component
public class MapperUtil {

    private final ModelMapper modelmapper;

    public MapperUtil(ModelMapper modelmapper) {
        this.modelmapper = modelmapper;
    }

    public <T> T convert(Object objectToBeConverted, T convertedObject) {
        return modelmapper.map(objectToBeConverted, (Type) convertedObject.getClass());
    }

//    public <T> T convert(Object objectToBeConverted, Class<T> convertedObject) {
//        return modelmapper.map(objectToBeConverted, convertedObject);
//    }

}
