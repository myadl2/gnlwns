/**
 * 목표
 * 
 * while문을 이용한 반복
 * 
 * 형식>
 * while(조건식) {
 *  참일 경우 실행할 문장들 
 *}
 */
package ch04_repetition;

public class Test05 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		int i = 1;
		while(i < 11) {
			System.out.println(i);	
			i++; //for문과 while문의 변환 for문은 그 안에서만 변수 사용, 와일은 전체에서 사용가능.
		}
		i = 1; //위에서 변수를 선언했는데 위 와일문에서 i값이 10이 되서 나오기 떄문에 같은 내용을 또 찍어내기 위해서는 i를 1로 다시 초기화 해줘야 가능하다.
		while(i < 11) {
			System.out.println(i);	
			i++; //for문과 while문의 변환 for문은 그 안에서만 변수 사용, 와일은 전체에서 사용가능.
		}
	}

}
