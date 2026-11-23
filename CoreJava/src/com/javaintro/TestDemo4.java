package com.javaintro;

public class TestDemo4 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method is called");

	}
	
	// 3) out of scope or stack scoped objects
	void hello() {          
		System.out.println("Hello Method is started");
		TestDemo4 t4 = new TestDemo4();
		System.out.println("Hello Method is ended");

	}

	public static void main(String[] args) {

		System.out.println("main method started");
		
		TestDemo4 t1 = new TestDemo4();  //2b2fa4f7
		TestDemo4 t2 = new TestDemo4();  //1dbd16a6
		TestDemo4 t3 = new TestDemo4();  //7ad041f3
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

		


	//   1) Nulliyfing the reference variable
		t1 = null;  

    // 2) Re-assigning a reference variable
		t3 = t2; 
		System.out.println(t2);
		System.out.println(t3);
		
		
//		t3.hello();
		
	 // 4) Anonymous Objects
		new TestDemo4().hello();  
		System.gc();
		System.out.println("Main Method ended");

	}

}
