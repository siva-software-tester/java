package com.test;

public class Test {
	protected void studName(String name) {
		System.out.println(name);
	}

	protected void studName() {

		System.out.println("12345");
	}

	public static void main(String[] args) {
		Test g= new Test();
			g.studName("siva");
			g.studName();

	}

}
