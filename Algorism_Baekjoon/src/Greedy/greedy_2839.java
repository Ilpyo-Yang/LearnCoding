package Greedy;


// κ·Έλ¦¬? ?κ³ λ¦¬μ¦?
/*
- ?€?λ°°λ¬ 2839
?κ·Όμ΄? ?μ¦? ?€?κ³΅μ₯?? ?€?? λ°°λ¬?κ³? ??€. ?κ·Όμ΄? μ§?κΈ? ?¬?κ°?κ²μ ?€?? ? ??κ²? N?¬λ‘κ·Έ?¨? λ°°λ¬?΄?Ό ??€. 
?€?κ³΅μ₯?? λ§λ? ?€??? λ΄μ?? ?΄κ²¨μ Έ ??€. λ΄μ?? 3?¬λ‘κ·Έ?¨ λ΄μ??? 5?¬λ‘κ·Έ?¨ λ΄μ?κ°? ??€.
?κ·Όμ΄? κ·?μ°?κΈ? ?λ¬Έμ, μ΅λ?? ? ?? λ΄μ?λ₯? ?€κ³? κ°?? €κ³? ??€. 
?λ₯? ?€?΄, 18?¬λ‘κ·Έ?¨ ?€?? λ°°λ¬?΄?Ό ?  ?, 3?¬λ‘κ·Έ?¨ λ΄μ? 6κ°λ?? κ°?? Έκ°?? ?μ§?λ§?, 
5?¬λ‘κ·Έ?¨ 3κ°μ? 3?¬λ‘κ·Έ?¨ 1κ°λ?? λ°°λ¬?λ©?, ? ? ?? κ°μ? λ΄μ?λ₯? λ°°λ¬?  ? ??€.
?κ·Όμ΄κ°? ?€?? ? ??κ²? N?¬λ‘κ·Έ?¨ λ°°λ¬?΄?Ό ?  ?, λ΄μ? λͺ? κ°λ?? κ°?? Έκ°?λ©? ??μ§? κ·? ?λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
*/

import java.util.Scanner;

public class greedy_2839 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt =0;
		
		if(n<3) System.out.println(-1);
		else if(3<=n && n<=5000){
			cnt += n/5;
			n=n%5;
			
			if(n%3!=0) cnt += n/3+1;
			else cnt += n/3;
			
			System.out.println(cnt);
		}
		sc.close();
	}
}

/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int N = Integer.parseInt(br.readLine());
if (N == 4 || N == 7) {
System.out.println(-1);
}
else if (N % 5 == 0) {
System.out.println(N / 5);
}
else if (N % 5 == 1 || N % 5 == 3) {
System.out.println((N / 5) + 1);
}
else if (N % 5 == 2 || N % 5 == 4) {
System.out.println((N / 5) + 2);
}
}
}

μΆμ²: https://st-lab.tistory.com/72 [Stranger's LAB]
*/
