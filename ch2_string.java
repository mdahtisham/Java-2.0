package com.company;

public class ch2_string {
    public static void main(String[] args) {
        String name = new String ("coder");
        System.out.println(name);
        System.out.println(name.substring(2,5));
        String modifiedName = "coderr";
        System.out.println(modifiedName.indexOf("der"));
        System.out.println(name.toUpperCase());

    }
}
