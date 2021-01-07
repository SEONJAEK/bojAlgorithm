package bojAlgorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class b_9093 {

	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> st= new Stack<Character>();
		
		int num = Integer.parseInt(bf.readLine());
		while(num-- >0) {
			String input = bf.readLine()+"\n";
			for(char ch: input.toCharArray()) {
				if(ch == ' '|| ch =='\n') {
					while(!st.isEmpty()) {
						bw.write(st.pop()); //pop으로 없어질 항목을 직접 써준다
					}
					bw.write(ch);
				}else {
					st.push(ch);
				}				
			}
		}
		bw.flush();//스트림을 비웁니다.
		bw.close();//스트림을 닫습니다.
	}

}
