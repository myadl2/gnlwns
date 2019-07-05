/**
	반복해서 처리하도록 Quiz06번의 프로그램을 이용하여 작성합니다.
	
	>> 출력형식
	수를 입력 : 2
	수를 입력 : 4
	2부터 4까지의 합은 9입니다.
	더 할까요?(1-계속  2-끝내기) : 1
	수를 입력 : 3
	수를 입력 : 2
	2부터 3까지의 합은 5입니다.
	더 할까요?(1-계속  2-끝내기) : 2
	프로그램이 종료됩니다.
 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
		System.out.print("수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("수를 입력 : ");
		int num2 = sc.nextInt();
		int hiNum; int loNum;
		if(num1 > num2) {hiNum = num1; loNum = num2;}
		else {hiNum = num2; loNum =num1;}
		int sumNum = 0;
		for (int i = loNum; i <= hiNum; i++) {
			sumNum += i;
		}
		System.out.printf("%d부터 %d까지의 합은 %d입니다.%n", loNum, hiNum, sumNum);
		
		  System.out.print("더 할까요?(1-계속  2-끝내기) : ");
		  int exit = sc.nextInt();
		  if(exit == 2) break;
		}
		

	}
}





