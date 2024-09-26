package com.java.Threads;

public class Producer extends Thread {
	 Company c;
	 
	 
	 
	public Producer(Company c) {
		super();
		this.c = c;
	}



	public void run()   {
		
		int i=1;
		while(true) {
			
			try {
				this.c.produceItem(i);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {Thread.sleep(3000);} catch(Exception e){};
			i++;
		}
		
	}

}
