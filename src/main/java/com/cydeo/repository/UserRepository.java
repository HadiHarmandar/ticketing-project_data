package com.cydeo.repository;

import com.cydeo.entity.Role;
import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByIsDeletedOrderByFirstNameDesc(Boolean deleted);

    // get user based on username
    User findByUserNameAndIsDeleted(String userName, Boolean deleted);
    @Transactional
    void deleteByUserName(String userName);
    List<User> findByRoleDescriptionIgnoreCaseAndIsDeleted(String role_description, Boolean deleted);

}
