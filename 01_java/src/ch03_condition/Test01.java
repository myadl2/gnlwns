/**
 * 목표
 * 
 * 제어문 : 조건(if)
 */
package ch03_condition;

public class Test01 {
	public static void main(String[] args) {
		/*
		 *
		 * if (조건식) ; 
		 *    실행문장;    -이건 조건식 뒤 세미콜론에서 이프문이 종료되어 실행문장이 무조건 실행.
		  
		  if (조건식); {
		      실행문장들..
		  } - 이것도 이프문이 소용없어짐.
		  
		   if (조건식) 실행문장;

		   if (조건식) 
		             실행문장;
		   		   
		 * if (조건식) {
		         참일 경우, 실행할 문장들
		   }
		 */
		int a = 15;
		
		if (a > 10) System.out.println("a는 10보다 큽니다.");
		
		if (a > 10) 
			System.out.println("a는 10보다 큽니다.");
		//아래의 문장은 조건에 무관한 문장이다.
		System.out.println("a = " + a);
		
		
		if (a > 10) { 
			System.out.println("a는 10보다 큽니다.");
			System.out.println("a = " + a);
		}
		
		
	}

}
