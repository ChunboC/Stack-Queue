package csc130.queue.arrray;
/**
 * <p>
 * Title: The QueueEmptyException Class
 * </p>
 * 
 * <p>
 * Description: Defines the specific exception when the queue has an error
 * </p>
 * 
 * @author Maria Yanez
 */
public class QueueFullException extends RuntimeException{
	
	/**
	 * Constructs a new QueueException with a default error message string.
	 */
	public QueueFullException() {
		super("Exception: Queue is Full");
	}
	/**
	 * Constructs a new QueueException with the parameter as the error message string.
	 * @param message The string passed as the error message string.
	 */
	public QueueFullException(String message) {
		super(message);
	}
	
}

