package ru.ruslanator.petproject.services;



import ru.ruslanator.petproject.dtos.UsersDto;

import java.util.List;

public interface UserService {

    UsersDto saveUser(UsersDto userDto);

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}
