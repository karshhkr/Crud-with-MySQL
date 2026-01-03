package com.MySQL.crud.Crud.with.MySQL.dao;

import com.MySQL.crud.Crud.with.MySQL.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
