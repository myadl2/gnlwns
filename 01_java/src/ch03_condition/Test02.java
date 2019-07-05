/**
 * 목표
 * 
 * if의 확장
 */
package ch03_condition;

public class Test02 {
	public static void main(String[] args) {
		//삼항연산자(조건연산자)
		int a = 10;
		int b = 5;
		//int max = (a > b) ? a : b;
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		if (a > b) max = a;
		else       max = b;
		
		max = b;
		if (a > b) max = a;
		//두가지 상황이라면 한가지 상황을 아예 정해주고 나머지 상황을 이프로 넣으면 더 간단해짐.
	}

}
