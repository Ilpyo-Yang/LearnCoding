package Bruthforce;

/*
-- λΈλ?­ 2798
μ²«μ§Έ μ€μ μΉ΄λ? κ°μ N(3 ?€ N ?€ 100)κ³? M(10 ?€ M ?€ 300,000)?΄ μ£Όμ΄μ§λ€. 
?μ§? μ€μ? μΉ΄λ? ?°?¬ ?? ?κ°? μ£Όμ΄μ§?λ©?, ?΄ κ°μ? 100,000? ?μ§? ?? ?? ? ??΄?€.
?©?΄ M? ?μ§? ?? μΉ΄λ 3?₯? μ°Ύμ ? ?? κ²½μ°λ§? ?? ₯?Όλ‘? μ£Όμ΄μ§λ€.

μ²«μ§Έ μ€μ M? ?μ§? ??Όλ©΄μ M? μ΅λ?? κ°?κΉμ΄ μΉ΄λ 3?₯? ?©? μΆλ ₯??€.

??? ?Έκ°?μ§? ?? ?©? ?? ? forλ¬Έμ ? ?κ°μ ? ?κ°νκΈ?!
*/

// 

//

//
 

import java.util.*;

public class bruteforce_2798 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardnum = sc.nextInt();
		int value = sc.nextInt();
		int max = 0, sum = 0;
		int[] intArr = new int[cardnum];
		
		
		for (int i=0; i<intArr.length; i++) {
			intArr[i]=sc.nextInt();
		}
		sc.nextLine();
		
		for (int i=0; i<intArr.length-2; i++) {
			for (int j=i+1; j<intArr.length-1; j++) {
				for (int l=j+1; l<intArr.length; l++) {
					sum = intArr[i]+intArr[j]+intArr[l];
					if (sum<=value) max = Math.max(max,sum);
				}
			}
			
		}
		
		System.out.print(max);
		sc.close();		
	}
	
}