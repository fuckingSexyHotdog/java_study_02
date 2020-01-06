package kr.or.yi.java_study_02.ch07.generic;

import java.util.Arrays;

public class MyStack {
	private int top;
	private String[] stack;
	private int size;

	public MyStack() {
		this.top = -1;
		this.size = 5;
		stack = new String[5];
	}

	public void push(String item) {
		if (!isFull()) {
			this.stack[++top] = item;
		}
	}

	public String pop() {
		if (!isEmpty()) {
			return this.stack[top--];
		}
		return null;
	}

	public boolean isFull() {
		return top == this.size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void prnStack() {
		System.out.println(Arrays.toString(stack));
	}
}
