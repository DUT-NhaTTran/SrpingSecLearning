package com.tmnhat.SpringSecEx.repo;

import com.tmnhat.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<Users, Integer>{

    Users findByUsername(String username);
}

