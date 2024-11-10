package programs;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a size of an array : ");
		int n =sc.nextInt();
		
		
		int [] arr =new int[n];
		System.out.println("Enter array : ");
		
		for(int i=0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Array after removing duplicates: ");
		
		for(int i =0; i< n;i++) {
			boolean isDuplicate = false;
			for(int j=0; j < i; j++) {
				
				if(arr[i] == arr[j] ) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				System.out.println(arr[i]+ " ");
			}
		}
		sc.close();
	}
}
