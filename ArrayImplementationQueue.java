package com.stack;

public class ArrayImplementationQueue {
	int maxSize;
	int[] queue;
	int front; 
	int rear;
	int currSize;
	boolean flag;
	
	public ArrayImplementationQueue(int size) {
		this.maxSize = size;
		this.queue = new int[size];
		front =0;
		rear = -1;
		currSize = 0;
	}
	
	public void enQueue(int n) {
		if(isFull()) {
			System.out.println("Queue is full, enQueue not possible");
			return;
		}
		if(rear == maxSize-1) {
			rear = -1;
		}
//		rear++;
		queue[++rear] = n;
		currSize++;
		
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty, deQueue not possible");
			flag=false;
			return 0;
		}
		int ret = queue[front++];
		if(front == maxSize) {
			front=0;
		}
		currSize--;
		flag=true;
		return ret;
	}
	
	public int peek() {
		if(flag) {
			return queue[front];
		}
		else
			return 0;
		
	}
	
	private boolean isFull() {
		return currSize == maxSize;
	}
	
	private boolean isEmpty() {
		return currSize== 0;
	}

	public static void main(String[] args) {
		ArrayImplementationQueue aq = new ArrayImplementationQueue(3);
		aq.enQueue(2);
		aq.enQueue(8);
		System.out.println(aq.deQueue());
		System.out.println(aq.deQueue());
		aq.enQueue(45);
		aq.enQueue(9);
		System.out.println(aq.deQueue());
		System.out.println("Peek is: "+aq.peek());
		System.out.println(aq.deQueue());
		System.out.println(aq.deQueue());
		System.out.println(aq.deQueue());
		System.out.println("Peek is: "+aq.peek());
	}

}
