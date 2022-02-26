package com.company;

class Vehicle {
    int wheels;

    Vehicle(){
        wheels = 4;
    }
}
class horn{
    int hornn;

    horn(){
        hornn = 90;    }
}
public class myConstructor {


    public static void main(String [] args){

        Vehicle car = new Vehicle();

        System.out.println(car.wheels);

        horn h = new horn();

        System.out.println(h.hornn);
    }
}
