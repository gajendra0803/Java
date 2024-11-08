package programs;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = sc.nextLine();
		String reverse_a = "";
		char ch;
		
		for(int i=0;i< a.length();i++) {
			ch = a.charAt(i);
			reverse_a =ch + reverse_a;
		}
		
		System.out.println(reverse_a);
	}
}
