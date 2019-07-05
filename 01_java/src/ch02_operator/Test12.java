/**
 * 목표
 * 
 * 논리연산자(&&, ||)를 이해하자
 * 조건식 && 조건식 -> 참과 거짓이 반환
 * 조건식 || 조건식 -> 참과 거짓이 반환
 */
package ch02_operator;

public class Test12 {
	public static void main(String[] args) {
		/*
		 True && True -> True
		 True && False -> False
		 False && True -> False
		 False && False -> False

		 True || True -> True
		True || False -> True
		False || True -> True
		False || False -> False
		앞이 트루면 뒤에건 실행하지 않아도 무조건 트루가 나옴.
		 */
		int a = 20;
		int b = 10;
		boolean result = (a > b) && (a % 2 == 0);
		System.out.println(result);
	}

}
