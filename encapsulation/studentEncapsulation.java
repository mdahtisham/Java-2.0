package com.company.encapsulation;

public class studentEncapsulation {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20) {
            System.out.println("You are older");
        } else {
            this.age = age;

        }
    }
}