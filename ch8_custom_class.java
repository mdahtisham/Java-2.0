package com.company;

class Employee {
    int id;
    String name;

public void printDetails(){
    System.out.println("My name is: " + name);
    System.out.println("My is id: " + id);


}
}


public class ch8_custom_class {
    public static void main(String[] args){
        System.out.println("Custom class");
        Employee coder = new Employee();
        Employee john = new Employee();
        coder.name  = "code";
        coder.id = 15;
        john.name = "jimmy";
        john.id = 18;



//        System.out.println(coder.name);
//        System.out.println(coder.id);

        coder.printDetails();
        john.printDetails();

    }
}
