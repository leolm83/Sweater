package com.leolmcoding.sweater.repository;

import com.leolmcoding.sweater.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {
}
