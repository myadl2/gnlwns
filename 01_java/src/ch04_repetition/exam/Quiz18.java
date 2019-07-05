/*
1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)
1회. 숫자를 입력하세요(1 - 1000) : 3
3보다 큰 값 입니다.
2회. 숫자를 입력하세요(1 - 1000) : 500
500보다 작은 값 입니다.
3회. 숫자를 입력하세요(1 - 1000) : 250
정답입니다.

1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)
1회. 숫자를 입력하세요(1 - 1000) : 3
3보다 큰 값 입니다.
생략......
10회. 숫자를 입력하세요(1 - 1000) : 3
3보다 큰 값 입니다.
10회안에 맞추기 게임에 실패하였습니다.
정답은 85입니다.
 */
package ch04_repetition.exam;

import java.util.Random;
import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int ans = r.nextInt(1000)+1;
		System.out.println("1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)");
		int num = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d회. 숫자를 입력하세요(1 - 1000) : ", i);
			num = sc.nextInt();
			if(num == ans) {System.out.println("정답입니다."); break;}
			else if (num < ans) System.out.printf("%d보다 큰 값입니다.%n", num);
			else  System.out.printf("%d보다 작은 값입니다.%n", num);
		}if(num != ans)
	    {System.out.println("10회안에 맞추기 게임에 실패하였습니다.");		
		System.out.printf("정답은 %d입니다.", ans);}
		
}
}




