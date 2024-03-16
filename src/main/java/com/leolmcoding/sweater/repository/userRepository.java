package com.leolmcoding.sweater.repository;

import com.leolmcoding.sweater.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface userRepository extends JpaRepository<User, UUID> {
}
