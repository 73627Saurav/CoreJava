package p2;

import p1.A;

class D extends A {
	D() {
		// javac implicitly invokes default super class constr (parameterless) : super();
		System.out.println("D's state " + i + " " + j + " " + k + " " + l);
	}
}

// D is A relationship
// Orange is Fruit
// Since child cannot exist without parent
// In java, whenever we are creating child class object compiler first calls super class constructor
// Since super class constructor is not accessible, we get javac error

// different package sub class
// private - no
// default - no
// protected - yes
// public - yes

// protected members are directly accessible through inheritance