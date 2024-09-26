package com.java.Threads;




public class ConsumerProducerProblem {

	public static void main(String[] args) {
		
		Company c= new Company();
		
		Producer p =new Producer(c);
		Consumer cons=new Consumer(c);
		p.start();
		cons.start();
		

	}

}
