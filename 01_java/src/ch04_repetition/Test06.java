
package ch04_repetition;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*boolean flag = true;
		while (flag) {
		System.out.print("수를 입력 : ");
		int num = sc.nextInt();
		if ( num == -1 ) {
			//반복문을 벗어나고 싶다.
			flag = false;
		}
		
		System.out.println("입력된 수 : " + num);
		
		
		}*/
	
		while (true) {
			System.out.print("수를 입력 : ");
			int num = sc.nextInt();
			if ( num == -1 ) {
				//반복문을 벗어나고 싶다.
				break; //이프문은 브레이크의 대상이 아니라서 못씀, 하지만 이곳의 브레이크는 와일 문의 브레이크.
				//이 브레이크는 와일을 완전히 벗어나기 때문에 밑의 프린트엘엔이 출력 안됨.
			}
			System.out.println("입력된 수 : " + num);
		}
		
	}

}
