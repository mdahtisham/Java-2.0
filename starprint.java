package com.company;

public class starprint {
    public static void main(String [] args){

//        for (int j = 1; j <=20; j++) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.print(i * j + " ");
////                System.out.println();
//            }
//            System.out.println(" ");
//        }

        for (int j = 5; j<=1; j--) {
            for (int i = 5; i <= j; i--) {
                System.out.print("*" + " ");
            }
                System.out.println();
        }
    }
}
