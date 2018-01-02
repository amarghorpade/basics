package com.scp.OwnClasses;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
	Object array[];
	int size = 0;
	static int capacity = 10;
	static int p = capacity;

	public MyArrayList(Object[] array, int size) {
		super();
		this.array = array;
		this.size = size;
	}

	public MyArrayList(Object[] array) {
		super();
		this.array = new Object[p];

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}

	T addArrayList(T t) {
		if (size == capacity) {
			array = growArray(array);
			// array = array1;
			array[size] = t;
			size++;

		} else {
			array[size] = t;
			size++;
			// System.out.println(array);
		}
		return (T) t;

	}

	<T> T[] growArray(T[] o) {
		// System.out.println(array);
		p = p * 2;
		capacity = p;
		o = Arrays.copyOf(o, p);
		return o;

	}

	T remove(T t) throws Exception {

		if (size < (size - 1))
		{
			throw new Exception("ArrayIndexOutOfBoundsException");
		} 
		else
		{
			Object o = array[ (Integer) t];
			array[(Integer) t] = null;
			int temp = (Integer) t;
			while (temp < size) {
				array[temp] = array[temp + 1];
				array[temp + 1] = null;
				temp++;
			}
		}

		return null;

	}

	T contains(T t) {
		boolean k;
		for (int i = 0; i < size; i++) {
			int d = (int) array[i];
			k = t.equals(d);
			System.out.println(k);
		}
		return t;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		// al.

		MyArrayList mal = new MyArrayList(args);
		mal.addArrayList(1);
		mal.addArrayList(2);
		mal.addArrayList(3);
		mal.addArrayList(4);
		mal.addArrayList(5);
		mal.addArrayList(6);
		mal.addArrayList(7);
		mal.addArrayList(8);
		mal.addArrayList(9);
		mal.addArrayList(10);
		mal.addArrayList(11);
		mal.contains(10);

		for (int i = 0; i < mal.size; i++) {
		}
		System.out.println(mal);
		mal.remove(1);
		for (int i = 0; i < mal.size; i++) {
		}
		System.out.println(mal);
	}
}