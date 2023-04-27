/*
  Create a class to represent 3D Box class Box ---tight encapsulation
  (achieved
  by making all non static data members:instance vars private) state --
  width,height , depth --- double : private paramterized constr --3 arg constr.
 */

package com.app.core;
public class Box { //class level access specifier - default/public/final/abstract
    // state : instance vars
    private double width, height, depth; //instance var level access specifier - public/protected/private/static/final

    // paramterized constr //constr level access specifier - public/protected/private
     public Box(double w, double h, double depth) {	//method local variables
        this.width = w;
        height = h;
        // this : current object reference
        // used to un hide instance var from method local var
        // depth = depth; //0 //method local variable is hiding instance variable
        this.depth = depth;
    }

    // add overloaded paramterized constr to init a cube : no of args will vary
    public Box(double side) {
        // width=depth=height=side;
        this(side, side, side);// constr chaining //calling one constr in another constr
    }

    // Box() {

    // }

    // methods
    // 1. To return Box details in String form (dimensions of Box)
    public String getBoxDims() {
        return "Box dims " + this.width + " " + this.height + " " + depth;
    }

    // To return computed volume of the box.
    public double computeVolume() { //method level access specifier - public/protected/private/static/final/abstract
        return width * depth * height;
    }

    // add a method (API) to check equality of 2 boxes
    boolean isEqual(Box anotherBox)// anotherBox=b2 : copy of refs
    {
        return width == anotherBox.width && this.depth == anotherBox.depth && this.height == anotherBox.height;
    }

    // Box b2=b1.createNewBox(sc.nextDouble(),.....)
    // add a method to return a new box , with dims ofsset from the earlier box
    Box createNewBox(double wOff, double hOff, double dOff) {
        Box newBox = new Box(this.width + wOff, height + hOff, depth + dOff);
        return newBox;
    }

}