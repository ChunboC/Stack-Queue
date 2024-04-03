package csc130.queue.arrray;

public class ArrayQueue<T> implements Queue<T> {
	private T[] items;
	private int size, front, rear;	// front and rear are POSITIONS!
	private final int CAPACITY = 100;
	
	public ArrayQueue() {
		items = (T[])new Object[CAPACITY];
	}
	
	public ArrayQueue(int size) {
		items = (T[])new Object[size];
	}
	
	@Override
	public void enqueue(T data) throws RuntimeException {
		if (isFull())
			throw new RuntimeException("Queue full exception");
		items[rear] = data;
		rear = (rear + 1) % items.length;
		size++;
	}

	@Override
	public T dequeue() throws RuntimeException {
		if (isEmpty())
			throw new RuntimeException("Queue empty exception");
		T item = items[front];
		front = (front + 1) % items.length;
		size--;
		return item;
	}

	@Override
	public T front() throws RuntimeException {
		if (isEmpty())
			throw new RuntimeException("Queue empty exception");
		return items[front];
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isFull() {
		return size == items.length;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String str = new String();
		for (int i = 0; i < size; i++) {
			str += items[(front + i) % items.length];
			str += (i < size - 1) ? ", " : ""; 
		}
		return str;
	}
}