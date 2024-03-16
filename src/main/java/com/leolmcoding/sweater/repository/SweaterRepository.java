package com.leolmcoding.sweater.repository;

import com.leolmcoding.sweater.entities.Sweater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SweaterRepository extends JpaRepository<Sweater, UUID> {
}
