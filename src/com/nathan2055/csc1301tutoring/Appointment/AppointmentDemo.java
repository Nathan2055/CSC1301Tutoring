package com.nathan2055.csc1301tutoring.Appointment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppointmentDemo {
    public static void main(String[] args) {
        Appointment[] calendar = new Appointment[5];
        ArrayList<String> appointmentInfo = new ArrayList<>();

        calendar[0] = new Onetime(2020, 03, 05, "CS tutoring");
        calendar[1] = new Monthly(10, "Physics test");
        calendar[2] = new Daily("Go to work");
        calendar[3] = new Onetime(2020, 01, 10, "Doctor's appointment");
        calendar[4] = new Onetime(2020, 02, 05, "Dentist appointment");

        Scanner input = new Scanner(System.in);
        System.out.println("What date would you like to check?");
        System.out.print("Year: ");
        int testYear = input.nextInt();
        System.out.print("Month: ");
        int testMonth = input.nextInt();
        System.out.print("Day: ");
        int testDay = input.nextInt();

        for (int i = 0; i < 5; i++) {
            if (calendar[i].occursOn(testYear, testMonth, testDay)) {
                appointmentInfo.add(calendar[i].getDescription());
            }
        }

        System.out.print("Appointments occurring on " + testYear + "-" + testMonth + "-" + testDay + ": ");
        System.out.println(Arrays.toString(appointmentInfo.toArray()));
    }
}
