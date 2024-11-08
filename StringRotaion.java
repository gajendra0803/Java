package programs;
import java.util.*;
public class StringRotaion {
	
	public static boolean isrotation(String s1, String s2) {
		
		if(s1.length() != s2.length() || s1.isEmpty()) {
			return false;
		}
		
		String concatenated = s1+s1;
		
		return concatenated.contains(s2);
	}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter String: ");
			String Line1 =sc.nextLine();
			
			System.out.println("Enter rotated String: ");
			String Line2= sc.nextLine();
			
			System.out.println("Is "+Line2+" is a rotation of "+Line1 + " ?" +isrotation(Line1, Line2));
		}
}
