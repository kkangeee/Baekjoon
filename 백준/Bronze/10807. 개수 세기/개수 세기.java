import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		int sum = 0;
		for(int i = 0; i < a ; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		
		for(int i = 0; i < a ; i++) {
			if(b == arr[i]) {
				sum+=1;
			}
		}
		System.out.println(sum);
	}
}