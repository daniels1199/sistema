package com.exemple.sistema.repositories;

import com.exemple.sistema.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
        
}
