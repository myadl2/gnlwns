/**
 * 목표
 * 
 * 반복문의 연습
 */
package ch04_repetition;

public class Test02 {
	public static void main(String[] args) {
		/*
		//1부터 10까지 출력하는 반복문 작성
				for(int i = 1; i <= 10; i++) 
			System.out.println(i);
		*/
		//10,20,30,40,50을 출력하는 반복문 작성
		//for(int i = 1; i <= 5; i++)
		//	System.out.println(10 * i);
		
		//for(int i = 10; i <= 50; i += 10)
		//System.out.println(i);
		
		int num = 10;
		for(int i = 1; i < 6; i++) {
			System.out.println(num);
			num += 10;
		}
		
		int num2 = 10;
		for (int i = 1; i < 6; i++, num2 += 10) {
			System.out.println(num2);
			//다 같은 코드. 초기화, 증감 한문장만 올 필요 없다.
		}
		
		
	}

}
