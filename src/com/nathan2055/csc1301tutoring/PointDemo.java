package com.nathan2055.csc1301tutoring;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PointDemo {
    public static void main(String[] args) {
        System.out.print("How many points? ");
        //int n = new Scanner(System.in).nextInt();

        Scanner input = new Scanner(System.in);
        int numberOfPoints = 0;
        int inputNumber = input.nextInt();
        numberOfPoints = inputNumber;

        final int MAX = 100;

        ArrayList<Point> points = new ArrayList<Point>();

        for (int i = 0; i < numberOfPoints; i++) {
            points.add(new Point((int) (MAX * Math.random()), (int) (MAX * Math.random())));
        }

        System.out.println(points);
    }
}
