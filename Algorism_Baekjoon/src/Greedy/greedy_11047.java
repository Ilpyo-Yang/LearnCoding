package Greedy;


// κ·Έλ¦¬? ?κ³ λ¦¬μ¦?
/*
- ?? 0 11047
μ€?κ·κ? κ°?μ§?κ³? ?? ?? ?? μ΄? Nμ’λ₯?΄κ³?, κ°κ°? ?? ? λ§€μ° λ§μ΄ κ°?μ§?κ³? ??€.
?? ? ? ? ? ?¬?©?΄? κ·? κ°?μΉμ ?©? Kλ‘? λ§λ€? €κ³? ??€. 
?΄? ??? ??  κ°μ? μ΅μκ°μ κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.

μ²«μ§Έ μ€μ Nκ³? Kκ°? μ£Όμ΄μ§λ€. (1 ?€ N ?€ 10, 1 ?€ K ?€ 100,000,000)
?μ§? μ€λ??° Nκ°μ μ€μ ?? ? κ°?μΉ? Aiκ°? ?€λ¦μ°¨??Όλ‘? μ£Όμ΄μ§λ€. 
(1 ?€ Ai ?€ 1,000,000, A1 = 1, i ?₯ 2?Έ κ²½μ°? Ai? Ai-1? λ°°μ)
*/

import java.util.Scanner;

public class greedy_11047 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int sum = 0;
		
		int[] moneyArr = new int[n+1];
		
		for (int i=0; i<n; i++) moneyArr[i]=sc.nextInt();
		for (int i=n; i>0; i--) {
			if(moneyArr[i]!=0) {
				sum += k/moneyArr[i];
				k=k%moneyArr[i];
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, m = 0, n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n + 1];
		for (i = 1; i <= n; i++) a[i] = sc.nextInt();
		for(i=n;i>0;i--){
			m+=k/a[i];
            k%=a[i];
		}
		System.out.println(m);
        sc.close();
	}
} 
*/
