/**
 * 목표
 * 
 * 자바에서 제공되는 클래스(API)중에서 Random 클래스를 활용하자.
 */
package ch02_operator;

import java.util.Random;
import ch01_basic.exam.Quiz01;

public class Test01 {
	public static void main(String[] args) {
		//나와 다른 위치(패키지)의 클래스를 사용하기 위해서는 import를 해야 한다.
		//클래스 타입의 값을 만드는 규칙
		//1. = 다음에 new를 쓴다.
		//2. new다음에 클래스 이름을 적는다.
		//3. 클래스 이름 다음에()를 붙인다.
		Random r = new Random();
		
		//선언된 클래수 변수인 r을 통해서 Random클래스 안에 있는 변수 또는 메서드에 접근한다.
	    //선언된 메소드중에서 nextInt(num) 메소드 사용 - Random클래스 안에 존재.num은 범위
		//Random 클래스에 있는 nextInt메서드를 호출한다.
		int num = r.nextInt(3); //0~2(3에서 1을 뺀 범위) r이라는 변수 안의 넥스트 인트라는 메소드를 쓴다는 뜻.
		          //넥스트인트 앞에 r의 메소드를 쓰기 위해 꼭 r을 붙인다. 메소드가 어디에 있는지 알려줌.
		System.out.println("num : " + num);
		
		//Random 클래스의 nextInt 사용한다.
		num = r.nextInt(10); //0~9
		System.out.println("num: " + num );
		
		num = r.nextInt(10) + 1; //0~9가 1~10으로 코드변경
		System.out.println("num: " + num );//1~10 
		
		//Quiz01 q = new Quiz01();
		
		
	}

}
