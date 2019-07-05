package ch02_operator;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
						       
        System.out.print("나이: ");
        //문자열을 정수(int)로 변환.
        //API클래스의 Integer - 기능메소드 중 문자열을 숫자로 바꾸는 기능있음
        //int Integer.parseInt(String)
        int val = Integer.parseInt("100");
        //문자열 100이 정수 100으로 변환 val 은  100이 됨.
        
        //int val2 = Integer.parseInt("hello");
        //hello는 숫자형태가 아니기때문에 에러가 남.
        
        //int age = keyboard.nextLine(); 넥스트라인은 문자열을 받기 때문에 안됨. 
        //System.out.println("입력된 나이 : " + age);
        
        int age = Integer.parseInt(keyboard.nextLine()); 
        System.out.println("입력된 나이 : " + age);
        
        System.out.print("주소: ");
        String addr = keyboard.nextLine();
        System.out.println("입력된 주소 : " + addr);
	}
}
