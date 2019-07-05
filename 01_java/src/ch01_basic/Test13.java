/**
 * 목표
 * 
 * 상수의 사용법을 이해하자
 */
package ch01_basic;

public class Test13 {
	public static void main(String[] args) {
		//int hour = 24; 이 상태는 누구든 값을 바꿔버릴 수 있다.
		final int HOUR = 24;
		System.out.println(HOUR / 2);
	 	
		//final 로 고정시킨 값을 변경하려면 에러
		//The final local variable HOUR cannot be assigned. It must be blank and not using a compound assignment
		
		System.out.println(HOUR / 2);
		
		
		
		
		
	}

}
