package com.simpleMathOps;

public class Operation {
	public  String identify() {
    	System.out.println("Identifying Owner...\n This is created by Om Rawal");
    	return "This is created by Om Rawal";
    }
    
    public int add(int x,int y) {
    	return x+y;
    }
    
    public int subtract(int x,int y) {
    	return x-y;
    }
    
    public  int getDivision(int x,int y) {
    	return (int)(x/y);
    }
    
    public  int getRemainder(int x,int y) {
    	return x%y;
    }
    
}
