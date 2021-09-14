/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alko-cop3330-ex07
 */




package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int length=sc.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width=sc.nextInt();
        System.out.println("You entered dimensions of "+length+" by "+width+" feet.");


        int area=length*width;
        final double conversion = area*0.093;


        System.out.println("The area is");
        System.out.println(area+" square feet");
        System.out.println(conversion+" square meters");
    }
}
