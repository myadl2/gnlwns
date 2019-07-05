package ch02_operator;
import java.util.Random;
import java.util.Scanner;
public class practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt();
		
		num = r.nextInt(3);
		System.out.println("num : "+ num);
		
		int num1 = r.nextInt(19);
		System.out.println("num1 : " + num1);
				
		System.out.print("이름 , 나이, 직업? ");
		String name = scan.next();
		int age = scan.nextInt();
		String job = scan.next();
		
		System.out.printf("당신의 이름은  %s 입니다.%n" , name);
		System.out.printf("당신의 나이는 %d 입니다.%n" , age);
		System.out.printf("당신의 직업은 %s 입니다.%n", job);
		
		
		
		
	}

}
