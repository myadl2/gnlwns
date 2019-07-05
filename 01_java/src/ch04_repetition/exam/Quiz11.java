/**

하나의 숫자를 입력 받아 완전수인지 판단하는 프로그램을 작성하시오
완전수 판단 : 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수
예를 들어 > 6은 1, 2, 3 이 약수이며, 약수의 합이 6이다. 나눠서 나머지가 0인숫자가 약수
    
출력형식 > 
수를 입력하세요 : 6
6은 완전수 입니다.

 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt(); //6
		int sumMea = 0;
		int mea;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) { mea = i;
			sumMea += mea;
			}				
			}
		if ( sumMea == num ) System.out.printf("%d는 완전수 입니다.", num);
		    else System.out.printf("%d는 완전수가 아닙니다.", num);
	}
}
