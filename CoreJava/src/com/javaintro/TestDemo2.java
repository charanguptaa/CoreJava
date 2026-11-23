package com.javaintro;

public class TestDemo2 {
   
	static int x;
   
   {
	x++;   
   }
   
  

	public static void main(String[] args) {
      TestDemo2 a=new TestDemo2();
      System.out.println(a.x);

      TestDemo2 b=new TestDemo2();
      System.out.println(b.x);

      TestDemo2 c=new TestDemo2();
      

      System.out.println("Number of objects : "+x);
	}

}
