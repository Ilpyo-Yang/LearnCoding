package Implement;
// λ¬Έμ?΄ 
/*
-- κ·Έλ£Ή ?¨?΄ μ²΄μ»€ 1316
κ·Έλ£Ή ?¨?΄?? ?¨?΄? μ‘΄μ¬?? λͺ¨λ  λ¬Έμ? ???΄?, κ°? λ¬Έμκ°? ?°??΄? ????? κ²½μ°λ§μ λ§ν?€. 
?λ₯? ?€λ©?, ccazzzzbb? c, a, z, bκ°? λͺ¨λ ?°??΄? ????κ³?, kin? k, i, n?΄ ?°??΄? ????κΈ? ?λ¬Έμ κ·Έλ£Ή ?¨?΄?΄μ§?λ§?, 
aabbbccb? bκ°? ?¨?΄? Έ? ????κΈ? ?λ¬Έμ κ·Έλ£Ή ?¨?΄κ°? ???€.
?¨?΄ Nκ°λ?? ?? ₯?Όλ‘? λ°μ κ·Έλ£Ή ?¨?΄? κ°μλ₯? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±???€.

bbbbbbbbcccccccc
*/


import java.util.Scanner;

public class string_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int cnt = n;
		
		for (int i=0; i<n; i++) {
			String str = sc.nextLine();

			out:
			for (int j=0; j<str.length(); j++) {
				for (int k=j+2; k<str.length(); k++) {
					if(str.charAt(j)!=str.charAt(j+1) && str.charAt(j)==str.charAt(k)) {
						cnt--;
						break out;
					}
				}
			}
		}
		
		
		System.out.println(cnt);
	}
}