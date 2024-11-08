package programs;
import java.util.*;
public class Arraylst {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		arr.remove(2);
		
		System.out.println("List after removing 3: "+arr);
	}
}
