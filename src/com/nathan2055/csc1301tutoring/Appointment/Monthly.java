package com.nathan2055.csc1301tutoring.Appointment;

public class Monthly extends Appointment {
    public Monthly(int day, String info) {
        date[0] = 0;
        date[1] = 0;
        date[2] = day;
        description = info;
    }


    public boolean occursOn(int year, int month, int day) {
        if (day == date[2]) {
            return true;
        } else {
            return false;
        }
    }
}
