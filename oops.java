package com.company;

class cat {
    int leg, eyes;
    public void walk(){
       System.out.println("cat is waliking");
    }
    public void miyaw(){
        System.out.println("cat is saying Miyaw");
    }
    public void legEyes(){
        System.out.println( "leg = " + leg + "  ,  " + "eyes = " + eyes);
    }
}

class dog{

    public void jump(){
        System.out.println("Dog easily can Jump");
    }
}

public class oops {
    public static void main(String [] args){
        cat cat1 = new cat();
        cat cat2 = new cat();


        cat1.leg = 4;
        cat1.eyes = 2;

        cat2.leg = 8;
        cat2.eyes = 4;



        cat1.walk();
        cat1.miyaw();
        cat1.legEyes();

        cat2.miyaw();
        cat2.legEyes();



        dog dog1 = new dog();

        dog1.jump();

    }
}
