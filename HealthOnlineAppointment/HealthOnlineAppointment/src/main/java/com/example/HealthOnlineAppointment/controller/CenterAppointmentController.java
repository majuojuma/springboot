package com.example.HealthOnlineAppointment.controller;

import com.example.HealthOnlineAppointment.models.CenterAppointment;
import com.example.HealthOnlineAppointment.repository.CenterAppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/centerappointment")
public class CenterAppointmentController {
    @Autowired
    private CenterAppointmentRepo centerAppointmentRepo;

    @GetMapping("/list")
    public List<CenterAppointment>getAllCenterAppointment(){
        return centerAppointmentRepo.findAll();
    }

    @PostMapping("/save")
    public CenterAppointment createCenterAppointment(@RequestBody CenterAppointment centerAppointment){
        return centerAppointmentRepo.save(centerAppointment);
    }

    @PutMapping("/update/{S_Id}")
    public String updateCenterAppointment(@PathVariable Integer S_Id,@RequestBody CenterAppointment centerAppointment){
        CenterAppointment updatedCenterAppointment=centerAppointmentRepo.findById(S_Id).get();
        updatedCenterAppointment.setCenterID(centerAppointment.getCenterID());
        updatedCenterAppointment.setAppontment_id(centerAppointment.getAppontment_id());
        centerAppointmentRepo.save(updatedCenterAppointment);
        return "row are updated";
    }
    @DeleteMapping("/delete{S_Id}")
    public String deleteCenterAppointment(@PathVariable Integer S_Id){
        CenterAppointment deletedCenterAppointment=centerAppointmentRepo.findById(S_Id).get();
        centerAppointmentRepo.delete(deletedCenterAppointment);
        return "data are deleted now"+ S_Id;
    }


}
