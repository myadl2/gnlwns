/**
 * 목표
 * 
 * 배정 연산자(+-,-=, ...)의 이해
 */
		
package ch02_operator;

public class Test13 {
	public static void main(String[] args) {
		int a = 5;
		//a = a * 3; 자기자신의 값을 꺼내 연산 후 그 값을 다시 자기 자신에게 돌아오게 할때
		a *= 3;//위는 두줄로 표현 이건 한줄로 가능
		
		a = a + 1;
		a += 1;
		a++; 
		
		int b = 5;
		b *= 2 + 3; // b = b * (2 + 3); 배정 연산자는 우선순위가 가장 낮다.
		System.out.println(b); //25
	}

}
