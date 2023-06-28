package com.example.HealthOnlineAppointment.repository;

import com.example.HealthOnlineAppointment.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {
}
