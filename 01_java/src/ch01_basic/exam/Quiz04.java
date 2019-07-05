/**
 * 네이밍 룰을 기준으로 각 요소를 찾아주세요.
 * 
 * 클래스: 5
 * 메서드: 5
 * 변수 : 6
 * 상수 : 1
 * 
 * 같은 이름(중복)은 하나로 센다. 
 */
package ch01_basic.exam;

import java.util.Random;
  //같은것은 한 번으로 센다. 
public class Quiz04 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		int j = Integer.parseInt("200");
		System.out.println(i+j);
		
		System.out.println(Integer.MAX_VALUE);
		Random r = new Random();
		int num = r.nextInt();
		System.out.println("num =" + num);
		
	}

}
