package ch02_operator.exam;
import java.util.Scanner;
public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 아래와 같이 출력하는 프로그램을 작성하시오.
		 * 출력형식
		 * 
		 * 수를 입력하시오 : 10
		 * 수를 입력하시오 : 7
		 * 몫 :1
		 * 나머지 : 3
		 * 
		 * 수를입력하시오 : 20
		 * 수를 입력하시오 : 3
		 * 몫 : 6
		 * 나머지 : 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("수를 입력하시오: ");
		int b = sc.nextInt();
		
		System.out.println("몫: " + a / b);
		System.out.println("나머지: " + a % b);
			
		
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하시오 : ");
		int a = scan.nextInt();
		System.out.print("수를 입력하시오 : ");
		int b = scan.nextInt();
		System.out.printf("몫 : %d%n", a/b);
		System.out.printf("나머지 : %d%n", a%b);
	*/
		}

}
