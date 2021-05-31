package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {

		int[] intA = {3,6,9}; // intA 배열에 순서대로 3,6,9 대입
		
		int[] intB; // intB 선언
		intB = intA; // intB에 intA에 있는 주소 값을 대입
		intB[0] = 20; // intB 0번째에 20 대입
		//intB[0] : 3 --> 20
		intB[2] = 10; // intB 2번째에 10 대입
		//intB[2] : 9 --> 10
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}// i가 0부터 intA.length, 즉 3까지 for문 실행
		
	}

}
