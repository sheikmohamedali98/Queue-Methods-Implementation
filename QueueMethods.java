package StackImplementation;


public class QueueMethods<T> extends QueueNode<T> implements QueueInterface<T> {
    /* 
     * adding element in Queue
     */
	public void enqueue(T data) {
		if(head == null){
			tail = new Node<T>(data);
			head = tail;   //This tail node will be head
			length++;
		}
		else {
			tail.next = new Node<T>(data);//if head not null tail node will be added
			tail = tail.next;
		}
	}
	/*
	 * deleting the first element or head 
	 * like peek
	 */

	public T dequeue() {
		if (head!=null){
			T result = head.data;//data type
			head = head.next;
			length--;
			return result;//reduce the head
		}
		
		return null;
	}
/*
 *  if the Queue size return 
 */
	public boolean isempty() {
		if(head == null){
			return true;
		}
		return false;
	}
   /*
    * display the what are the elements are stored in Queue
    */
	public void display() {
		 Node<T> display = head;
		while(display!=null){
			System.out.print(display.data+" ");
			display = display.next;
		}
	}

	//return the size of linked list in java 
	public int size() {
		return length;
	}
}
