package com.javaintro;

public class TestDemo3 {

   static {
	hello();   
	Demo();
	
   }

	static void hello() {
		System.out.println("static Method 1 ");

	}

	static void Demo() {
		System.out.println("static Method 2 ");
		TestDemo3 t =new TestDemo3();
		t.welcome1();
//		t.welcome2();
	}

	void welcome1() {
		System.out.println("Instance Method 1 ");
	 welcome2();

	}

	void welcome2() {
		System.out.println("Instance Method 2");
	}

	public static void main(String[] args) {
//		hello();
//		Demo();
//		TestDemo3 t =new TestDemo3();
//		t.welcome1();
//		t.welcome2();

	}

}
