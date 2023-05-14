//Q. wjp to check 25 is automorphic no or not. 
package day_four;

public class AutomorphicNum {
public static void main(String[] args) {
	int no = 25;
	int sq = no*no;
	int rem = 0 ; 
	int temp = no;
	int res =0;
	while(no>0) {
		//rem++;
		rem = no%10;
		no = no/10;
		res = sq%10;
		sq = sq/10;
	}
	
	if(temp == sq) {
		System.out.println(no +"it is automorphic number");
	}
	else {
		System.out.println(no+"it is not automorphic number");
	}
	}

}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
