/**
	랜덤한 숫자를 5개 생성하고 생성된 숫자의 합계와 평균을 구하는 프로그램을 작성하시오
	
	출력형식 > 
	생성된 숫자 : 44 89 74 7 47 
	합계 : 261
	평균 : 52.20
 */
package ch04_repetition.exam;
import java.util.Random;
public class Quiz04 {
	public static void main(String[] args) {
		Random r = new Random();
		int num1 = r.nextInt(101);
		int num2 = r.nextInt(101);
		int num3 = r.nextInt(101);
		int num4 = r.nextInt(101);
		int num5 = r.nextInt(101);
		
		int sum = num1 + num2 + num3 + num4 + num5;
		double avg = (num1 + num2 + num3 + num4 + num5) / 5;
		
		System.out.printf("생성된 숫자 : %d %d %d %d %d%n합계 : %d%n평균 : %.2f",
				num1,num2,num3,num4,num5,sum,avg);
	
		
		
		
		
	}
}
