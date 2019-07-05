/**
 * 목표
 * 
 * printf를 이해.
 * 출력시 문자열과 변수의 결합이 복잡한 경우 사용.
 */
package ch01_basic;

public class Test08 {
	public static void main(String[] args) {
	//c언어에서 사용하던것을 자바에서 1.5버전에 구현..	
	//형식
    //printf("포맷",arguments...)
	//포맷의형태
	//%[argument_index$][flags][width]conversion
	/*  index=위치 ex) 1$     숫자,쉼표                    f,d,s..
	 *  
	 * %d(conversion) : 정수(int), 1,2,100,...
	 * %s : 문자열(String), "hello", "hi"....
	 * %f : 실수(double,float), 1.1, 3.14.....	
	 */
		String weatherCondition = "화창하다.";
		System.out.println("오늘 날씨가 " + weatherCondition);
		//System.out.printf("오늘 날씨가" + weatherCondition + "\n");
		System.out.printf("오늘날씨가 %s\n",weatherCondition);
				
		// 당신의 시력은 1.2입니다.
		double sight = 1.2;
		System.out.println("당신의 시력은"+ sight + "입니다.");
		System.out.printf("당신의 시력은 %.1f입니다.%n", sight);
		
		/*
		 * 변수 선언 
		 * place : 스타벅스
		 * price : 4100
		 * evalScore : 4.8
		 * println, printf
		 * 
		 * 출력결과>
		 * 당신이 먹고 있는 커피는 스타벅스에서 4100원에 팔고 있고 평점은  4.800000입니다.
		 */
		String place = "스타벅스";
		int price = 4100;
		double evalScore = 4.8;
		
		System.out.println("당신이 먹고 있는 커피는 "+ place + "에서 " + price + "원에 팔고 있고 평점은 " + evalScore+"입니다.");
		System.out.printf("당신이 먹고 있는 커피는 %s에서 %d원에 팔고 있고 평점은 %f입니다.%n", place, price, evalScore);
		
	}
	

}
