package csc130.queue.stack;

public class QStack<T> {
	
	LinkedQueue<T> queue = new LinkedQueue<T>();
	
	public void push(T input) {
		
		queue.enqueue(input);
		
		for(int i = 0; i < queue.getSize() - 1; i++) {
			queue.enqueue(queue.dequeue());
		}
	}
	
	
}
