package com.example.HealthOnlineAppointment.repository;

import com.example.HealthOnlineAppointment.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
}
