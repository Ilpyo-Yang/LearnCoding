package Implement;


//?¬κ·?
/*
- ?Όλ³΄λμΉμ?΄ 10870
?Όλ³΄λμΉ? ?? 0κ³? 1λ‘? ????€. 0λ²μ§Έ ?Όλ³΄λμΉ? ?? 0?΄κ³?, 1λ²μ§Έ ?Όλ³΄λμΉ? ?? 1?΄?€. 
κ·? ?€? 2λ²μ§Έ λΆ??°? λ°λ‘ ? ? ?Όλ³΄λμΉ? ?? ?©?΄ ??€.
?΄λ₯? ??Όλ‘? ?¨λ³΄λ©΄ Fn = Fn-1 + Fn-2 (n ?₯ 2)κ°? ??€.
n=17?Ό? κΉμ? ?Όλ³΄λμΉ? ?λ₯? ?¨λ³΄λ©΄ ?€?κ³? κ°λ€.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
n?΄ μ£Όμ΄μ‘μ ?, nλ²μ§Έ ?Όλ³΄λμΉ? ?λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
*/

import java.util.Scanner;

public class math_10870 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(Fibonacci(a));
		
		sc.close();
	}

	private static int Fibonacci(int a) {
		if(a==0) {
			return 0;
		} else if(a==1) {
			return 1;
		} else {
			return Fibonacci(a-1)+Fibonacci(a-2);

		}
	}
	
}