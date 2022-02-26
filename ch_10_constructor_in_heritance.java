package com.company;


class Base1{
    Base1(){
        System.out.println("mai ek constructor hu");
    }

}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("dervd class constructor");
    }
    public int y;

}

public class ch_10_constructor_in_heritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();


    }
}
