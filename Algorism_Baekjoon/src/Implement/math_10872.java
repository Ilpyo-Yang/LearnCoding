package Implement;


//?¬κ·?
/*
- ?©? λ¦¬μΌ 10872
0λ³΄λ€ ?¬κ±°λ κ°μ? ? ? N?΄ μ£Όμ΄μ§λ€. ?΄?, N!? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±???€.
*/

import java.util.Scanner;

public class math_10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(fac(a));
		
		sc.close();
	}

	private static int fac(int a) {
		
		if(a<=1) {
			return 1;
		}
		else {
			return a*fac(a-1);

		}
	}
	
}