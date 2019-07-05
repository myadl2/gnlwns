package ch02_operator.exam;
import java.util.Scanner;
public class Quiz08 {
	public static void main(String[] args) {
		/*
		 * 아래와 같이 출력하는 프로그램을 작성하시오
		 * 
		 * 출력형식>
		 * 
		 * 초를 입력하시오 : 7600
		 * 입력된 7600초는 2시간 06분 40초입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		int sec = sc.nextInt();
		final int HOUR_SEC = 60*60;
		
		System.out.printf("입력된 %d초는 %d시간 %02d분 %02d초입니다.",
				sec, sec / HOUR_SEC, (sec % HOUR_SEC) / 60, (sec % HOUR_SEC) % 60);
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하시오 : ");
		final int HOUR_SEC = 60*60;
		int time = sc.nextInt();
							
		System.out.printf("입력된 %d초는 %d시간 %02d분 %02초입니다.", time, time / 3600,
				 (time /3600) % 60,
				 time-(time/3600)%60);
		
	*/}

}
