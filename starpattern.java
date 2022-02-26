package com.company;
import java.util.Scanner;

public class starpattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while( temp > 0){
            int lastdigit = temp % 10;
            temp = temp / 10;

            sum = sum + lastdigit;

        }
        System.out.println(sum);
    }
}
