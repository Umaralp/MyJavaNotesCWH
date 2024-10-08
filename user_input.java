package com.company;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        // creating a new object 'sc' using a scanner class 'Scanner'
        Scanner sc = new Scanner(System.in);

        // 1. method ---> .nextInt()
        System.out.println("enter the number a: ");
        int a = sc.nextInt();
        System.out.println("enter the number b: ");
        int b = sc.nextInt();
        int sum1 = a + b;
        System.out.println("the sum of 2 numbers is: ");
        System.out.println(sum1);

        /* same program for decimal numbers
         2. method ---> .nextFloat() */
        System.out.println("enter the number c: ");
        float c = sc.nextFloat();
        System.out.println("enter the number d: ");
        float d = sc.nextFloat();
        float sum2 = c + d;
        System.out.println("the sum of 2 decimal numbers is: ");
        System.out.println(sum2);

        // 3. method ---> .hasNextInt()
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        // returns true if number entered is an integer else returns false
        //helps to check validity of the information entered by the user

        // 4. method ---> .next()
        String str = sc.next();
        System.out.println(str);
        //it reads the the 1st word and ignores the next inputted string

        // 5. method ---> .nextLine()
        String str1 = sc.nextLine();
        System.out.println(str1);
        //it reads the the whole string inputted by the user

    }

}
