package bojAlgorithm;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

	public class b_10828 {
	    public static void main(String[] args) throws NumberFormatException, IOException {
	    	
	    	//Stack 객체 선언
	    	Stack<Integer> st = new Stack<Integer>();
	    	//BufferedReader, BufferedWriter 객체 선언
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	//첫째 줄에 부어지는 명령의 수 N
	    	//readLine은  String 형태로 리턴하게 되므로 형 변환이 필수적
	    	int N = Integer.parseInt(br.readLine());
	    	//명령의 수 N만큼 반복한다. 
	    	for(int i=0; i<N; i++) {
	    		//명령은 String number형태, 즉 push 14이므로 , " " 공백으로 split진행
	    		String[] cmd = br.readLine().split(" ");
	    		//스위치문을 사용하여 각 명령문 수행
	    		switch(cmd[0]) {
	    		case "push":
	    			// int cmd[1]을 스택에 넣음
	    			st.push(Integer.parseInt(cmd[1]));
	    			break;
	    		case "pop":
	    			//스택에서 가장 위에 있는 정수를 빼고 그 수를 출력
	    			//but, 스택이 비어있다면 -1을 출력
	    			if(st.empty()) {
	    				bw.write("-1"+"\n");	    				
	    			}else {
	    				bw.write(st.pop() +"\n");
	    			}
	    			break;
	    		case "size":
	    			bw.write(st.size()+"\n");
	    			break;
	    		case "empty":
	    			if(st.empty()) {
	    				bw.write("1"+"\n");
	    			}else {
	    				bw.write("0"+"\n");	    				
	    			}
	    			break;
	    		case "top":
	    			if(st.empty()) {
	    				bw.write("-1"+"\n");
	    			}else {
	    				//pop을 이용해서 맨 마지막 숫자를 꺼내는것 아님
	    				//출력만 해야하기 때문에 peek을 사용
	    				bw.write(st.peek()+"\n");
	    			}
	    			break;
	    		}
	    	}
	    	//버퍼에 남아 있는 문자열을 출력해서 버퍼를 비움
	    	bw.flush();
	    	//스트림 닫기
	    	bw.close();
	    }

	}