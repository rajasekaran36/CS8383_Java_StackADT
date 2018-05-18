import java.util.Scanner;

interface StackOperations {
	boolean push(int number) throws StackOverFlowException;
	boolean pop();
	void peek();
	boolean isStackEmpty();
	boolean isStackFull();
	void display();
}


class StackOverFlowException extends Exception {
	private static final long serialVersionUID = 1L;
	public StackOverFlowException() {
		System.out.print("Sorry Stack is Full");
	}
}

class CustomStack implements StackOperations{
	int[] stack_array;
	int limit;
	int current_position = -1;
	public CustomStack(int limit) {
		this.limit = limit;
		stack_array = new int[limit];
	}
	
	@Override
	public boolean push(int number) throws  StackOverFlowException{
		throw new StackOverFlowException();
		/*
		if(isStackFull()){
			
		}
		else {
			current_position ++;
			stack_array[current_position] = number;
			System.out.println("The element "+number+" pushed in the position "+current_position);
			return true;
		}
		*/
	}

	@Override
	public boolean pop() {
		if(isStackEmpty()){
			System.out.println("** Sorry Stack is EMPTY nothing to pop !!! **");
			return false;
		}
		else{
			System.out.println("The element "+stack_array[current_position]+"poped from the position "+current_position);
			current_position--;
			return true;
		}
		
	}

	@Override
	public void display() {
		if (isStackEmpty())
			System.out.println("** Nothing to Print Stack is Empty **");
		else {
			System.out.println("Stack Display");
			System.out.println("*************\n");
			for(int i=current_position;i>-1;i--){
				System.out.println("   "+stack_array[i]+"   ");
				System.out.println("------");
			}
		}
	}

	@Override
	public void peek() {
		if (isStackEmpty())
			System.out.println("** Nothing to Print Stack is Empty **");
		else 
			System.out.println("Peek Element of the Stack is " + stack_array[current_position]);
	}

	@Override
	public boolean isStackEmpty() {
		if (current_position == -1)
			return true;
		else
			return false;
	}

	@Override
	public boolean isStackFull() {
		if(current_position == limit)
			return true;
		else
			return false;
	}
	
}
public class Main {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of stack :");
		CustomStack mystack = new CustomStack(input.nextInt());
		int choice = 0;
		while(choice != 5){
			System.out.println("\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT");
			System.out.println("Please Enter Your Choice : ");
			choice = input.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the Element to PUSH : ");
				try {
					mystack.push(input.nextInt());
				} catch (StackOverFlowException e) {
					System.out.print(e.getMessage());
				}
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
	}
}

