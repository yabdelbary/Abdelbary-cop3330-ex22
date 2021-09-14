package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Enter the first number: ");
       Scanner sc = new Scanner(System.in);
       int first_number = Integer.parseInt(sc.nextLine());
       System.out.println("Enter the secoond number: ");
       int second_number = Integer.parseInt(sc.nextLine());
       System.out.println("Enter the third number: ");
       int third_number = Integer.parseInt(sc.nextLine());
       String res = "The largest number is ";
       if(first_number > second_number && first_number > third_number){
           res = res + first_number;
       }else if(second_number > first_number && second_number > third_number){
           res = res + second_number;
       }else{
           res = res + third_number;
       }
       System.out.println(res);
    }
}
