package Implement;

// λ°°μ΄
/*
-- ?λ¨Έμ? 3052
μ²«μ§Έ μ€λ??° ?΄λ²μ§Έ μ€? κΉμ? ?«?κ°? ? μ€μ ???© μ£Όμ΄μ§λ€. 
?΄ ?«?? 1,000λ³΄λ€ ?κ±°λ κ°κ³ , ??΄ ?? ? ??΄?€.
μ²«μ§Έ μ€μ, 42λ‘? ???? ?, ?λ‘? ?€λ₯? ?λ¨Έμ?κ°? λͺ? κ°? ??μ§? μΆλ ₯??€.
*/
import java.util.*;

public class Array_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		List<Integer> remainder = new ArrayList<>();
		int cnt = 0;
		
		for (int i=0; i<10; i++) {
			input.add(sc.nextInt());
			remainder.add(input.get(i)%42);
		}
		sc.nextLine();
		
		for (int i=0; i<remainder.size()-1; i++) {
			for (int j=i+1; j<remainder.size(); j++) {
				if(remainder.get(i)==remainder.get(j)) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(10-cnt);
	
		sc.close();
	}
}
