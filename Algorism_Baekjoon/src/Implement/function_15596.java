package Implement;

//?Ļ?
/*
- ? ?nę°ė ?Đ 15596
Java: long sum(int[] a); (?ī??Ī ?īëĶ?: Test)
a: ?Đ? ęĩŽíī?ž ?? ? ? nę°ę? ???Ĩ??ī ?? ë°°ėī (0 ?Ī a[i] ?Ī 1,000,000, 1 ?Ī n ?Ī 3,000,000)
ëĶŽíīę°?: a? ?Ž?Ļ??ī ?? ? ? nę°ė ?Đ
public class Test {
    long sum(int[] a) {
        long ans = 0;
        return ans;
    }
}
*/

public class function_15596 {
	
    int[] a = new int[1000001];

	public static long sum(int[] a) {
    	long ans = 0, n=0;
    	if(1<=n&&n<=3000000) {
			for (int i=1; i<=n; i++) {
				a[i-0]=i;
			}
		}
    	for (int i=0; i<a.length; i++) {
			ans += a[i];
		}
	return ans;	
	}
}
