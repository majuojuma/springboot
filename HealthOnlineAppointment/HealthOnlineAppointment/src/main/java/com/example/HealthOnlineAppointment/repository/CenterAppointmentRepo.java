package com.example.HealthOnlineAppointment.repository;

import com.example.HealthOnlineAppointment.models.CenterAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterAppointmentRepo extends JpaRepository<CenterAppointment,Integer> {
}
