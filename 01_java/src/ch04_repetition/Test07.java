/**
 * 목표
 * 
 * break 이름;
 * 
 */
package ch04_repetition;

public class Test07 {
	public static void main(String[] args) {
		/*for (int i = 1; i < 3; i++) {
			
			for(int k = 1; k < 3; k++) {
				if (k == 2) break; //이 브레이크는 자신을 감싼 포문을 빠져나간다. 값은 1, 1  2,1
				System.out.printf("i = %d, k = %d %n", i ,k);
			}
		}
		결과
		i = 1, k = 1
		i = 1, k = 2
		*/
		
		outer:for (int i = 1; i < 3; i++) {//for문 앞에 이름을 붙여주고 콜론을 붙여준다.
			
			for(int k = 1; k < 3; k++) {
				if (k == 2) break outer; //이 브레이크는 outer 밖으로 나가버림.
				System.out.printf("i = %d, k = %d %n", i ,k);
			}
			// 결과  i = 1, k = 1
		}
	}

}
