package csc130.queue.arrray;

public class StackQueue<T> {
	ArrayStack<T> stack1 = new ArrayStack<T>();
	ArrayStack<T> stack2 = new ArrayStack<T>();
	
	public void enqueue(T data) {
		// move all items from stack1 to stack2
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		// stack1 is empty, put item in, now item is at the bottom of stack 1
		stack1.push(data);
		// push items back to stack1 from stack2
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	
	public T dequeue() throws Exception {
		if (stack1.isEmpty()) 
			throw new Exception("StackQueue empty");
		return stack1.pop();
	}
	
	public T front() throws Exception {
		if (stack1.isEmpty()) 
			throw new Exception("StackQueue empty");
		return stack1.peek();
	}
	
	public String toString() {
		return stack1.toString();
	}
	
}
