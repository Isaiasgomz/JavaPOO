package model;




public class Nurse extends User {
    String speciality;


    public Nurse(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }


    @Override
    void showData() {
        System.out.println("Nurse");
    }
}
