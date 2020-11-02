package com.chap1;

//Java program to demonstrate requesting 
//JVM to run Garbage Collector 
public class GarbageCollection 
{ 
	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException 
	{ 
		// Nullifying the reference variable 
		Integer  arr=100;
		System.out.println(arr);
        Runtime.getRuntime().gc(); 
        	} 
	
	@Override
	protected void finalize() throws Throwable 
	{ 
		System.out.println("Garbage collector called"); 
		System.out.println("Object garbage collected : " + this); 
	} 
} 
