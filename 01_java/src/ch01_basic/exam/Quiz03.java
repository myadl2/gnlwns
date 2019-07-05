package ch01_basic.exam;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		 * 정수100과 실수10.13을 담는 변수i,j를 선언한다.
		 * println과printf를 사용하여 아래와 같이 출력되도록 코드를 작성한다.
		 * 
		 * 출력결과>
		 * println이용 : 100 +10.13= 110.13
		 * printf이용 : 100 +10.13 = 110.13
		 */
		
		int i = 100;
	    double j = 10.13;
	    
	    System.out.println(i + " + " + j + " = " + (i+j));
	    System.out.printf("%d + %.2f = %.2f", i, j, i+j);
	    
	}

}
