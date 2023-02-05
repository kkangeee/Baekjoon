import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//별찍기
		for(int i=1; i < a+1 ; i++) {
			//스페이스
			for(int j = a ; j > i ; j--) {
				System.out.print(" ");
			}
			
			//별찍기
			for(int j = 0 ; j < i ;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
		
}