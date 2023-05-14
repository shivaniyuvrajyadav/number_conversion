//Q . wjp to    convert decimal to binary . 
package day_four;

public class Con_decimal_binary {
public static void main(String[] args) {
	int no =65;
	String bin = " ";
	while(no!=0) {
		int d = no%2 ; //1%2 = 1,0,0,0,0,0,1
		bin = d+bin; //1000001
		no = no/2;
		
	}
	System.out.println(bin);
}
}
