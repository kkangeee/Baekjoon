import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//1번
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (value < b)
				sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
}

//2번
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
