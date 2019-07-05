/**
 * 목표
 * 
 * 자바프로그램 구성요소 이해하기
 * 클래스, 메소드, 멤버변수
 * 
 * 자바프로그램은 클래스로 시작한다. 클래스 밖에 메서드나 변수에 대한 선언은 불가능.
 *
 *메서드x
 *변수x
 * class 이름 {
 *    메서드(){}
 *    변수 : 값이 변경될수 있다.
 *    상수 : 값이 항상 고정되어 있다. 변경될 수 없다.(final)
 * }
 * 
 * 캐멀 표기범(Camel Case)
 * 클래스 : 첫글자를 대문자로, 단어가 여러개가 나오면 각 단어의 첫글자를 대문자로
 *     ex:HelloWorld
 * 메소드 : 클래스와 룰 동일, 단 이름의 첫글자를 소문자로 시작.
 *     ex:speedUp()
 * 변수 :메서드와 네이밍룰 동일
 *     ex:evalScore 
 * 상수 : 모두 대문자로 작성, 단어와 단어사이에 언더바를 준다,(가독성 좋게하려고)
 *     ex: MAX_VALUE 
 */
package ch01_basic;

public class Test11 {
	public static void main(String[] args) {
		int i = 100;
		final double PI = 3.14;//상수
		
		
	}

}
