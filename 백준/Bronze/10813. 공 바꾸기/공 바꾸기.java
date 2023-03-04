import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a]; 
		int tmp = 0;
		for(int i = 0; i < a ; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0;i < b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			tmp = arr[c-1];
			arr[c-1] = arr[d-1];
			arr[d-1] = tmp;
		}
		for(int i = 0; i < a ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}