package StackImplementation;
 /* separate linkedList node class 
  * data and pointer
  * length for size
  * 
  */
public class QueueNode<T>{

	public  Node<T> head;
	public Node<T> tail;
	 public int length;
	
	public static class Node <T>{
        public   T data;
        public Node<T> next;
        //new Node Creation 
        public Node(T data){
        this.data = data;
        this.next = null;
        }
		  
	}
}

