package programs;
import java.util.*;
public class reverse_array {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a size of an Array: ");
	int n = sc.nextInt();
	int i;
	
	int [] arr = new int[n];
	System.out.println("Enter array element: ");
	for(i=0; i<n; i++) {
		arr[i] =sc.nextInt();
		}
	
	for (i = 0; i < n / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
    }
	
	System.out.println("Reversed array:");
    for (i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
	
	
	
	
	
}
}
