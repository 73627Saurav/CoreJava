package p2;

import p1.A;

class E {
	E() {
		A ref = new A();
		System.out.println("A's state " + ref.i + " " + ref.j + " " + ref.k + " " + ref.l);
	}
}

// different package no sub class
// private - no
// default - no
// protected - no
// public - yes