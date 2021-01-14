package bojAlgorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;


public class b_1406 {
	public static void main (String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
			switch(c) {
			case "L": 
				if(!left.isEmpty())
					right.push(left.pop());
				break;
			case "D":
				if(!right.isEmpty())
					left.push(right.pop());
				break;
			case "B":
				left.pop();
				break;
			case "P":
				left.push(st.nextToken());
				break;
			}
		}
		while(!left.isEmpty())
			right.push(left.pop());
		
		while(!right.isEmpty())
			bw.write(right.pop());
		
	}
}
