/**
 * 목표
 * 
 * printf에 대해서 상세하게 이해
 */
package ch01_basic;

public class Test09 {
	public static void main(String[] args) {
		int val = 22;
		System.out.printf("|%d|%n", val);
		//|   22|
		System.out.printf("|%5d|%n", val);
		//|22   |
		System.out.printf("|%-5d|%n", val);
		//|00022|
		System.out.printf("|%05d|%n", val);
//%와 이스케이프 문자 사이의 숫자는 차지하는 공간의 수, 숫자 앞에 0이 붙을 경우, 빈공간에 0을 채워넣음.		
		double val2 = 22.1;
		//|22.100000|
		System.out.printf("|%f|%n", val2);
		//|22.10|
		System.out.printf("|%.2f|%n", val2);
//%와 문자사이의 .숫자는 나타내고자 하는 소수점 자릿수.		
		//| 22.10|
	    System.out.printf("|%6.2f|%n", val2);
//.숫자 앞에 붙는 숫자는 차지하는 공간의 수. 마침표도 한 공간을 차지!	    
	  //|135456789.24| %6의 6은 최소 자릿수 넘어가면 전부 출력됨.
	    System.out.printf("|%6.2f|%n", 135456789.235);
	  //1$첫번째위치의 argument를 사용하겠다는 뜻.
	    System.out.printf("|%1$10d|%2$10d|%n", 1212, 1324);
	    
	}

}
