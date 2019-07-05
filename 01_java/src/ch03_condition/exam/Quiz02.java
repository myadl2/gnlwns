/*
 * 마트에서 할인 행사를 진행합니다, 물건값에 따라서 각각의 할인율이 적용
 * 
 * 물건값   10만원 이하  30만원 이하   100만원 이하   100만원 초과
 * 할인율   3%       5%       8%        10%
 * 
 * 화면에서 물건값을 입력 받아 할인된 금액을 계산하여 출력하느 프로그램을 작성하시오
 * 
 * 출력예시>
 * 물건값을 입력하세요(만원) : 10
 * 할인된 금액은 97000 원입니다.
 * 물건값을 입력 하세요(만원) : 20
 * 할인된 금액은 190000원 입니다.
 */
package ch03_condition.exam;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력하세요(만원) : ");
		int price = sc.nextInt();
		double dcrate = 1;		
		if (price <= 10) dcrate -= 0.03;
		else if(price <= 30) dcrate -= 0.05;
		else if(price <= 100) dcrate -= 0.08;
		else if(price > 100) dcrate -= 0.1;
		
		System.out.printf("할인된 금액은 %.0f원 입니다." , 10000*price*dcrate);
		
		
		
				
		/*if (price > 100) {
			System.out.printf("할인된 금액은 %.0f 원입니다." , (price*0.9)*10000);
		} else if (price > 30) {
			System.out.printf("할인된 금액은 %.0f 원입니다." , (price*0.92)*10000);
		} else if (price > 10) {
			System.out.printf("할인된 금액은 %.0f 원입니다." , (price*0.95)*10000);
		} else 
			System.out.printf("할인된 금액은 %.0f 원입니다." , (price*0.97)*10000);
	*/
	}

}
