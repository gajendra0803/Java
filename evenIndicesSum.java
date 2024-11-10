package programs;
import java.util.*;
public class evenIndicesSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array: ");
		
		int n =sc.nextInt();
		int sum =0;
		
		int [] arr = new int[n];
		for(int i =0; i< n; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i< n; i++) {
			if(i % 2 ==0) {
				sum += arr[i];
			}
		}
		
		System.out.println("Sum of even Indices are: "+sum);
	}

}
