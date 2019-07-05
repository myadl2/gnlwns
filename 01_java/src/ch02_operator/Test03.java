/**
 * 목표
 * 
 * Scanner의 사용법을 조금더 자세히 익히자.
 */
package ch02_operator;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("정보를 입력하세요(나이,키,몸무게) : ");
		int age = keyboard.nextInt();
		int height = keyboard.nextInt();
		int weight = keyboard.nextInt();
		//공백을 기준으로 앞에서부터 하나 하나 읽어감.
		//숫자를 두 개만 입력하면 출력이 안됨. 계속해서 3번째 입력을 기다림.
		
		/* 정보를 하나하나 받기.
		 * System.out.print("나이 : ");
		int age = keyboard.nextInt();
		
		System.out.print("키 : ");
		int height = keyboard.nextInt();
		
		System.out.print("몸무게 : ");
		int weight = keyboard.nextInt();
		*/
		
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		
		//한꺼번에 값을 받기, 세개의 값을 값사이에 공백을 이용하여 구분한다.
		
		
	}

}
