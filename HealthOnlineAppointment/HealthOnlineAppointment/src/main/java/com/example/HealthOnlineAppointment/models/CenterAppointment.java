package com.example.HealthOnlineAppointment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CenterAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int centerID;
    private int Appontment_id;

    public int getCenterID() {
        return centerID;
    }

    public void setCenterID(int centerID) {
        this.centerID = centerID;
    }

    public int getAppontment_id() {
        return Appontment_id;
    }

    public void setAppontment_id(int appontment_id) {
        Appontment_id = appontment_id;
    }
}
