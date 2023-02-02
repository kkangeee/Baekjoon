import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c && a== c ) {
			System.out.println(10000 + a*1000);
		}else if (a == b || a == c) {
			System.out.println(1000 + a*100);
		}else if (b ==c) {
			System.out.println(1000 + b*100);
		}else {
			int z = Math.max(a, b);
			z = Math.max(z, c);
			System.out.println(z * 100);
		}
	}
		
	}