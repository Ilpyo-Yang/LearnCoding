package Implement;

// λ°°μ΄
/*
-- μ΅λκ°? 2562
μ²«μ§Έ μ€λ??° ?? λ²μ§Έ μ€κΉμ§? ? μ€μ ??? ??°?κ°? μ£Όμ΄μ§λ€. 
μ£Όμ΄μ§?? ??°?? 100 λ³΄λ€ ??€.
μ²«μ§Έ μ€μ μ΅λκ°μ μΆλ ₯?κ³?, ?μ§? μ€μ μ΅λκ°μ΄ λͺ? λ²μ§Έ ??Έμ§?λ₯? μΆλ ₯??€.
*/
import java.util.*;

public class Array_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listArr = new ArrayList<>();
		int no = 0;
		
		for (int i=0; i<9; i++) {
			listArr.add(sc.nextInt());
		}
		
		int max = Collections.max(listArr);
		
		for (int i=0; i<9; i++) {
			if(listArr.get(i)==max) {
				no=i;
				break;
			}
		}
		
		
		System.out.println(max);
		System.out.println(no+1);
		
		sc.close();
	}

}
