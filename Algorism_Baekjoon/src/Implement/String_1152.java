package Implement;

// λ¬Έμ?΄
/*
-- ?¨?΄? κ°μ 1152
??΄ ???λ¬Έμ?? ??΄?°κΈ°λ§?Όλ‘? ?΄λ£¨μ΄μ§? λ¬Έμ?΄?΄ μ£Όμ΄μ§λ€. ?΄ λ¬Έμ?΄?? λͺ? κ°μ ?¨?΄κ°? ??κΉ?? 
?΄λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€. 
?¨, ? ?¨?΄κ°? ?¬?¬ λ²? ?±?₯?λ©? ?±?₯? ??λ§νΌ λͺ¨λ ?Έ?΄?Ό ??€.
*/
import java.util.*;

public class String_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt=0;
		int last = str.length();
		
		if(str.charAt(0)==' ') cnt--;
		if(str.charAt(last-1)==' ') cnt--;
		
		for (int i=0; i<last; i++) {
			if(str.charAt(i)==' ')
				cnt++;				
		}	
		
		System.out.println(cnt+1);
		sc.close();
	}
}
