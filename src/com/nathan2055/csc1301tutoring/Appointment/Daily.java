package com.nathan2055.csc1301tutoring.Appointment;

public class Daily extends Appointment {
    public Daily(String info) {
        date[0] = 0;
        date[1] = 0;
        date[2] = 0;
        description = info;
    }

    public boolean occursOn(int year, int month, int day) {
        return true;
    }
}
