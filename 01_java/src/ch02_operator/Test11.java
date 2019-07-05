/**
 * 증감연산자
 * 1을 증가시키거나 1을 감소시킨다.(++, --)
 * 증감연산자는 혼자 쓸 수 있다.
 */
package ch02_operator;

public class Test11 {
	public static void main(String[] args) {
		int a = 5;
		
		//a = a + 1;
		//b = a;
		//이 두 개의 실행이 겹친다. 순서에 따라 a는 순서에 상관없이 같지만 b는 달라진다.
		//++의 위치에 따라 달라진다. ++이 앞이면 값 증가를 먼저 시킨 후 다른 실행을 시작하고, ++이 뒤면 실행 후 증가시킨다.
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		++a; // a = a + 1F 
	
	 System.out.println(a); //5
		
	}

}
