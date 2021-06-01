import java.util.Scanner;

class Stack {
	int s[];
	int top;

	Stack() {
		s = new int[10];
		top = -1;
	}

	void push(int x) {
		if (top == 9) {
			System.out.println("Stack overflow\n");
		} else {
			s[++top] = x;
			System.out.println("Inserted " + x);
		}
	}

	void pop() {
		if (top == -1) {
			System.out.println("Underflow\n");
		} else {
			System.out.println("Remvoed " + s[top]);
			top--;
		}
	}

	void peek() {
		if (top == -1) {
			System.out.println("Underflow\n");
		} else {
			System.out.println("Top Element : " + s[top]);
		}
	}

	void display() {
		if (top == -1) {
			System.out.println("Underflow\n");
		} else {
			System.out.println("\nStack");
			for (int i = top; i >= 0; i--) {
				System.out.println(s[i]);
			}
		}
	}
}

public class Stack_imp {
	public static void main(String args[]) {
		int a = 0;
		Stack obj = new Stack();
		while (a >= 0) {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\n\nSelect your Choice : ");
			a = new Scanner(System.in).nextInt();

			if (a == 1) {
				int n;
				System.out.println("Enter the element :");
				n = new Scanner(System.in).nextInt();
				obj.push(n);
			} else if (a == 2) {
				obj.pop();
			} else if (a == 3) {
				obj.peek();
			} else if (a == 4) {
				obj.display();
			} else if (a == 5) {
				break;
			} else {
				System.out.println("INVALID SELECTION\n");
			}
		}
	}
}