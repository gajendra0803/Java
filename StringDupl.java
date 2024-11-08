package programs;
import java.util.*;



public class StringDupl {
	public static String removeDuplicate(String str) {
		HashSet<Character> unique = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char ch : str.toCharArray()) {
			if(unique.add(ch)) {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String inputString = sc.nextLine();
		
		String result = removeDuplicate(inputString);
		System.out.println("New string :  "+result);
		
	}

}
