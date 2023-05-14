package day_five;

public class hexadecimal {
public static void main(String[] args) {
	int no = 6523;
	String hexa = " ";
	while(no!=0) {
		int d = no%16;
		switch(d) {
		case 10:hexa=hexa+"A";
		break;
		case 11:hexa=hexa+"B";
		break;
		case 12:hexa=hexa+"C";
		break;
		case 13:hexa=hexa+"D";
		break;
		case 14:hexa=hexa+"E";
		break;
		case 15:hexa=hexa+"F";
		break;
		default:hexa=hexa+"d";
		}
		no = no/16;
		
	}
	System.out.println(hexa);
	
}
}
