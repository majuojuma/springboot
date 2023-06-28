package com.example.HealthOnlineAppointment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Dct_id;
    public String Dct_name;
    public String Dct_email;
    public String Dct_phone;


    public int getDct_id() {
        return Dct_id;
    }

    public void setDct_id(int dct_id) {
        Dct_id = dct_id;
    }

    public String getDct_name() {
        return Dct_name;
    }

    public void setDct_name(String dct_name) {
        Dct_name = dct_name;
    }

    public String getDct_email() {
        return Dct_email;
    }

    public void setDct_email(String dct_email) {
        Dct_email = dct_email;
    }

    public String getDct_phone() {
        return Dct_phone;
    }

    public void setDct_phone(String dct_phone) {
        Dct_phone = dct_phone;
    }
}
