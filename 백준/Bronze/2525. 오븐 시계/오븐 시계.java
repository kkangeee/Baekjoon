import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b+c >=60) {
			int x = (b+c) / 60;  
			int y = (b+c) % 60;
			int z = (a+x >23) ? (a+x)-24 : (a+x);
			System.out.println(z +" "+ y);
		}else {
			System.out.println(a +" " + (b+c));
		}
	}
		
	}