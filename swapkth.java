package com.company;
import java.util.Scanner;
public class swapkth {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
        Scanner fc = new Scanner(System.in);
        int k= sc.nextInt();

        int [] a = new int [n];
        int temp = a[n-k];
        a[n-k] = a[n+k];
        a[n+k] = temp;

System.out.println(a[n]);


}
}