package com.wsassignment.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wsassignment.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
