package model;

import iu.UIMenu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    String specility;

   public Doctor(String name, String email ){
     super(name, email);
    }

    public String getSpecility() {
        return specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }

    ArrayList<AvailableApointment> availableApointments = new ArrayList<>();

    public void  addAvailableApointment(String date, String time){
        availableApointments.add(new Doctor.AvailableApointment(date,time));
    }

    public ArrayList<AvailableApointment> getAvailableApointments(){
        return availableApointments;
    }

    @Override
    public String toString() {
        return super.toString() + "speciality"+ specility + availableApointments.toString();
    }

    @Override
    void showData() {
        System.out.println("Doctor");
    }

    public static class AvailableApointment {
         private int id;
       private Date date;
         private String time;

         SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        AvailableApointment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(Date date) {
            return date;
        }

        public String getDate(){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "date " +date + " time "+ time;
        }
    }

}
