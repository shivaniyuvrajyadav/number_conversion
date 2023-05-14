package day_five;

public class bindec {
public static void main(String[] args) {
	int no = 1000001;
	int power = 1;
	int sum = 0;
	while(no!=0) {
		int d = no%10;  //1%10=1
	    sum = sum+d*power; //1+64
	    power = power*2;
	    no = no/10;
	}
	System.out.println(sum);
}
}
