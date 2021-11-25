package ru.ruslanator.petproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ruslanator.petproject.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByLogin(String login);
}
