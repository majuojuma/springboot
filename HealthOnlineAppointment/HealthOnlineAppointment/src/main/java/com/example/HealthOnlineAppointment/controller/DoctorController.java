package com.example.HealthOnlineAppointment.controller;

import com.example.HealthOnlineAppointment.models.Doctor;
import com.example.HealthOnlineAppointment.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/doctor")
public class DoctorController {
    @Autowired
    private DoctorRepo doctorRepo;

    @GetMapping("/list")
    public List<Doctor> getAllDoctor(){
        return doctorRepo.findAll();
    }
    @GetMapping("/list/{Dct_id}")
    public Optional<Doctor>getDoctor(@PathVariable Integer Dct_id){
        return doctorRepo.findById(Dct_id);
    }

    @PostMapping("/save")
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorRepo.save(doctor);
    }

    @PutMapping("/update/{Dct_id}")
    public  String updateDoctor(@PathVariable Integer Dct_id,@RequestBody Doctor doctor){
        Doctor updatedDoctor=doctorRepo.findById(Dct_id).get();
        updatedDoctor.setDct_name(doctor.getDct_name());
        updatedDoctor.setDct_email(doctor.getDct_email());
        updatedDoctor.setDct_phone(doctor.getDct_phone());
        doctorRepo.save(updatedDoctor);
        return "the column are updated now";
    }

    @DeleteMapping("/delete/{Dct_id}")
    public String deleteDoctor(@PathVariable Integer Dct_id){
        Doctor deletedDoctor=doctorRepo.findById(Dct_id).get();
        doctorRepo.delete(deletedDoctor);
        return "the row are deleted now";
    }
}
