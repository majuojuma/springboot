package com.example.HealthOnlineAppointment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Specilization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int S_Id;
    public String S_Name;

    public int getS_Id() {
        return S_Id;
    }

    public void setS_Id(int s_Id) {
        S_Id = s_Id;
    }

    public String getS_Name() {
        return S_Name;
    }

    public void setS_Name(String s_Name) {
        S_Name = s_Name;
    }
}
