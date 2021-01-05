package bojAlgorithm;
import java.util.Scanner;

public class b_10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input;
		int[] arr = new int[N]; //스택 저장소 크기 지정
		int top = -1; //이해가 안감
		
		
		for(int i=0; i<N; i++) {
			input = sc.next();
			if(input.equals("push")) { //push일 경우
				top++;
				arr[top] = sc.nextInt();
			}else if(input.equals("pop")) { //pop일 경우
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
					top--;
				}				
			}else if(input.equals("size")) { //size일 경우
				System.out.println(top+1);
			}else if(input.equals("empty")) { //empty일 경우
				if(top == -1) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(input.equals("top")) { //top일 경우
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
				}
			}
		}
	}
}
