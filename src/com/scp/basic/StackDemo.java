package com.scp.basic;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack myStack=new Stack();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println("Original Stack \n"+myStack);
		System.out.println("Peek....."+myStack.peek());
		System.out.println("Search....."+myStack.search(10));
		System.out.println("Is Empty....."+myStack.isEmpty());
		System.out.println("Pop....."+myStack.pop());
		System.out.println("Stack After Pop Operation \n"+myStack);
	}

}

/* Output--
  
 Original Stack 
[10, 20, 30]
Peek.....30
Search.....3
Is Empty.....false
Pop.....30
Stack After Pop Operation 
[10, 20]

 */
