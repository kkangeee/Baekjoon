import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		for(int i = 1; i < a+1 ; i++) {
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			bw.write("Case #" + i +": " + b +" + " + c +" = "+ (b+c) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}