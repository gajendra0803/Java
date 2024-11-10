package programs;
import java.util.*;

public class MaxArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<n ;i++) {
			arr[i] = sc.nextInt();
			}
		
		int max = arr[0];
		for(int i=1; i< n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("The largest element of array is: "+max);
	}
}
