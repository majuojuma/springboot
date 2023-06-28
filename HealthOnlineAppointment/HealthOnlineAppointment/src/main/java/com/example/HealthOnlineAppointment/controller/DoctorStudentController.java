package com.example.HealthOnlineAppointment.controller;

import com.example.HealthOnlineAppointment.models.DoctorStudent;
import com.example.HealthOnlineAppointment.repository.DoctorStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/doctorstudent")
public class DoctorStudentController {
    @Autowired
    private DoctorStudentRepo doctorStudentRepo;

    @GetMapping("/list")
    public List<DoctorStudent> getAllDoctorStudent(){
        return doctorStudentRepo.findAll();
    }

    @PostMapping("/save")
    public DoctorStudent createDoctorStudent(@RequestBody DoctorStudent doctorStudent){
        return doctorStudentRepo.save(doctorStudent);
    }

    @PutMapping("/update/{drstd_id}")
    public String updateDoctorStudent(@PathVariable Integer drstd_id,@RequestBody DoctorStudent doctorStudent){
        DoctorStudent updatedDoctorStudent=doctorStudentRepo.findById(drstd_id).get();
        updatedDoctorStudent.setDct_id(doctorStudent.getDct_id());
        updatedDoctorStudent.setStd_id(doctorStudent.getStd_id());
        doctorStudentRepo.save(updatedDoctorStudent);
        return "row are updated";
    }

    @DeleteMapping("/delete/{drstd_id}")
    public String deleteDoctorStudent(@PathVariable Integer drstd_id){
        DoctorStudent deletedDoctorStudent=doctorStudentRepo.findById(drstd_id).get();
        doctorStudentRepo.delete(deletedDoctorStudent);
        return "data are deleted now"+ drstd_id;
    }
}
