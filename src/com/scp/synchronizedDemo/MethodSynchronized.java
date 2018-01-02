package com.scp.synchronizedDemo;

public class MethodSynchronized extends Thread {
	static int count = 0;

	public void run() {
		for (int i = 0; i < 10; i++)
			count += 1;
	}

	public static void main(String[] args) throws InterruptedException {
		MethodSynchronized ms = new MethodSynchronized();
		ms.start();
		ms.join();
		System.out.println(count);
	}
}