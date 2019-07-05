/**
 * 목표
 * 
 * switch 문을 이해한다.
 * 
 * 형식
 * 
 * 수식 자리에 올 수 있는 것들
 * 1.4버전까지.
 * - byte, short, char, int, long(X) 
 *  byte b = 100;
 *  short s = 100;
 *  int i = 100;
 *  long l = 100;
 *  위는 숫자 담을 수 있는 타입들. 
 *  char c = 'a';
 * 
 * 1.5버전부터 추가 : enum,
 * 1.7버전부터 추가 : String - 수식자리에 문자열이 올 수 있게 됨.
 * switch(수식) {
 * switch(1.1) { (X)
 * switch('a') { (o)
 * switch("abc") { (o)
 * 
 * -switch 문은 '같다' 비교만 가능함.
 * int a = 2;
 * if (a == 1) {}
 * else if (a == 2){}
 * else{}
 * 
 * 
 * switch (a){
 * case 1:
 * 
 * case 2:
 * 
 * }
 * 
 * 해당하는 case문을 찾은 다음switch 블럭을 빠져나오게 하려면?
 * break; 사용한다.
 * 
 * switch(수식) {
 * case 값1: // 수식 == 값1이 동일하다.
 *     수식이 값1과 동일할 때 수행할 문장들.
 * case 값2: // 수식 == 값2이 동일하다.
 *     수식이 값2과 동일할 때 수행할 문장들.
 * default:  - else같은 역할(생략 가능)
 * 위의 case에 일치하는 것이 없을 때 수행할 문장들 
 * }
 */
package ch03_condition;

public class Test04 {
	public static void main(String[] args) {
		int a = 3;
		switch (a) {
		case 1 :
			System.out.println("a는 1입니다.");
			break;
		case 2 :
			System.out.println("a는 2입니다.");
			break;
		default:
			System.out.println("위에 해당하는 경우 없음.");
			
		}
		
		String food = "짜장면";
		switch (food) {
		case "짜장면" :
			System.out.println("중국식당 메뉴임");
			break;
		default :
			System.out.println("중식 아님.");
		}
		
		if (food == "짜장면") {
			System.out.println("if 중식");
		}
		
		String food2 = new String("짜장면");
		if (food2 == "짜장면") {
			System.out.println("if2 중식");
		}
		if (food2.equals ("짜장면")) {
			System.out.println("if2 중식");
		}
		
	}

}
