package Implement;

//?¨?, λΈλ£¨?Έ?¬?€ ?κ³ λ¦¬μ¦?
/*
- ?? 1065
?΄?€ ?? ? ? X? κ°? ?λ¦¬κ? ?±μ°¨μ?΄? ?΄λ£¬λ€λ©?, κ·? ?λ₯? ???Όκ³? ??€. ?±μ°¨μ?΄?? ?°?? ? κ°μ ?? μ°¨μ΄κ°? ?Ό? ? ??΄? λ§ν?€. 
N?΄ μ£Όμ΄μ‘μ ?, 1λ³΄λ€ ?¬κ±°λ κ°κ³ , Nλ³΄λ€ ?κ±°λ κ°μ? ??? κ°μλ₯? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±???€. 
μ²«μ§Έ μ€μ 1,000λ³΄λ€ ?κ±°λ κ°μ? ??°? N?΄ μ£Όμ΄μ§λ€.
μ²«μ§Έ μ€μ 1λ³΄λ€ ?¬κ±°λ κ°κ³ , Nλ³΄λ€ ?κ±°λ κ°μ? ??? κ°μλ₯? μΆλ ₯??€.
https://steemit.com/kr-dev/@gyeryak/easyalgo-2-bruteforce
*/

import java.util.Scanner;

public class function_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int hansu = 0;
		
		for(int i=1;i<input+1;i++) {
			if(cnt(i)<3) hansu++; 
			else if(i/100+i%10==i/10%10*2) hansu++;
		}
		System.out.println(hansu);
		sc.close();
	}
	
	public static int cnt(int x) {
		int a = 1;
		for(int j=0; x/10!=0; j++) {
		    a++;	
			x=x/10;
		}
	return a;
	}	
}
