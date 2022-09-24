package iu;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Welcome Patient "+ UIMenu.patientLogged.getName());
            System.out.println("1.Book an Appointment");
            System.out.println("2. My appointments");
            System.out.println("0.Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAnAppointments();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.ShowMenu();
                    break;

            }

        }while (response != 0);
    }


    private static void showBookAnAppointments(){
        int response = 0;

        do {
            System.out.println("::Book an Appointment");
            System.out.println("::Select Date");

            Map<Integer,Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.availableApponmentsDoctors.size(); i++) {

                ArrayList<Doctor.AvailableApointment> availableApointments
                        =
                 UIDoctorMenu.availableApponmentsDoctors.get(i).getAvailableApointments();

                Map<Integer, Doctor> doctorsAppointment = new TreeMap<>();

                for (int j = 0; j < availableApointments.size(); j++) {
                    k++;
                    System.out.println(k+"."+ availableApointments.get(j).getDate());

                    doctorsAppointment.put(Integer.valueOf(j),
                            UIDoctorMenu.availableApponmentsDoctors.get(i));

                    doctors.put(Integer.valueOf(k), doctorsAppointment);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected =  Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableAppointment = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");

            for (Map.Entry<Integer,Doctor> doc: doctorAvailableAppointment.entrySet() ) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +" . Date: " +
                    doctorSelected.getAvailableApointments().get(indexDate).getDate() +
        " . Time: " +
                    doctorSelected.getAvailableApointments().get(indexDate).getTime());

            System.out.println("Confirm your Appointment \n1. Yes \n2. Change" );
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableApointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableApointments().get(indexDate).getTime()
                );

                showPatientMenu();
            }



        }while (response != 0);
    }


    private static void showPatientMyAppointments(){
        int response = 0;

        do {
            System.out.println("::My Appointments");

            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Dont have Appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i+1;
                System.out.println(j+"."+
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName() );
            }

            System.out.println("0. Return");

        }while (response != 0);
    }

}
