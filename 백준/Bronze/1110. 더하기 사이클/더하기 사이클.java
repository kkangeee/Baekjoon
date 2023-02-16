import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reNum = num;
		int count = 0;
		
		while(true) {
			num = ((num % 10) * 10) + (((num / 10) +(num % 10)) %10);
			count += 1;
			if(num == reNum) {
				break;
			}
		}
		System.out.println(count);
	}
}