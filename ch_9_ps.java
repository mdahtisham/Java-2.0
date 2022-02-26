package com.company;

class cylinder {

    private int height;
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }


}

public class ch_9_ps {
    public static void main(String[] args){


        cylinder cy = new cylinder();

        cy.setHeight(10);
        int h = cy.getHeight();
        System.out.println(h);

        cy.setRadius(15);
        int r = cy.getRadius();
        System.out.println(r);

    }
}
