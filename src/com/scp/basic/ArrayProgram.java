package com.scp.basic;

import java.util.Arrays;

public class ArrayProgram<T> {

	T[] X;
	int defaultCapacity = 10;
	int current = 0;
	static int size = 10;
	T dummy = null;
	int valueChecker = 0;

	public ArrayProgram() {
		X = (T[]) new Object[defaultCapacity];
	}

	public void addElement(T t) {
		if (current == size) {
			X = grow(X);
			X[current] = t;
			current++;
		} else {
			X[current] = t;
			current++;
		}
	}

	public void removeElement(T t) {
		for (int i = 0; i < X.length; i++)
			if (X[i] == t) {
				for (int j = i; j < X.length - 1; j++)
					X[j] = X[j + 1];
				X = Arrays.copyOfRange(X, 0, X.length - 1);
				current--;
				size--;
				valueChecker++;
			}

		if (valueChecker == 0)
			System.out.println("Element not found in ArrayList.");
		valueChecker = 0;
	}

	public String getIndexOfElement(T t) {
		for (int i = 0; i < X.length; i++) {
			if (X[i] == t) {
				return i + "";
			}
		}
		return "Element not found in ArrayList";
	}

	public T getElementAtIndex(int Index) {
		if (Index > X.length)
			return dummy;
		else
			return X[Index];
	}

	private T[] grow(T[] A) {
		System.out.println("in grow method");
		size = size * 5;
		A = Arrays.copyOf(A, size);
		//size = newCapacity;
		return A;

	}
	
	
		public static void main(String[] args) {
		ArrayProgram ary = new ArrayProgram<>();
		ary.addElement(10);
		ary.addElement(20);
		ary.addElement(30);
		ary.addElement(40);
		ary.addElement(50);
		ary.addElement(60);
		ary.addElement(70);
		ary.addElement(80);
		ary.addElement(1);
		ary.addElement(2);
		ary.addElement(3);
		ary.addElement(4);
		ary.addElement(5);
		ary.addElement(6);
		ary.addElement(7);
		ary.addElement(8);

		System.out.println(ary.size);
	
		ary.display();
		System.out.println("*******************************************************************************");
		ary.removeElement(7);
		System.out.println(ary.getIndexOfElement(1));
		//System.out.println(ary.size);
		/*for(int i=0; i<ary.size; i++)
		{	
		System.out.println(ary);
		}*/
		ary.display();
	}

		private void display() 
		{
			for(int i=0; i<X.length;i++){
				System.out.println(X[i]);
			}
		}
}
