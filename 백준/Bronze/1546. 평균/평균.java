import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		int sum =0;
		for(int i =0; i<a ; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int max = arr[0];
		for(int i =1;i<a;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(sum*100/max/(double)a);
		}
	}