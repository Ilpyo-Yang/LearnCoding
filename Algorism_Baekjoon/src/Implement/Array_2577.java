package Implement;

// λ°°μ΄
/*
-- ?«?? κ°μ 2577
μ²«μ§Έ μ€μ A, ?μ§? μ€μ B, ?μ§? μ€μ Cκ°? μ£Όμ΄μ§λ€. 
A, B, C? λͺ¨λ 100λ³΄λ€ κ°κ±°? ?¬κ³?, 1,000λ³΄λ€ ??? ??°??΄?€.
μ²«μ§Έ μ€μ? A Γ B Γ C? κ²°κ³Ό? 0 ?΄ λͺ? λ²? ?°???μ§? μΆλ ₯??€. 
λ§μ°¬κ°?μ§?λ‘? ?μ§? μ€λ??° ?΄ λ²μ§Έ μ€κΉμ§? A Γ B Γ C? κ²°κ³Ό? 1λΆ??° 9κΉμ?? ?«?κ°? κ°κ° λͺ? λ²? ?°???μ§? μ°¨λ?λ‘? ? μ€μ ???© μΆλ ₯??€.
*/
import java.util.*;

public class Array_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();		
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.nextLine();
		
		String result = String.valueOf(a*b*c);
		
		for (int j=0; j<=9; j++) {

			int cnt = 0;
			for (int i=0; i<result.length(); i++) {
				if(j==result.charAt(i)-'0') {
					cnt++;			
				}
			}	
			System.out.println(cnt);
		}
		
		sc.close();
	}

}
