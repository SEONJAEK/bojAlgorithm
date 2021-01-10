package bojAlgorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class b_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++){
			String str = br.readLine();
			Stack<String> left = new Stack<String>();
			Stack<String> right = new Stack<String>();
			String[] strArr = str.split("");
			for(int j=0; j<strArr.length; j++) {//배열이니까 length를 씀
				if(strArr[0].equals(")")) {
					right.push(")");
					break;							
				}
				else if(strArr[j].equals("(")){
					left.push("(");
				}else if(strArr[j].equals(")")) {
					if(left.isEmpty()){
						right.push(")");
						break;
					}else {
						left.pop();
					}
				}
				
			}
			if(left.isEmpty() && right.isEmpty()) {
				bw.write("YES");
				bw.write("\n");
			}else {
				bw.write("NO");
				bw.write("\n");
			}
				
		}
		bw.flush();
		bw.close();
		
	}

}
