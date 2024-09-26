package com.java.Threads;

public class Company {
	int n;
	
	boolean f=false;
	//f:false:chance:producer
	
	
	synchronized public void  produceItem(int n) throws Exception {
		
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("produced item : " +this.n);
		f= true;
		notify();
	}
	
   synchronized public int  consumeItem() throws Exception {
	System.out.println("consumed item : " +this.n);
	
	if(!f) {
		wait();
	}
	
	f=false;
	notify();
	return this.n;
	}

}
