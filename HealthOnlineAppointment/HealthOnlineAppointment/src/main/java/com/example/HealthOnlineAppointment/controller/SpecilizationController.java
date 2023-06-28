package com.example.HealthOnlineAppointment.controller;

import com.example.HealthOnlineAppointment.models.Specilization;
import com.example.HealthOnlineAppointment.repository.SpecilizationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/specilization")
public class SpecilizationController {
    @Autowired
    private SpecilizationRepo specilizationRepo;

    @GetMapping("/list")
    public List<Specilization> getAllSpecilization(){
        return specilizationRepo.findAll();
    }

    @GetMapping("/list/{S_Id}")
    public Optional<Specilization>getSpecilization(@PathVariable Integer S_Id){
        return specilizationRepo.findById(S_Id);
    }

    @PostMapping("/save")
    public Specilization createSpecilization(@RequestBody Specilization specilization){
        return specilizationRepo.save(specilization);
    }

    @PutMapping("/update/{S_Id}")
    public String updateSpecilization(@PathVariable Integer S_Id,@RequestBody Specilization specilization){
        Specilization updatedSpecilization=specilizationRepo.findById(S_Id).get();
        updatedSpecilization.setS_Name(specilization.getS_Name());
        specilizationRepo.save(updatedSpecilization);
        return "data are updated now";
    }
    @DeleteMapping("/delete/{S_Id}")
    public String deleteSpecilization(@PathVariable Integer S_Id){
        Specilization deletedSpecilization=specilizationRepo.findById(S_Id).get();
        specilizationRepo.delete(deletedSpecilization);
        return "the row are deleted"+ S_Id;
    }
}
