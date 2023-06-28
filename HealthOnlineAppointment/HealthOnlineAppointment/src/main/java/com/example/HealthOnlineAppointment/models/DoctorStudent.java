package com.example.HealthOnlineAppointment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DoctorStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int drstd_id;
    public int Dct_id;
    public int Std_id;

    public int getDct_id() {
        return Dct_id;
    }

    public void setDct_id(int dct_id) {
        Dct_id = dct_id;
    }

    public int getStd_id() {
        return Std_id;
    }

    public void setStd_id(int std_id) {
        Std_id = std_id;
    }

    public int getDrstd_id() {
        return drstd_id;
    }

    public void setDrstd_id(int drstd_id) {
        this.drstd_id = drstd_id;
    }
}
