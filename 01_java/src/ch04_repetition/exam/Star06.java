package ch04_repetition.exam;

public class Star06 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) 
			for (int j = 5; j > 0; j--){                          
			 if(j > i){System.out.print(" ");}
			 else if(j == i){ for (int star = 1 ; star <= 2 * i - 1; star++)
              {System.out.print("*");}
			 System.out.println();
			}
		
	}		
		}

}
