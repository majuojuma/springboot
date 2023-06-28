package com.example.HealthOnlineAppointment.controller;


import com.example.HealthOnlineAppointment.models.Appointment;
import com.example.HealthOnlineAppointment.repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentRepo appointmentRepo;

    @GetMapping("/list")
    public List<Appointment> gerAllAppointment(){
        return appointmentRepo.findAll();
    }

    @GetMapping("/list/{Appointment_id}")
    public Optional<Appointment>getAppointment(@PathVariable Integer Appointment_id){
        return appointmentRepo.findById(Appointment_id);
    }

    @PostMapping("/save")
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return appointmentRepo.save(appointment);
    }

    @PutMapping("/update/{Appointment_id}")
    public String updateAppointment(@PathVariable Integer Appointment_id,@RequestBody Appointment appointment){
        Appointment updtedAppointment=appointmentRepo.findById(Appointment_id).get();
        updtedAppointment.setTime(appointment.getTime());
        updtedAppointment.setDate(appointment.getDate());
        appointmentRepo.save(updtedAppointment);
        return "row are updeted";
    }

    @DeleteMapping("/delete/{Appointment_id}")
    public String deleteAppointment(@PathVariable Integer Appointment_id){
        Appointment deleteAppointment=appointmentRepo.findById(Appointment_id).get();
        appointmentRepo.delete(deleteAppointment);
        return "the apppointment are deleted" + Appointment_id;
    }
}
