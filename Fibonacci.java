package programs;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0, n2 =1, n3,n4;
		System.out.println("Enter a number of terms: ");
		n3 = sc.nextInt();
		System.out.print(n1+ " "+n2);
		
		 for(int i= 2; i<=n3 ;i++) {
			 
			 n4 = n2+n1;
			 n1=n2;
			 n2=n4;
			 System.out.print(" "+n4);
		 }
	}
}
