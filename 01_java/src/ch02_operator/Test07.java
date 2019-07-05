/**
 * 목표
 * 
 * 조건 연산자(삼항 연산자)에 대해서 이해하자
 * 필수 필요 - 조건 값1 값2 그래서 삼항
 * ?과 : 이 연산자
 * 형태
 *  (조건) ? 값1 : 값2;
 *  
 *  (조건)참이나 거짓을 판단할 수 있는 식이 와야 한다.
 *  (조건) ? 값1 : 값2;
 *  ("hello") ? 값1 : 값2; - 불가
 *  (4 > 5) ? 값1 : 값2; -가능 
 *     
 *   값1 : 조건이 참일경우
 *   값2 : 조건이 거짓일경우
 *   
 *   증감 연산자를 제외한 연산자를 사용할 때는 반드시 연산의 결과를 사용해야 한다.
 */

package ch02_operator;
public class Test07 {
	public static void main(String[] args) {
		int num = 5 + 5;
		System.out.println(5+5);
		
		int a = 5;
		int b = 10;
		
		//int max = (a > b) ? a : b;
		//System.out.println("max : " + max);
		
		System.out.println("max : " + ((a > b) ? a : b));
		//변수를 한 번 밖에 쓰지 않으면 굳이 변수 쓰지 않고 직접 하는 게 좋다.
		
		//(a > b) ? "a가 크다" : "b가 크다";
		
		String result = (a > b) ? "a가 크다" : "b가 크다";
		System.out.println("result : " + result);
		
				
	}

}
