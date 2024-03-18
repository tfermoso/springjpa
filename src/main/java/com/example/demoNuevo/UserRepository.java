package com.example.demoNuevo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

   public User findUserByUsername(String username);
}
