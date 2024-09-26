package com.java.Threads;

public class EvenOddPrinterByusingThread implements Runnable {
	Object object;
	
 public EvenOddPrinterByusingThread(Object object) {
	 this.object=object;
 }
	
	
	@Override
	public void run() {
		int count=1;
		
		while(count<=10) {
			
			if(count%2==0 &&Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println("Thread name: " + Thread.currentThread().getName() +"value" +count);
					count++;
				}
				
			 try {	
				 object.wait();
				 } 
			 catch(Exception ex) {
					 ex.printStackTrace();
					 }
			}
			
			
		}
		if(count%2!=0) {
			synchronized (object) {
				System.out.println(count +  "odd" + Thread.currentThread().getName());
			}
			count++;
		 try {	notify();} catch(Exception ex) {ex.printStackTrace();};
		}
		
	}

	public static void main(String[] args) {
		System.out.println("hello");
		Object obj=new Object();
		Runnable r1= new EvenOddPrinterByusingThread(obj);
		Runnable r2= new EvenOddPrinterByusingThread(obj);
		new Thread(r1).start();
		new Thread(r2).start();
		

	}

	

}
