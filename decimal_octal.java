//Q.wjp to convert decimal to octal . 
package day_four;

public class decimal_octal {
	public static void main(String[] args) {
		int no =65;
		String oct = " ";
		while(no!=0) {
			int d = no%4 ; 
			oct = d+  oct; 
			no = no/4;
		}
		System.out.println(oct);
	}
}
