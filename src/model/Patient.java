package model;

import iu.UIMenu;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthDay;
    private double weight;
    private double height;
    private String blood;

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(doctor,this);
        appointmentDoctor.schedulable(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();


   public Patient(String name, String email){
        super(name, email);
    }

    @Override
    void showData() {
        System.out.println("Patient");
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

//    @Override
//    public String toString() {
//        return "birthDay " +birthDay +" weight "+ weight;
//    }
}
