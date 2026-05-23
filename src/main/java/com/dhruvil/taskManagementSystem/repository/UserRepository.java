package com.dhruvil.taskManagementSystem.repository;

import com.dhruvil.taskManagementSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Long, User> {

    Optional<User> findByUserId(Long user_id);
}
