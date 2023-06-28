package com.example.HealthOnlineAppointment.repository;

import com.example.HealthOnlineAppointment.models.DoctorStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorStudentRepo extends JpaRepository<DoctorStudent,Integer> {
}
