/**
 *    20을 16진수로 변환하기
 *    
 *    16 | 20
 *       |  1  -  4
 *          0  -  1
 *         
 *         
 *    20을 8진수로 변환하기
 *    
 *    8 | 20
 *      |  2  -  4
 *         0  -  2
 *  
 *  
 *    20을 2진수로 변환하기/
 *    
 *    2 | 20
 *      | 10  -  0 
 *      |  5  -  0 
 *      |  2  -  1 
 *      |  1  -  0 
 *      |  0  -  1 
 *    
	출력형식>
	
	숫자를 입력하세요 : 20
	변환 진법(2, 8, 16) : 2
	20를 2진법으로 변경한 결과 : 10100
	
	
	숫자를 입력하세요 : 20
	변환 진법(2, 8, 16) : 8
	20를 8진법으로 변경한 결과 : 24	
	
	숫자를 입력하세요 : 20
	변환 진법(2, 8, 16) : 16
	20를 16진법으로 변경한 결과 : 14
	
 */
package ch04_repetition.exam;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("변환 진법(2, 8, 16) : ");
		int change = sc.nextInt();
		String finalNam="";
		if (change == 2) {
			System.out.printf("%d를 %d진법으로 변경한 결과 : ", num, change);
			//나머지를 조건에만 넣어 줘야 한다. 아니면 나머지 값이 변해 버리기 때문.
			
			int nam ;
			finalNam="";					
		  for(;;) {
			  nam = num % 2;
		    	finalNam = nam + finalNam;
				if (num / change == 0)break;
				num /= change; 
				}System.out.print(finalNam);
				
			}
		if (change == 8) {
			System.out.printf("%d를 %d진법으로 변경한 결과 : ", num, change);
			int nam ;
			finalNam="";					
		  for(;;) {
			  nam = num % 8;
		    	finalNam = nam + finalNam;
				if (num / change == 0)break;
				num /= change; 
				}System.out.print(finalNam);
				
		
		}
		if (change == 16) {
			System.out.printf("%d를 %d진법으로 변경한 결과 : ", num, change);
			int nam ;
			finalNam="";					
		  for(;;) {
			  nam = num % 16;
			  
			  if (nam <= 10) {
			  String overNam = "nam";
			   switch (nam) {
				case 10 : overNam = "A";
				 break;
				case 11 : overNam = "B";
				break;
				case 12 : overNam = "C";
				break;
				case 13 : overNam = "D";
				break;
				case 14 : overNam = "E";
				break;
				case 15 : overNam = "F";
				break;
				default :}
			   finalNam = overNam + finalNam;
				if (num / change == 0) {break;}
				num /= change;
			   }
			  else {
			  finalNam = nam + finalNam;}
				if (num / change == 0) {break;}
				num /= change;
			}	
		  }  
		 
		  System.out.print(finalNam);
		
								
		}
	}


