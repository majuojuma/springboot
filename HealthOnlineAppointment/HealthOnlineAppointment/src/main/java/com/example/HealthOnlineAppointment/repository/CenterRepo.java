package com.example.HealthOnlineAppointment.repository;

import com.example.HealthOnlineAppointment.models.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepo extends JpaRepository <Center,Integer>{
}
