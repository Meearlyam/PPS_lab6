package Clinic_package;

import Entity.MedService;

import java.util.ArrayList;

public class Doctor {
    private int id;
    private String FIO;
    private String phoneNumber;
    private int experience;
    private String email;
    private String address;
    private String specialization;
    static int lastId = 0;


    public Doctor(String FIO, String phoneNumber, int experience, String email,
                  String address, String specialization) {
        this.id = lastId + 1;
        lastId = lastId + 1;
        this.FIO = FIO;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.email = email;
        this.address = address;
        this.specialization = specialization;
    }

    public int getId() { return id; }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

