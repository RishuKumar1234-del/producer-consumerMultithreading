package com.java.Threads.producerconsumer;

public class Producer extends Thread {
	
//	Company c= new Company();
	Company c;
	
	public Producer(Company c) {
		
		this.c=c;
	}
	public void run() {
		
		int x=1;
		while(true) {
			this.c.produce_item(x);
			
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			x++;
		}
		
	}

}
