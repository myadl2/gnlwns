package ch02_operator.exam;
import java.util.Scanner;
public class Quiz07 {
	public static void main(String[] args) {
		/*
		 * 아래와 같이 출력하는 프로그램을 작성하시오
		 * 
		 * 환율계산 : 1달러당 1088.11원
		 * 출력시 소수점 아래 2자리만 출력
		 * 
		 * 출력형식>
		 * 
		 * 달러를 입력하시오 : 30
		 * 원화 : 32643.30원
		 * 
		 * 달러를 입력하시오 : 100
		 * 원화 : 108811.00원
		 */
		Scanner sc = new Scanner(System.in);
		final double exc = 1088.11;
	
		System.out.print("달러를 입력하시오 : ");
		int dollar = sc.nextInt();
		System.out.printf("원화 : %.2f원%n" , exc*dollar);
			
		
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하시오 : ");
		int dol = sc.nextInt();
		final double change = 1088.11;
		
		System.out.printf("원화 : %.2f%n" , dol*change);
		
		//System.out.printf("원화 : %.2f%n" , sc.nextInt();*change);
		
	*/}

}
