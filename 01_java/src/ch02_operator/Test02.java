/**
 * 목표
 * 
 * Scanner 클래스를 이용한 실행창에서 데이터 입력받기
 */
package ch02_operator;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
	   Scanner keyboard = new Scanner(System.in);
	   //표준 입력창으로부터 읽어 들이겠다.
	   //The constructor(생성자) Scanner() is undefined 스캐너 클래스에 이런게 없어, 스캔할 대상이 없다는 것.
	   //System.out 은 출력이니 입력 받기 위해 System.in 이것을 스캔하겠다.
	   //생성자는 특수한 형태, 메소드 이름이 클래스이름과 같다.
	   
	   System.out.print("1 : ");
	   int data1 = keyboard.nextInt();//화면에 입력된 숫자(정수)를 읽겠다.
	   System.out.println("입력된 data1 : " + data1);
	   
	   System.out.print("2 : ");
	   String data2 = keyboard.next();//화면에 입력된 문자열을 읽겠다
	   System.out.println("입력된 data2 : " + data2);
	   
	   System.out.print("3 : ");
	   double data3 = keyboard.nextDouble();//화면에 입력된 실수를 읽겠다
	   System.out.println("입력된 data3 : " + data3);
	   
	   keyboard.close();
	   
	}

}
