package Implement;

//forλ¬?
/*
- A+B - 8 11022
μ²«μ§Έ μ€μ ??€?Έ μΌ??΄?€? κ°μ Tκ°? μ£Όμ΄μ§λ€.

κ°? ??€?Έ μΌ??΄?€? ? μ€λ‘ ?΄λ£¨μ΄? Έ ??Όλ©?, κ°? μ€μ A?? Bκ°? μ£Όμ΄μ§λ€. (0 < A, B < 10)
κ°? ??€?Έ μΌ??΄?€λ§λ€ "Case #x: A + B = C" ???Όλ‘? μΆλ ₯??€. x? ??€?Έ μΌ??΄?€ λ²νΈ?΄κ³? 1λΆ??° ???λ©?, C? A+B?΄?€.
*/

/*
import java.io.*;

public class for_11022 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int cnt = Integer.parseInt(br.readLine());
			for(int i=0;i<cnt;i++) {
				int a = br.read();
				int b = br.read();
				System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
			}
			br.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
*/


import java.util.Scanner;

public class for_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
		}
		
	}

}
