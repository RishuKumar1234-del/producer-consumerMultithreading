package com.java.Threads.producerconsumer;

public class Company{
	
	int n;
	boolean f=false;
	//f=false: chance: producer
	//f=true: chance: consumer
	
 
	
	//to avoid interference we make this method as a synchronized
	public synchronized void produce_item(int n) {
		
		if(f) {
			try {
				wait();
			} catch (InterruptedException  ie) {
				// TODO: handle exception
			}
		}
		
		this.n=n;
		System.out.println("item is produced: " +this.n);
		
		f=true;
		notify();
		
	}
	
	//to avoid interference we make this method as a synchronized
	
	
	public synchronized int consume_item() {
		
		if(!f) {
			
		try {	wait();} catch(InterruptedException ie) {}
		}
		
		System.out.println("item is consumed: " +this.n);
		
		f=false;
		notify();
		
		return this.n;
	}
	
	

}
