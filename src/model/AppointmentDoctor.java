package model;

import java.util.Date;

public class AppointmentDoctor implements IShedulable {


    int id;
    Doctor doctor;
    Patient patient;
    Date date;
    String time;


    public AppointmentDoctor(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time+ " hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedulable(Date date, String time) {
        this.date = date;
        this.time = time;

    }
}
