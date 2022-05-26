package com.corejava.assignment2;

public class Cube extends Shapes {
    int a;
    Cube(int a){
    	this.a =a;
   }
    public void draw() {
    	int area=6*(a*a);
    	System.out.println("Area of Cube : "+area);
    }
}
