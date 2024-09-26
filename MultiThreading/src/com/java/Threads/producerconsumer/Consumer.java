package com.java.Threads.producerconsumer;

public class Consumer extends Thread {
	
	Company c2;
	
	public Consumer(Company c2) {
		
		this.c2=c2;
	}
	
	public void run() {
		
		while(true) {
			this.c2.consume_item();
			
			try {
				Thread.sleep(2500);
			}
			catch (Exception e) {
				
			}
		}
		
		
		
		
		
	}

}
