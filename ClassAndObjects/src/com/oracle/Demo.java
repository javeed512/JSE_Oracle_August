package com.oracle;

import java.lang.*;
import java.lang.Object;
import java.lang.String;

import static  java.lang.System.out;

public class Demo extends Object {// inheritance or IS-A Relationship

	private int id;
	private String name;

	public Demo() {

		super(); // immediate parent class , here Object();
		// super --> it refers to immediate parent class object
		System.out.println("Demo() is called..");

	}

	public Demo(int id, String name) {
		// super(); // Object();
		// parameter constructor is used to initialize instance variable values
		this(); // this() refers to current class default constructor
		this.id = id;
		this.name = name; // this current class object
		System.out.println("Demo() parameter constructor is called.");

	}

	public static void main(String[] args) {

		// Demo d = new Demo();

		// System.out.println(d.toString()); // @1243abe

		// Object o = new Demo();

		// System.out.println(o);

		Demo d1 = new Demo(101, "Rohit");

		System.out.println(d1);

		// Demo.sayHello(); // static method call

		Object o = new Demo();

		// Demo.sayHello(new String("javeed"));

		Demo.sayHello(d1);

	}

	public static  void  sayHello(Object obj) {  // concrete method
		
			Demo  d1 = (Demo) obj; // unboxing or explicit type casting
			
			
			
			//String s2 = (String)  obj;
		
		System.out.println("Hello Friends");
		out.println(d1.id +" "+d1.name);
		
	}

}
