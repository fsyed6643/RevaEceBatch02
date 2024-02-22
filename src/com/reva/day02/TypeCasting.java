package com.reva.day02;

public class TypeCasting {

	public static void main(String[] args) {
		
		//implicit type casting // small to big
		float f = 45.8f;//float value
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
		int a = ch;
		System.out.println(a);
		
		//explicit type casting //narrowing largest to small
		double f1 = 10.65d;
		float f2 = (float) f1;//mention in brackets
		System.out.println(f2);
		
		double d2 = 54d ;
		int c = (int)d2;
		System.out.println(d2);
		
		char r ='b';
		byte e = (byte)r;
		System.out.println(e);
	}

}
