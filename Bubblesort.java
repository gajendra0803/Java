package programs;
import java.util.*;
public class Bubblesort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array: ");
		int n= sc.nextInt();
		int [] arr =new int[n];
		
		System.out.print("Enter array elements: ");
		for(int i=0; i< n;i++) {
			arr[i] =sc.nextInt();
		}
		
		for(int i =0; i<n; i++) {
			for(int j =1; j< n-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp =arr[j];
					arr[j] =arr[j-1];
					arr[j-1] =temp;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(int i=0; i<n; i++) {
			System.out.print( arr[i]+ " ");
		}
	}

}
