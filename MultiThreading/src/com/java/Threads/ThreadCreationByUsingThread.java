package com.java.Threads;

class A extends Thread{
	void m1() {
		System.out.println("task of first thread");
	}
}

class B extends Thread{
	void m1() {
		System.out.println("task of second thread");
	}
}


public class ThreadCreationByUsingThread {

	public static void main(String[] args) {
		
		A a= new A();
		a.start();
		System.out.println("first thread name is: " +a.currentThread().getName());
		System.out.println("first thread prority is : " +a.currentThread().getPriority());
		B b= new B();
		b.start();
		System.out.println("second thread name is: " +b.currentThread().getName());
		System.out.println("second thread prority is : " +b.currentThread().getPriority());
		
		

	}

}
