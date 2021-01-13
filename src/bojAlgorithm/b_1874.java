package bojAlgorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.io.IOException;

public class b_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); //출력할 결과물 저장
		
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		
		int start = 0;
		
		//N번 반복
		while(N-- >0) {
			int value = Integer.parseInt(br.readLine());
			
			//value> start일때
			if(value > start) {
				//value까지 for문돌려서 push(값)도 해야하고, append(+)도 해야하고
				for(int i = start + 1; i<= value; i++ ) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = value;// 다음 push할때의 오름차순을 유지하기 위해 변수를 초기화
			}
			//top에 있는 원소가 입력받은 값과 같지 않은 경우
			else if(stack.peek() != value) {
				System.out.println("NO");
			}
			// value=start일때
			stack.pop();
			sb.append('-').append('\n');
		}
		//결과물 출력
		System.out.println(sb);
		
	}
}


