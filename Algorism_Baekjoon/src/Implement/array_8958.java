package Implement;

//1μ°¨μ λ°°μ΄, 8958
/*
- ox?΄μ¦ 8958
"OOXXOXXOOO"?? κ°μ? OX?΄μ¦? κ²°κ³Όκ°? ??€. O? λ¬Έμ λ₯? λ§μ? κ²μ΄κ³?, X? λ¬Έμ λ₯? ??λ¦? κ²μ΄?€. 
λ¬Έμ λ₯? λ§μ? κ²½μ° κ·? λ¬Έμ ? ? ?? κ·? λ¬Έμ κΉμ? ?°?? O? κ°μκ°? ??€. ?λ₯? ?€?΄, 10λ²? λ¬Έμ ? ? ?? 3?΄ ??€.
"OOXXOXXOOO"? ? ?? 1+2+0+0+1+0+0+1+2+3 = 10? ?΄?€.
OX?΄μ¦? κ²°κ³Όκ°? μ£Όμ΄μ‘μ ?, ? ?λ₯? κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
*/

import java.util.Scanner;

public class array_8958 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		
		String check = sc.nextLine();
		String[] strArr = new String[]{check};
		
		int score = 0;

			for(int j=1;j<strArr.length+1;j++) {
				if("o".equalsIgnoreCase(strArr[j])) 
					score++;
			}
			System.out.println(score);

		
		
		
		sc.close();
	}
	
}

/*
import java.util.Scanner;

public class java_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        String[] str = new String[num+1];

        for (int i = 0; i < num; i++) {
            int count = 0, sum = 0;
            str[i] = sc.next();
            for (int j =0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O')
                    sum += ++count;
                else count = 0;
            }
            System.out.println(sum);
        }
        
        sc.close();
    }
} 
 */
