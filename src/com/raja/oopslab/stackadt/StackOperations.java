package com.raja.oopslab.stackadt;

public interface StackOperations {
	
	boolean push(int number);

	boolean pop();

	void peek();

	boolean isStackEmpty();

	boolean isStackFull();

	void display();
}