package com.company;

public class methods {
    public static void main(String[] args) {
        int firstNumber = 34;
        int secondNumber = 83;

        int result = maxOf(firstNumber, secondNumber);

        int a = maxOf(3, 1);
        maxOf(90, 11);

        System.out.println(result);
        System.out.println(a);

        hello();

        maxOf(2, 5, 8);
        maxOf(44,88);
    }

    static int maxOf(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(b);
            return b;
        }
    }


    static int maxOf( int a, int b, int c) {
        System.out.println(a + b + c);
        return 0;
    }



    static int hello(){
        System.out.println("Hii");
        System.out.println("Good Morning");
       return 0;
    }

}
