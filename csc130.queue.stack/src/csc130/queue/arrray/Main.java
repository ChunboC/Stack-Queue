package csc130.queue.arrray;

public class Main {
	public static void main (String args[]) {
		QueueStack<Integer> qStack = new QueueStack<Integer>();
		qStack.push(1);
		qStack.push(4);
		qStack.push(8);
		System.out.println(qStack);
		
		StackQueue<Integer> sQueue = new StackQueue<Integer>();
		sQueue.enqueue(2);
		sQueue.enqueue(5);
		sQueue.enqueue(6);
		System.out.println(sQueue);
	}
}
