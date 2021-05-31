package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5]; // intArray에 크기 5의 배열 정의
		intArray[0] = 3; // 0번째에 3입력
		intArray[1] = 7; // 1번째에 7입력
		intArray[2] = 12; // 2번째에 12입력
		
		int result = 0; // result 값을 0으로 정의
		
		/*오류발생  -->  6번째 배열이 없기 때문
		for(int i=0; i<=intArray.length; i++) { // i를 0~intArray.length 값을 포함해서 까지 값을 1씩 늘려가면서 for문 실행
			result = result + intArray[i];
		}
		
		1) 0 = 0 + 3
		2) 3 = 3 + 7
		3) 10 = 10 + 12
		4) 22 = 22 + 0
		5) 22 = 22 + 0
		6) 22 = 22 + 0
		 */
		
		// 오류 수정
		for(int i=0; i<intArray.length; i++) { // i를 0~intArray.length 값까지 값을 1씩 늘려가면서 for문 실행
			result = result + intArray[i];
		}
		
		/*
		1) 0 = 0 + 3
		2) 3 = 3 + 7
		3) 10 = 10 + 12
		4) 22 = 22 + 0
		5) 22 = 22 + 0
		*/
		
		
		System.out.println(result); // result값 출력 --> 22

	}

}
