package com.sunbeam.stack;

public class StackDesc {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public StackDesc(int size){
		SIZE=size;
		top=SIZE;
		arr=new int[SIZE];
	
		
	}
public void push(int value)
{
top--;
arr[top]=value;
}
public int pop()
{
	int temp=arr[top];
top++;
return temp;
}

		public int peek() {
	
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == SIZE-1;
	}
	
	public boolean isFull() {
		return top == -1;
	}
}
