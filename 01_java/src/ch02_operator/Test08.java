/**
 * 목표
 * 
 * 비교연산자( >, <, >=, <=, ==, !=)
 * 결과는 참 또는 거짓이 된다.
 * 
 * 주의
 * > = 처럼 중간에 공백이 들어가면 안된다.
 * =< 처럼 순서가 바뀌어도 안됨.
 * 같다 비교는 "="이 아니다. 
 * 
 */
package ch02_operator;

public class Test08 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10; 
		
		System.out.println(num1 > num2);// false
		
		//boolean : 참(true)과 거짓(false)의 값을 담기 위한 데이터 타입.
		boolean bool = num1 < num2;
		System.out.println(bool); //true
		
		/*bool = false; // 직접값을 주는것도 가능
		bool = true; // 
		*/
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2); //false
		System.out.println(num1 != num2); //true
	}

}
