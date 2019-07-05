/**
 * 목표
 * 
 * 문자열 상수 : 자바실행환경에서 문자열 내에서 사용할 때 고정된(상수)의미로
 * 사용되는 문자열
 * \ 뒤에는 반드시 지정된 문자(이스케이프 문자)중에 하나가 와야한다.
 * \다음에 t,n,r,f,\,'," 
 */
package ch01_basic;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("나의 이름은 \n 홍길동\n 입니다.");
		
		//String path = "c:\test";
		//System.out.println("path : " + path); 이러면 \t가 이스케이프 문자로 인식
		
		String path2 = "c:\\test";
		System.out.println("path : " + path2);
		
		String msg = "\"홍길동\"님에게...";
		System.out.println("msg : " + msg);
		
		//System.out.println("수업 루트 폴더 : c:\java");
		//위는 역슬래시 뒤에 j를 이스케이프 문자처럼 보고 오류가 뜬다.
		//따라서 역슬래시 한 번 더 넣어야 한다.
		//\ 뒤에는 지정되어 있는 문자만 와야 한다.(상수의 개념)
		System.out.println("수업 루트 폴더: c:\\java");
	}
	

}
