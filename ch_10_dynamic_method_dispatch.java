package com.company;

class One{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class Two extends One{
    public void fav(){
        System.out.println("Java is my fav");
    }
    public void name(){
        System.out.println("My name is Java in class two");
    }
}


public class ch_10_dynamic_method_dispatch {
    public static void main(String[] args) {
        One obj = new Two();
        obj.name();
    }
}
