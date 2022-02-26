package com.company;

public class ch_7_variables {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b;
//    }
    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }



    public static void main(String[] args){
        System.out.println(sum(8 , 8));
        System.out.println(sum(4 , 4));
        System.out.println(sum(4 , 4, 4));

    }
}
