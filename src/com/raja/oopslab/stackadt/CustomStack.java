package com.raja.oopslab.stackadt;
public class CustomStack implements StackOperations {
	int[] stack_array;
	int limit;
	int current_position = -1;

	public CustomStack(int limit) {
		this.limit = limit;
		stack_array = new int[limit];
	}

	@Override
	public boolean push(int number) {

		if (isStackFull()) {
			System.out.println("Sorry Stack is Full ... Try to POP ");
			return false;
		} else {
			current_position++;
			stack_array[current_position] = number;
			System.out.println("The element " + number + " pushed in the position " + current_position);
			return true;
		}

	}

	@Override
	public boolean pop() {
		if (isStackEmpty()) {
			System.out.println("** Sorry Stack is EMPTY nothing to pop !!! **");
			return false;
		} else {
			System.out.println(
					"The element " + stack_array[current_position] + "poped from the position " + current_position);
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
			for (int i = current_position; i > -1; i--) {
				System.out.println("   " + stack_array[i] + "   ");
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
		if (current_position == limit - 1)
			return true;
		else
			return false;
	}

}
