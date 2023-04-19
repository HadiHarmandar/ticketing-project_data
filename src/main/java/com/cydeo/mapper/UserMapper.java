package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.Role;
import com.cydeo.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends BaseMapper<UserDTO, User> {


    public UserMapper(ModelMapper modelmapper) {
        super(modelmapper);
    }

    public User convertToEntity(UserDTO dto) {
        return getModelmapper().map(dto, User.class);
    }

    public UserDTO convertToDto(User entity) {
        return getModelmapper().map(entity, UserDTO.class);
    }
}
