import java.util.Scanner;
import com.raja.oopslab.stackadt.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of stack :");
		CustomStack mystack = new CustomStack(input.nextInt());
		int choice = 0;
		while (choice != 5) {
			System.out.println("\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT");
			System.out.println("Please Enter Your Choice : ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Element to PUSH : ");
				mystack.push(input.nextInt());
				break;
			case 2:
				mystack.pop();
				break;
			case 3:
				mystack.peek();
				break;
			case 4:
				mystack.display();
				break;
			case 5:
				System.out.println("!!! Thank You !!!");
				break;
			}

		}
		input.close();
		System.exit(0);
	}

}
