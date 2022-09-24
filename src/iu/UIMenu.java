package iu;

import model.Doctor;
import model.Patient;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

   public static Doctor doctorLogged;
   public static Patient patientLogged;

    public static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};

    public static void ShowMenu() {
        System.out.println("Welcome to my Apointments");
        System.out.println("Seleccion la opcion Deseada");

        int response = 0;


        do {
            System.out.println("1.model.Doctor");
            System.out.println("2.model.Patient");
            System.out.println("0.Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("model.Doctor");
                    response =0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
//                    ShowPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Select one Correct Answer");
            }
        } while (response != 0);
    }

    private static void authUser(int typeUser){

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Agustin Lens", "agus@gmail.com"));
        doctors.add(new Doctor("Leonel Robledo", "leo@gmail.com"));
        doctors.add(new Doctor("Marcos Laurens", "marquis@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Isaias gomez","isaias@gmail.com"));
        patients.add(new Patient("Bautista Baigorri","bauti@gmail.com"));
        patients.add(new Patient("Julia Parlavechio","juli@gmail.com"));



        boolean emailCorrect = false;
        do{


            System.out.println("Introduzca su email [a@a]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();


           if(typeUser == 1){
               for (Doctor d:doctors) {
                    if (d.getEmail().equals(email)){
                        emailCorrect= true;
                        doctorLogged =d;
                        UIDoctorMenu.showDoctorMenu();
                    }
               }
           }

           if (typeUser == 2){
               for (Patient p :patients) {
                   if (p.getEmail().equals(email)){
                       emailCorrect= true;
                       patientLogged = p;
                       UIPatientMenu.showPatientMenu();
                   }
               }
           }
        }while (!emailCorrect);
    }
    public static void ShowPatientMenu() {
        int response = 0;
        do {

            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an Appoinment");
            System.out.println("2. My Appointmennts");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(":: Book an Apontiment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i + "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My Apointments");
                    break;
                case 0:
                    ShowMenu();
                    break;
            }
        } while (response != 0);

    }

}