import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] arr = new int[a];
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i< a ; i++) {
			arr[i] = scanner.nextInt();
			if(b > arr[i]) {
				arrayList.add(arr[i]);
			}
		}
		for(int i = 0;i <arrayList.size();i++) {
			System.out.print(arrayList.get(i));
			System.out.print(" ");
		}
		
	}
}