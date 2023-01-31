import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int arr[] = new int[3];
		arr[0] = B /100;
		arr[1] = (B % 100)/10;
		arr[2] = B % 10;
		
		System.out.println(A * arr[2]);
		System.out.println(A * arr[1]);
		System.out.println(A * arr[0]);
		System.out.println(A * B);
    }
}