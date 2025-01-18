package com.exampleheshan.heshanspringboot.repository;


import com.exampleheshan.heshanspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
