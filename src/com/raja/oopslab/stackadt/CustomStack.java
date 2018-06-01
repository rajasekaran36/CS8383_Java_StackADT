package com.raja.oopslab.stackadt;

public class CustomStack implements StackOperations {
	int[] stack_array;
	int limit;
	int current_position = 0;

	public CustomStack(int limit) {
		this.limit = limit;
		stack_array = new int[limit];
		initStack();
	}

	public void initStack() {
		for (int i = 0; i < limit; i++)
			stack_array[i] = -1;
	}

	@Override
	public boolean push(int number) {

		try {

			stack_array[current_position] = number;
			current_position++;
			System.out.println("The element " + number + " pushed in the position " + current_position);
			display();
			return true;
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry Stack Full Please do some POP's");
		}
		return false;

	}

	@Override
	public boolean pop() {
		int poped_element;
		try {
			poped_element = stack_array[current_position - 1];
			stack_array[current_position - 1] = -1;
			current_position--;
			System.out.println("Poped element is : " + poped_element);
			display();
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry Stack is Empty try to do some push");
		}
		return false;
	}

	@Override
	public void display() {

		System.out.println("\nStack Display");
		System.out.println("*************\n");
		for (int i = limit - 1; i >= 0; i--)
			if (stack_array[i] != -1)
				System.out.println(stack_array[i]);
		System.out.println("\n*************");
	}

	@Override
	public void peek() {
		int peek_element = 0;
		peek_element = stack_array[current_position - 1];
		System.out.println("Peek Element of the Stack is " + peek_element);
	}

}
