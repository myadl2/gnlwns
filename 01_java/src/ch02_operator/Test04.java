package ch02_operator;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
						       
        System.out.print("나이: ");
        int age = keyboard.nextInt();
        keyboard.nextLine(); 
        //위에서 입력된 나이 뒤에 \r\n이 남아있어 밑의 넥스트 라인이 이걸 읽고 내용이 없다고 판단해버림
        //그래서 넥스트라인을 한번 더 써서 줄바꿈문자를 제거해버린다.
        //넥스트라인만으로 쓴다면 이 작업이 필요없다.
        System.out.println("입력된 나이 : " + age);
        
        System.out.print("주소: ");
        String addr = keyboard.nextLine();
        System.out.println("입력된 주소 : " + addr);
	}
}
