/* Question: Write a program to calculate percentage of a given student in CBSE
board exam. His marks from 5 subjects must be taken as input from the
keyboard (marks out of hundred)
 */
package com.company;
import java.util.Scanner;

public class CalculatePercentageOf5Subjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 500;

        System.out.print("sub1 marks: ");
        float sub1 =  sc.nextFloat();

        System.out.print("sub2 marks: ");
        float sub2 =  sc.nextFloat();

        System.out.print("sub3 marks: ");
        float sub3 =  sc.nextFloat();

        System.out.print("sub4 marks: ");
        float sub4 =  sc.nextFloat();

        System.out.print("sub5 marks: ");
        float sub5 =  sc.nextFloat();

        System.out.print("total marks: ");
        float obtainedTotalMarks = sub1+sub2+sub3+sub4+sub5;
        System.out.println(obtainedTotalMarks);

        float percentage = (obtainedTotalMarks / totalMarks) * 100;
        System.out.println(percentage);

        // to print %
        System.out.print("percentage of marks in 5 subjects: " + percentage + "%");

    }
}
