package programs;

public class Palindrome {

  public static void main(String[] args) {
		System.out.print("Enter String: " );
		Scanner sc = new Scanner(System.in);
		String a =sc.nextLine();
		int i ,j ;
		i=0;
		j =a.length()-1;
		boolean flag =true;
		
		while(i<j && flag == true) {
			if(a.charAt(i) != a.charAt(j)) {
				flag =false;
				break;
			}
			i++;
			j--;
		}
		
		if(flag) {
			System.out.println("String is Pallindrome");
		}
		
		else {
			System.out.println("String is not Palindrome");
		}
		
		sc.close();
		}

}
