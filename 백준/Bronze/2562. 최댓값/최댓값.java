import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        int [] arr = new int[9];
        int max = 0;
		int num =0;
		for(int i = 0; i < 9 ; i++) {
			st = new StringTokenizer(br.readLine(), "/n");
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < 9 ; i++) {
			if(max < arr[i]) {
				max = arr[i];
				num = i+1;
			}
		}
		System.out.println(max+ "\n" + num);
	}
}