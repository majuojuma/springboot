package com.example.HealthOnlineAppointment.controller;

import com.example.HealthOnlineAppointment.models.Appointment;
import com.example.HealthOnlineAppointment.models.Center;
import com.example.HealthOnlineAppointment.repository.AppointmentRepo;
import com.example.HealthOnlineAppointment.repository.CenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/center")
public class CenterController {
    @Autowired
    private CenterRepo centerRepo;

    @GetMapping("/list")
    public List<Center>getAllCenter(){
        return centerRepo.findAll();
    }
    @PostMapping("/save")
    public Center createCenter(@RequestBody Center center){
        return centerRepo.save(center);
    }

    @PutMapping("/update/{centerID}")
    public String updateCenter(@PathVariable Integer centerID,@RequestBody Center center){
        Center updatedCenter=centerRepo.findById(centerID).get();
        updatedCenter.setCenterName(center.getCenterName());
        centerRepo.save(updatedCenter);
        return "the column are updated";
    }

    @DeleteMapping("/dalate/{centerID}")
    public String deleteCenter(@PathVariable Integer centerID){
        Center deleteCenter = centerRepo.findById(centerID).get();
        centerRepo.delete(deleteCenter);
        return "the column are deleted"+centerID;
    }
}
