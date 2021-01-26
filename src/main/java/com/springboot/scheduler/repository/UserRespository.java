package com.springboot.scheduler.repository;

import com.springboot.scheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Integer> {
}
