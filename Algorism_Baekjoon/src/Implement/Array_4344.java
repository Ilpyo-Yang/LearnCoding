package Implement;

// λ°°μ΄
/*
-- ?κ· μ? ?κ² μ? 4344
μ²«μ§Έ μ€μ? ??€?Έ μΌ??΄?€? κ°μ Cκ°? μ£Όμ΄μ§λ€.
?μ§? μ€λ??° κ°? ??€?Έ μΌ??΄?€λ§λ€ ??? ? N(1 ?€ N ?€ 1000, N?? ? ?)?΄ μ²? ?λ‘? μ£Όμ΄μ§?κ³?, 
?΄?΄? Nλͺμ ? ?κ°? μ£Όμ΄μ§λ€. ? ?? 0λ³΄λ€ ?¬κ±°λ κ°κ³ , 100λ³΄λ€ ?κ±°λ κ°μ? ? ??΄?€.
*/
import java.util.*;

public class Array_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		double sum=0;
		int num=0;
		int[] scoreArr = null;
		
		for (int j=0; j<testcase; j++) {
			int student = sc.nextInt();
			
			for (int i=0; i<student; i++) {
				scoreArr = new int[student];
				scoreArr[i]=sc.nextInt();
				sum += scoreArr[i];
			}
				
			for (int i=0; i<student; i++) {
				System.out.println(scoreArr[i]);
				if(scoreArr[i]>sum/student) {
					num++;
				}	
			}
			
			System.out.printf("%.3f",num/student*100);
			System.out.println("%");
		}
		
		
		sc.close();
	}

}
