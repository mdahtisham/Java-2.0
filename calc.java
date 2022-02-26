package com.company;
import java.util.Scanner;

public class calc {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sub1 marks: ");
        float sub1 = sc.nextInt();
        System.out.println("Enter your sub2 marks: ");
        float sub2 = sc.nextInt();
        System.out.println("Enter your sub3 marks: ");
        float sub3 = sc.nextInt();
        System.out.println("Enter your sub4 marks: ");
        float sub4 = sc.nextInt();
        System.out.println("Enter your sub5 marks: ");
        float sub5 = sc.nextInt();

        float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5)/500)*100;
        System.out.print("Percentage : ");
        System.out.println(percentage);
    }
}
