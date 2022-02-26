package com.company;

public class ch_7_method_overloading {
    static void foo(){
        System.out.println("GM");
    }
    static void foo(int a){
        System.out.println("GN " + a);
    }
    static void foo(int a , int b){
        System.out.println("GN " + a + b);
    }



//        static void tellJoke(){
//        System.out.println("hello world this code for overloading");
//    }


    public static void main(String[] args){
//        tellJoke();
        foo();
        foo(100);
        foo(20 + 30);
    }
}
