package p1;

class B extends A { // B is sub class within the same package
	B() {
		System.out.println("B's state " + i + " " + j + " " + k + " " + l);
		// i has private access
		// cannot access private member outside the class even it is a sub class
	}
}

// same package sub class
// private - no
// default - yes
// protected - yes
// public - yes

// protected=default till we are in same package