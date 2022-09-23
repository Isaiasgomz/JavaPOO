import iu.UIMenu;

import javax.print.Doc;
import java.util.Date;

import static iu.UIMenu.*;

public class Main {
    public static void main(String[] args) {


        Doctor myDoctor = new Doctor("Isias gomez", "Pediatria");



        Doctor doctorIsa = new Doctor("Isias gomez","Pediatria");


        Patient patient = new Patient("Isaias", "isaiasrobles2003@gmail.com");

        patient.setWeight(60.4);

        System.out.println(patient.getWeight());

        patient.setPhoneNumber("97116385");

        System.out.println(patient.getPhoneNumber());


        doctorIsa.addAvailableApointment(new Date(), "14:00");
        doctorIsa.addAvailableApointment(new Date(), "17:00");
        doctorIsa.addAvailableApointment(new Date(), "19:00");

        System.out.println(doctorIsa.getAvailableApointments());
        for (Doctor.AvailableApointment aA: doctorIsa.getAvailableApointments()) {
            System.out.println(aA.getTime() + aA.getDate());
        }

        System.out.println(doctorIsa);


//        ShowMenu();

    }


}