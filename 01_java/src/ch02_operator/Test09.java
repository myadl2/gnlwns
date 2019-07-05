/**
 * 목표
 * 
 * 산술연산자(+, -, *, /, %) 에 대해서 이해하자
 * %는 나머지구하기.
 */
package ch02_operator;

public class Test09 {
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 2;
		System.out.println(num1 + num2);// 8
		System.out.println(num1 - num2);// 4
		System.out.println(num1 * num2);// 12
		System.out.println(num1 / num2);// 3
		System.out.println(num1 % num2);// 0
		
		//짝수, 홀수 구하기
		int num3 = 100;
		//num3 변수의 값을 2로나눈 나머지가 0일경우 짝수 아니면 홀수.
		//String msg = num3, num3 % 2 == 0 ? "짝수" : "홀수"
		System.out.printf("%d는  %s입니다.", num3, num3 % 2 == 0 ? "짝수" : "홀수" );
	}

}
