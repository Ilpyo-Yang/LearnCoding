package Bruthforce;

//λΈλ£¨?Έ?¬?€
/*
-- ?©μΉ? 7568
μ²? μ€μ? ? μ²? ?¬?? ? N?΄ μ£Όμ΄μ§λ€. 
κ·Έλ¦¬κ³? ?΄?΄μ§?? Nκ°μ μ€μ? κ°? ?¬?? λͺΈλ¬΄κ²μ? ?€λ₯? ????΄? ?? ? ? x?? yκ°? ??? κ³΅λ°±? ?κ³? κ°κ° ?????€.
?¬?¬λΆμ? ?? ₯? ??΄? ?¬?? ?©μΉ? ?±?λ₯? κ΅¬ν΄? κ·? ????λ‘? μ²? μ€μ μΆλ ₯?΄?Ό ??€. 
?¨, κ°? ?©μΉ? ?±?? κ³΅λ°±λ¬Έμλ‘? λΆλ¦¬??΄?Ό ??€.
*/

import java.util.Scanner;

public class bruthforce_7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] figure = new int[cnt+1][2];
		
		for (int i=0; i<cnt; i++) {
			figure[i][0] = sc.nextInt();
			figure[i][1] = sc.nextInt();	
		}
		
		int rank =0 ;
		
		for (int i=0; i<cnt; i++) {
			rank = 1;
			for (int j=0; j<cnt; j++) {
				if(figure[i][0]<figure[j][0] && figure[i][1]<figure[j][1]) {
					rank++;
				}
			}
			if(i==0) System.out.print(rank);
			else System.out.print(" "+rank);
		}
	}

}
