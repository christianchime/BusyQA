package com.learning.basicofJava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 11;
//		int b = 5;
//		int c = a-b;
//		int d = a*b;
//		int e = a/b;
//		int f = a%b;
//		System.out.println("a:"+a+ " and b:"+b);
//		System.out.println("a-b:"+ c);
//		System.out.println("a*b:"+ d);
//		System.out.println("a/b:"+ e);
//		System.out.println("a%b:"+ f);
//		for (int i; a <= 20; a++) {
//			System.out.println(a++);
//		}

		int a = 5;
		int b = 6;
		int c = 5;
		boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);
        
        System.out.println("condition value equals check: isEqual :" + isEqual);
        System.out.println("condition value equals check: isNotEqual :" + isNotEqual);
        System.out.println("condition value equals check: isGreaterThan :" + isGreaterThan);
        System.out.println("condition value equals check: isLessThan :" + isLessThan);
        System.out.println("condition value equals check: isGreaterOrEqual :" + isGreaterOrEqual);
        System.out.println("condition value equals check: isLessOrEqual :" + isLessOrEqual);
        
        boolean logAnd = ((a==c) && (a<b));
		boolean logAndfalse = ((a!=c) && (a<b));
		boolean logicalOr = ((a==c) || (a<b));
		boolean logicalOrfasle = ((a!=c) || (a>b));
		boolean logicalnot = (!(a==c));
		
		System.out.println("condition value equals check: logAnd :" + logAnd);
		System.out.println("condition value equals check: logAndfalse :" + logAndfalse);
		System.out.println("condition value equals check: logicalOr :" + logicalOr);
		System.out.println("condition value equals check: logicalOrfasle :" + logicalOrfasle);
		System.out.println("condition value equals check: logicalnot :" + logicalnot);
        
        for (int i = a; i <= 20; i++) {
			System.out.println(--a);
		}

	}

}
