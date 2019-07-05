/**
 * 
 */
package ch04_repetition;

public class Test03 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		int i = 1;
		for (; i < 11; ) {
			System.out.println(i++);
			//초기화, 증감 칸을 비워둬도 문제 없다. 필수 아님. 그래도 쓰는 게 조금 더 좋음.
		}
		//k변수는 자신이 선언된 블럭에서만 사용 가능.
		for ( int k = 1; k < 5; k++) {
			System.out.println(k);
		}
            //System.out.println(k);  k에 접근 불가.
		
		//for(;;) {
		//	System.out.println("무한반복");
		//포문에 아무것도 안주면 무한반복함.
		}
		//System.out.println("끝");//Unreachable code 위의 무한반복에서 빠져나오지 못해서 이렇게 에러. 여기까지 실행이 닿지가 않음.
 }
