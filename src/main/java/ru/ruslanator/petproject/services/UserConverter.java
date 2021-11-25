package ru.ruslanator.petproject.services;

import org.springframework.stereotype.Component;
import ru.ruslanator.petproject.dtos.UsersDto;
import ru.ruslanator.petproject.entities.Users;

@Component
public class UserConverter {
    public UsersDto fromUserToUserDto(Users users){
        return UsersDto.builder().
                id(users.getId()).
                login(users.getLogin()).
                name(users.getName()).
                email(users.getEmail()).
                build();
    }

    public Users fromUserDtoToUser(UsersDto usersDto){
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setEmail(usersDto.getEmail());
        users.setName(usersDto.getName());
        users.setLogin(usersDto.getLogin());
        return users;
    }
}
