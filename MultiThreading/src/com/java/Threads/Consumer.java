package com.java.Threads;

public class Consumer extends Thread {
	 Company c;
	 
	 
	 
	



	public Consumer(Company c) {
		super();
		this.c = c;
	}







	public void run()  {
		
		while(true) {
			try {
				this.c.consumeItem();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {Thread.sleep(1000);} catch(Exception e){};
			
		}
		
	}

}
