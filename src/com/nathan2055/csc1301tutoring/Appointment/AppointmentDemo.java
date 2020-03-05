package com.nathan2055.csc1301tutoring.Appointment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppointmentDemo {
    // Define the global calendar ArrayList variable
    private static ArrayList<Appointment> calendar = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    // Add a new appointment
    private static void addAppointment() {
        Appointment newEntry;
        int newYear, newMonth, newDay;
        String newType, newDescription;

        // Ask for a date
        System.out.print("Year? ");
        newYear = input.nextInt();
        System.out.print("Month? ");
        newMonth = input.nextInt();
        System.out.print("Day? ");
        newDay = input.nextInt();

        // Ask for appointment type
        do {
            System.out.print("What type of appointment is this? (onetime, monthly, daily) ");
            newType = input.next();
        } while (!(newType.equals("onetime") || newType.equals("monthly") || newType.equals("daily")));

        // Ask for appointment description
        System.out.print("What description should this appointment have? ");
        newDescription = input.next();

        // Create appointment
        if (newType.equals("onetime")) {
            newEntry = new Onetime(newYear, newMonth, newDay, newDescription);
        } else if (newType.equals("monthly")) {
            newEntry = new Monthly(newDay, newDescription);
        } else if (newType.equals("daily")) {
            newEntry = new Daily(newDescription);
        } else {
            newEntry = null;
        }

        // Add appointment to calendar
        if (newEntry != null) {
            calendar.add(newEntry);
        }

        // Print confirmation
        System.out.println("Successfully added appointment: ");
        System.out.println("Description: " + newDescription);
        System.out.println("Date: " + newYear + "-" + newMonth + "-" + newDay);
        if (newType.equals("onetime")) {
            System.out.println("Appointment type: one-time");
        } else if (newType.equals("monthly")) {
            System.out.println("Appointment type: monthly");
        } else if (newType.equals("daily")) {
            System.out.println("Appointment type: daily");
        }
    }

    // Check what appointments occur on a specific date
    private static void checkOccurrence() {
        // Ask what date we should check
        System.out.println("What date would you like to check?");
        System.out.print("Year: ");
        int testYear = input.nextInt();
        System.out.print("Month: ");
        int testMonth = input.nextInt();
        System.out.print("Day: ");
        int testDay = input.nextInt();

        // Compare all of the saved appointments to the given date and store the descriptions
        ArrayList<String> appointmentInfo = new ArrayList<>();
        for (int i = 1; i <= calendar.size(); i++) {
            Appointment toCheck = calendar.get(i);
            if (toCheck.occursOn(testYear, testMonth, testDay)) {
                appointmentInfo.add(toCheck.getDescription());
            }
        }

        // Print all of the descriptions that we saved
        System.out.print("Appointments occurring on " + testYear + "-" + testMonth + "-" + testDay + ": ");
        System.out.println(Arrays.toString(appointmentInfo.toArray()));
    }

    public static void main(String[] args) {
        // Manually add the old hardcoded calendar entries
        calendar.add(new Onetime(2020, 03, 05, "CS tutoring"));
        calendar.add(new Monthly(10, "Physics test"));
        calendar.add(new Daily("Go to work"));
        calendar.add(new Onetime(2020, 01, 10, "Doctor's appointment"));
        calendar.add(new Onetime(2020, 02, 05, "Dentist appointment"));

        // Interactive interface to calendar
        String command = "";
        do {
            System.out.print("Please enter the command you would like to run (add, viewdate, quit): ");
            command = input.next();
            if (command.equals("add")) {
                addAppointment();
            } else if (command.equals("viewdate")) {
                checkOccurrence();
            }
        } while (!command.equals("quit"));
    }
}
