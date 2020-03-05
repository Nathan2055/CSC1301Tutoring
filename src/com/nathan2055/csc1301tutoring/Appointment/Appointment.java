package com.nathan2055.csc1301tutoring.Appointment;

public class Appointment {
    // Store date as yyyy, mm, dd
    int[] date = new int[3];
    String description = "";

    public boolean occursOn(int year, int month, int day) {
        if (year == date[0] && month == date[1] && day == date[2]) {
            return true;
        } else {
            return false;
        }
    }

    public String getDescription() {
        return description;
    }
    public int[] getDate() {
        return date;
    }
}
