/*
 * 숫자를 입력하세요 : -7
 * -7의 절대값 : 7
 *
 * 
 */

package ch03_condition.exam;
import java.util.Scanner;
public class Quiz01 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요 : ");
	int num = sc.nextInt();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	
	if (num >= 0) System.out.printf("%d의 절대값 : %d" , num, num);
	else System.out.printf("%d의 절대값 : %d" , num, -num);		
		
		
		
		
		
		
		
		
		/*	Scanner sc = new Scanner(System.in);
		
	System.out.print("숫자를 입력하세요 : ");
	int a = sc.nextInt();
	
	if (a >= 0) {
		System.out.printf("%d의 절대값 :" + a , a);
	}else {
		System.out.printf("%d의 절대값 :" + -1*a , a);
	}
	*/}

}
