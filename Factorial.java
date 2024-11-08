package programs;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		int fact =1,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		int num= sc.nextInt();
		
		for( i=1; i<=num; i++) {
			fact = fact *i;
			
		}
		
		System.out.println(fact);
		
	}

}
