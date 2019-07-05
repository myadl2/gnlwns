package ch04_repetition.exam;

public class Star08 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) 
			for (int j = 5; j > 0; j--){                          
			 if(j > i){System.out.print(" ");}
			 else if(j == i){ for (int star = 1 ; star <= 2 * i - 1; star++)
              {System.out.print("*");}
			 System.out.println();
			}		
	        }for (int i = 4; i > 0; i--) {
		        for (int j = 1; j <= 5 - i; j++){ 
			      System.out.print(" ");				
               }for (int j = 1; j <= 2 * i - 1; j++) {
	               System.out.print("*");
              }System.out.println();
          }		
	}

}
