//package com.epam.rd.autocode.assestment.linearcalculations;

import java.text.DecimalFormat;


public class LinearCalculation {


    public static double findCarsDistance(double car1Speed, double car2Speed, double initialDistance, double time) {
        double totalSpeed = car1Speed + car2Speed;
        double generalWay = time * totalSpeed;
        double distance = initialDistance + generalWay;
        return distance;
    }
    public static void printDistance(double car1Speed, double car2Speed, double initialDistance, double time) {
        double distance = findCarsDistance(car1Speed, car2Speed, initialDistance, time);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("V1 = " + car1Speed + " km/h; V2 = " + car2Speed + " km/h; S = " + initialDistance + " km; T = " + time + " h  =>  Distance = " + decimalFormat.format(distance) + " km");
    }
    public static void main(String[] args) {
        printDistance(90.0, 110.0, 65.0, 3.0);
        printDistance(65.5, 90.4, 20.9, 1.5);
        printDistance(70.0, 85.6, 32.6, 2.0);
    }
}


