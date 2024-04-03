package csc130.queue.arrray;

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> front, rear;
    private int size;
    @Override
    public void enqueue(T data) {
        if (isFull())
            throw new RuntimeException("queue is full.");
        Node<T> temp = new Node<>(data);
        if (isEmpty())
            front = temp;
        else
            rear.next = temp;
        rear = temp;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new RuntimeException("queue is empty.");
        T item = front.data;
        front = front.next;
        size--;
        if (isEmpty())
            rear = null;
        return item;
    }

    @Override
    public T front() {
        if (isEmpty())
            throw new RuntimeException("queue is empty.");
        return front.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public String toString() {
        String str = "";
        Node<T> curr = front;
        while (curr != null)
        {
            str = str + curr.data.toString() + "\n";
            curr = curr.next;
        }
        return str;
    }

    private class Node<E> {
        E data;
        Node<E> next;
        public Node (E data) {
            this.data = data;
            next = null;
        }
    }
}
