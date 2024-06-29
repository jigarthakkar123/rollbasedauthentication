package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface UserRepository extends CrudRepository<User, Long> {
 
    @Query("SELECT u FROM User u WHERE u.full_name = :username")
    public User getUserByUsername(@Param("username") String username);
}