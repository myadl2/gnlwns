/**
 *    아래와 같이 동작되는 프로그램을 작성하시오
 *    
 *    설명>
 *    임의의 수(1 ~ 10)를 2개를 입력받는다(사용자 화면에서...)
 *    단, 같은 숫자는 입력하지 않는다.
 *    큰수가 앞에 입력되어도 실행 될 수 있도록 합니다.
 *    
 *    화면출력>
 *    수를 입력 : 3
 *    수를 입력 : 5
 *    
 *    3부터 5까지의 합은 12입니다.
 *    
 *    화면출력>
 *    수를 입력 : 5
 *    수를 입력 : 3
 *    
 *    3부터 5까지의 합은 12입니다.
 */
package ch04_repetition.exam;
import java.util.Scanner;
public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
          System.out.print("수를 입력 : ");
          int num1 = sc.nextInt();
          int num2;         
          for( ; ; ) {
          System.out.print("수를 입력 : ");
          num2 = sc.nextInt();
          if (num1 == num2) {
        	  System.out.println("잘못 입력하셨습니다.");
          }else break;}
          
          int hiNum; int loNum;
          if(num1 > num2) {hiNum = num1; loNum = num2;}
          else {hiNum = num2; loNum = num1;}
          int sumhiNum = 0;
          int sumloNum = 0;
          for (int i = 1; i <= hiNum; i++) {
        	  sumhiNum += i;}
          for (int j = 1; j <= loNum; j++){
        	  sumloNum += j;}
        System.out.printf("%d부터 %d까지의 합은 %d입니다.", loNum, hiNum, sumhiNum - sumloNum + loNum);
	}	
	}
	

