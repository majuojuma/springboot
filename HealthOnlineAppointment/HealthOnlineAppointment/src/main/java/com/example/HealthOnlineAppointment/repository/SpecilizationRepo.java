package com.example.HealthOnlineAppointment.repository;

import com.example.HealthOnlineAppointment.models.Specilization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecilizationRepo extends JpaRepository<Specilization,Integer> {
}
