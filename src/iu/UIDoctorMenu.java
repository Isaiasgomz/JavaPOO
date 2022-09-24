package iu;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    static ArrayList<Doctor> availableApponmentsDoctors = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;



        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. add available appointment");
            System.out.println("2. my Scheduled Appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.ShowMenu();
                    break;
            }

        }while (response != 0);
    }


    public static void showAddAvailableAppointmentsMenu(){
      int response = 0;

      do {
          System.out.println("add Available Appointments");
          System.out.println("Select Month");
          for (int i = 0; i < 3; i++) {
              int j = i +1;
              System.out.println(j+". "+UIMenu.MONTHS[i]);
          }
          System.out.println("0. Return");

          Scanner sc = new Scanner(System.in);
          response = Integer.valueOf(sc.nextLine());

          if(response >0 && response < 4){
              int monthSelected = response;
              System.out.println("Month Selected "+ UIMenu.MONTHS[monthSelected-1]);

              System.out.println("Insert your date available: [dd/mm/yyyy]");
              String date = sc.nextLine();

              System.out.println("your date is : " +date+ "\n1.Correct \n2.Change date");
              int responseDate = Integer.valueOf(sc.nextLine());
              if (responseDate == 2) continue;

              int responseValidate = 0;
              String time = "";
              do {
                  System.out.println("insert your time for date "+date + "in this format [16:00]");
                   time = sc.nextLine();

                  System.out.println("your time is: "+ time+ "\n1.Correct \n2.Change" );
                  responseValidate = Integer.valueOf(sc.nextLine());

              }while (responseValidate ==2);

              UIMenu.doctorLogged.addAvailableApointment(date,time);
              checkAvailableAppointments(UIMenu.doctorLogged);


          } else if (response == 0) {
              showDoctorMenu();
          }


      }while (response != 0);
    }

    private static void checkAvailableAppointments(Doctor doctor){
        if(doctor.getAvailableApointments().size() > 0 && !availableApponmentsDoctors.contains(doctor) ){
            availableApponmentsDoctors.add(doctor);
        }
    }
}
