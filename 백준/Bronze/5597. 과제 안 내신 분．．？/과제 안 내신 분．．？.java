import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 30 ; i++) {
			list.add(i,i+1);
		}
		
		for(int i = 0; i < 28 ; i++) {
			int a = sc.nextInt();
			list.remove(Integer.valueOf(a));
		}
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}