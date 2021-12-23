package com.online.groceryStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.groceryStore.model.User;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
