package iu;

import java.util.Scanner;

public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero", "Marzo","Abril",
            "Mayo","Junio","Julio","Agosto","Septiembre",
            "Octubre","Noviembre","Diciembre"};

    public static void ShowMenu(){
        System.out.println("Welcome to my Apointments");
        System.out.println("Seleccion la opcion Deseada");

        int response = 0;


        do{
            System.out.println("1.Doctor");
            System.out.println("2.Patient");
            System.out.println("0.Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response =0;
                    ShowPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Select one Correct Answer");
            }
        }while (response != 0);
    }

    public static void ShowPatientMenu(){
        int response = 0;
        do{

            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an Appoinment");
            System.out.println("2. My Appointmennts");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println(":: Book an Apontiment");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i +"."+MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My Apointments");
                    break;
                case 0:
                    ShowMenu();
                    break;
            }
        }while (response != 0);

    }
}
