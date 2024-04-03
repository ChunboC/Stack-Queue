package csc130.queue.arrray;

public class QueueStack<T> {
	LinkedQueue<T> queue = new LinkedQueue<T>();
	
	public void push(T data) {
		int size = queue.getSize();
		queue.enqueue(data);
		for (int i = 0; i < size; i++) {
			T pre = queue.dequeue();
			queue.enqueue(pre);
		}
	}
	
	public T pop() throws QueueEmptyException {
		if (queue.isEmpty())
			throw new QueueEmptyException();
		T top = queue.dequeue();
		return top;
	}
	
	public T peek() throws QueueEmptyException {
		if (queue.isEmpty())
			throw new QueueEmptyException();
		return queue.front();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public String toString() {
		return queue.toString();
	}
}
