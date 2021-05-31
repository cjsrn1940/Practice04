package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[5];
		int sum = 0;
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum = sum + intArray[i];
		}
		
		double average = (double)(sum/intArray.length);
		System.out.println("평균은 " + average);
		
		sc.close();
		
		

	}

}
