package net.javaguides.bankmanagementsystem.service;

import java.util.List;

import net.javaguides.bankmanagementsystem.dto.UserRegistrationDto;
//dto object for server to client vice versa
import net.javaguides.bankmanagementsystem.entity.User;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);


    User getUserById(Long id);

    User updatUser(User user);

    void deleteUserById(Long id);

    User save(UserRegistrationDto registrationDto);

}
