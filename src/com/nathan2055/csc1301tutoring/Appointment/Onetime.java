package com.nathan2055.csc1301tutoring.Appointment;

public class Onetime extends Appointment {
    public Onetime(int year, int month, int day, String info) {
        date[0] = year;
        date[1] = month;
        date[2] = day;
        description = info;
    }
}
