package p1;

class C {
	C() {
		A ref = new A();
		System.out.println("A's state " + ref.i + " " + ref.j + " " + ref.k + " " + ref.l);
	}
}

// same package no sub class
// private - no
// default - yes
// protected - yes
// public - yes

// protected=default till we are in same package