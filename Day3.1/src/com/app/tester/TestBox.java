package com.app.tester;
import java.util.Scanner;
import com.app.core.Box; // The type com.app.core.Box is not visible 
// Box class has default access specifier which has package level visibility, within the same package
// there are only to access specifier for class either default or public
// thus, make class Box public 


class TestBox {
    @SuppressWarnings("null")
	public static void main(String[] args) {
        
    	@SuppressWarnings("unused")
    	int data = 100;// data : prim type , holds value, method local var : stack
        // sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Box dims : w h d");
        
        Box b1;// b1 : ref type var (holds address) : class type of ref , method local var
        // var : allocated memory on stack : bytes will be allocated as per the JVM specification
        // System.out.println(b1);//javac err :
        // object are not created but memory is allocated to store ref type of variable
        // compiler does not allow uninitialized variable
        
        b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        // In java making class public is not sufficient 
        // Each data member & member function has separate access specifier
        // there is javac error while calling constr because, constr has default access specifier
        // thus make the constr public to access it outside the package
        
        //b1++;	//javac error //Type mismatch: cannot convert from Box to int
        
        // display box dims
        System.out.println(b1.getBoxDims());	
        // display box volume
        System.out.println("Box volume " + b1.computeVolume());
        
        Box b2 = b1;// copy of refs //thus address gets copied into b2 //b2 starts pointing to same object on heap
        System.out.println("Box volume " + b2.computeVolume());
        b1 = b2 = null;// 1 object is marked for GC
        System.out.println("Box volume " + b1.computeVolume()); //NullPointerException //runtime error
        	
        System.out.println("Enter side of a cube");
        Box cube = new Box(sc.nextDouble());
        System.out.println(cube.getBoxDims());
        System.out.println("Cube volume " + cube.computeVolume());
        System.out.println("cntd....");
        sc.close();
    }

}
