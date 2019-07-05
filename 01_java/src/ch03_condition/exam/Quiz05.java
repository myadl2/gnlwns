/**
 * 
 * 랜덤한 숫자를 하나 생성(1~12)
 * 
 * 생성된 숫자가
 * 12,1,2일 경우 화면에 "겨울입니다." 를 출력
 * 3,4,5,일 경우 화면에 "봄입니다." 를 출력
 * 6,7,8,일 경우 화면에 "여름입니다." 를 출력
 * 9,10,11일 경우 화면에 "가을입니다." 를 출력
 *  
 */
package ch03_condition.exam;
import java.util.Random;
public class Quiz05 {
	public static void main(String[] args) {
		Random r = new Random();
		int month = r.nextInt(12)+1;
		
		
		String season = "";//변수는 블록 (중괄호 안에서만  실행되기떄문에 스위치 밖에서 변서선언되야함
		switch( month ) {//출력 println은 조건에 상관없이 모두 실행 하는 조건이기에 스위치문 밖으로
		case 12 : 
		case 1 :
		case 2: 
			season = "겨울";
		    break;
		case 3 : 
		case 4 : 
		case 5 : 
			season = "봄";
			break;
		case 6 : 
		case 7 : 
		case 8 : 
		    season = "여름";
		    break;
		default: 
		    season = "가을";
		    break;
		}
		System.out.printf("%d월은 %s입니다.", month, season); //이렇게 하면 나중에 수정이 쉬워진다. 스위치 문안에 프린트엘엔을 넣으면 일일히 바꿔줘야 해서 좋지 않음.
		
		/*switch( num ) {//출력 println은 조건에 상관없이 모두 실행 하는 조건이기에 스위치문 밖으로
		case 12 :
		case 1 :
		case 2: System.out.println("겨울입니다.");
		break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println("봄입니다.");
		break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println("여름입니다.");
		break;
		default: System.out.println("가을입니다.");
		}*/
		
		/*switch( num ) {
		case 12 : System.out.println("겨울입니다.");
		break;
		case 1 : System.out.println("겨울입니다.");
		break;
		case 2: System.out.println("겨울입니다.");
		break;
		case 3 : System.out.println("봄입니다.");
		break;
		case 4 : System.out.println("봄입니다.");
		break;
		case 5 : System.out.println("봄입니다.");
		break;
		case 6 : System.out.println("여름입니다.");
		break;
		case 7 : System.out.println("여름입니다.");
		break;
		case 8 : System.out.println("여름입니다.");
		break;
		default: System.out.println("가을입니다.");
		*/
	}

}
