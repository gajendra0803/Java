package programs;
import java.util.*;
public class VowelConsonantCounter {
	public static void main(String[] args) {
		int V_count=0, C_count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)== 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				V_count++;
			}
			
			else if(str.charAt(i) >= 'a'&& str.charAt(i) <= 'z'){
				C_count++;
			}
		}
		
		System.out.println("Number of vowels in  String: "+V_count);
		System.out.println("Number of consonant in String: "+C_count);
		
	}

}
