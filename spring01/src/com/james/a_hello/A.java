package com.james.a_hello;

class A{
	public static void main(String[] args) {
		Integer i1 = 128;
		Integer i2 = 128;	
		Integer i3 = 129;	
		Integer i4 = 129;	
		System.out.println(i1==i2);	
		System.out.println(i1.equals(i2));	
		System.out.println(i3==i4);	
		System.out.println(i3.equals(i4));	
	}
}