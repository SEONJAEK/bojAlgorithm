
package bojAlgorithm;
import java.util.Scanner;
import java.util.Stack;
public class A_9093_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < testCase; i++) {
			Stack stack = new Stack<>();
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ' ') {
					while (!stack.empty()) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				} else {
					stack.add(s.charAt(j));
				}
			}
			while(!stack.empty()) {
				System.out.print(stack.pop());
			}
			System.out.println();

		}
	}
}

