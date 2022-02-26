package com.company;

class MyEmployee{
    private int id;
    private String name;

//        Set
    public String getName(){
        return name;
    }
//            Get
    public void setName(String n){
        name = n;
    }

//            Set
    public void setId(int i){
        id = i;
    }
//            Get
    public int getId(){
        return id;
    }


    }

public class ch_9_Access_modifiers {
    public static void main(String[] args){
       MyEmployee coder = new MyEmployee();

//       coder.id = 45;
//       coder.name = "cod";

            coder.setName("cod");
            System.out.println(coder.getName());
            coder.setId(500);
            System.out.println(coder.getId());


    }
}
