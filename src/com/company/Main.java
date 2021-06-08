package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double money=100000000;
        int month=3;
        double interset_rate=5.5;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter investment amount ");
        money=scanner.nextInt();
        System.out.println("Enter number of month");
        month=scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage");
        interset_rate =scanner.nextDouble();
        double total_interset=0;
        for (int i = 0; i < month; i++) {
            total_interset+=money*(interset_rate/100)/12*month;
            System.out.println("Total of interest"+ total_interset);
        }
    }
}
