/**
시간을 아래와 같이 출력하는 프로그램을 작성하시오

출력형식 > 
-------------------
0 시
-------------------
00:00
00:01
00:02
00:03
...
00:59
-------------------
1 시
-------------------
01:00
01:01
...
...
-------------------
11 시
-------------------
11:54
11:55
11:56
11:57
11:58
11:59
 */
package ch04_repetition.exam;

public class Quiz07 {
	public static void main(String[] args) {
		for(int i = 0; i <= 12; i++) {
			System.out.println("-------------------");
			System.out.printf("%d 시%n", i);
			System.out.println("-------------------");
			for (int j = 1; j <= 59; j++) 
				System.out.printf("%02d:%02d%n", i, j);
			
		}

	}  
}  