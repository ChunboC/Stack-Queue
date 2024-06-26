package csc130.queue.stack;

public interface Queue<T> {
	void enqueue(T data) throws RuntimeException;

	T dequeue() throws RuntimeException;

	T front() throws RuntimeException;

	int getSize();

	boolean isFull();

	boolean isEmpty();
}
