import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [10];
		int[] arr2 = new int [42];
		int result = 0;
		
		for(int i = 0; i<10; i++) {
			arr[i] = sc.nextInt();
			
			int num = arr[i] % 42;
			if(arr2[num] != 1) {
				arr2[num] = 1;
				result++;
			}
		}
		System.out.println(result);
	}
}