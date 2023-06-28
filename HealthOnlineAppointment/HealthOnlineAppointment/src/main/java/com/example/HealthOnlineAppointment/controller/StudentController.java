package com.example.HealthOnlineAppointment.controller;

import com.example.HealthOnlineAppointment.models.Student;
import com.example.HealthOnlineAppointment.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/list")
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }
    @GetMapping("/list/{std_id}")
    public Optional<Student>getStudent(@PathVariable Integer std_id,@RequestBody Student student){
        return studentRepo.findById(std_id);
    }

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }

    @PutMapping("/update/{std_id}")
    public String updateStudent(@PathVariable Integer std_id,@RequestBody Student student){
        Student updatedStudent=studentRepo.findById(std_id).get();
        updatedStudent.setStd_name(student.getStd_name());
        updatedStudent.setCampus(student.getCampus());
        updatedStudent.setProgram(student.getProgram());
        studentRepo.save(updatedStudent);
        return  "row are updated";
    }

    @DeleteMapping("/delete/{std_id}")
    public String deleteStudent(@PathVariable Integer std_id){
        Student deletedStudent=studentRepo.findById(std_id).get();
        studentRepo.delete(deletedStudent);
        return "one student deleted now"+ std_id;
    }
}
