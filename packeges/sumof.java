package com.company;

import java.util.Scanner;

public class sumof {
    public static void main(String [] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i=0; i<a.length; i++){
            sum = (sum+i);
            System.out.println(sum);

        }
    }
}
