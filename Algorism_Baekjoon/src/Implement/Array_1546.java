package Implement;

// λ°°μ΄
/*
-- ?κ·? 1546
?Έμ€??΄? κΈ°λ§κ³ μ¬λ₯? λ§μ³€?€. ?Έμ€??΄? ? ?λ₯? μ‘°μ?΄? μ§μ κ°?? Έκ°?κΈ°λ‘ ??€. 
?Ό?¨ ?Έμ€??΄? ?κΈ? ? ? μ€μ μ΅λκ°μ κ³¨λ?€. ?΄ κ°μ M?΄?Όκ³? ??€. 
κ·Έλ¦¬κ³? ?? λͺ¨λ  ? ?λ₯? ? ?/M*100?Όλ‘? κ³ μ³€?€.

?λ₯? ?€?΄, ?Έμ€??΄? μ΅κ³ ? ?΄ 70?΄κ³?, 
??? ?κ°? 50?΄??Όλ©? ??? ?? 50/70*100?΄ ??΄ 71.43? ?΄ ??€.

?Έμ€??΄? ?±? ? ?? λ°©λ²??λ‘? ?λ‘? κ³μ°?? ?, ?λ‘μ΄ ?κ· μ κ΅¬ν? ?λ‘κ·Έ?¨? ??±???€.
*/
import java.util.*;

public class Array_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double max=0, sum=0; 
		double[] arr = new double[x];
		
		for (int i=0; i<x; i++) {
			arr[i]=sc.nextDouble();
			if(arr[i]>max)
				max=arr[i];
		}
		
		for (int i=0; i<x; i++) {
			arr[i]=arr[i]/max*100;
			sum += arr[i];
		}
		
		System.out.println(sum/x);
		
		sc.close();
	}
}

/*
? ??? Έ?μ§? λͺ¨λ₯΄? ?? ?΅
import java.util.*;

public class Array_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double sum=0; 
		List<Double> listArr = new ArrayList<>();
		List<Double> newlistArr = new ArrayList<>();
		
		for (int i=0; i<x; i++) {
			listArr.add(sc.nextDouble());
		}
		
		double max = Collections.max(listArr);
		
		for (int i=0; i<x; i++) {
			newlistArr.add(listArr.get(i)/(double)max*100);

		}
		
		for (int i=0; i<x; i++) {
			System.out.println(newlistArr.get(i));
			sum += newlistArr.get(i);
		}
		
		System.out.println(sum/x);
		
		sc.close();
	}

}
 
*/
 */