package com.example.HealthOnlineAppointment.repository;

import com.example.HealthOnlineAppointment.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
