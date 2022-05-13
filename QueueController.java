package StackImplementation;


import StackImplementation.QueueMethods;
public class QueueController {

	public static void main(String[] args) {
      QueueMethods <Integer> sh = new  QueueMethods <Integer>();
    System.out.println(sh.isempty());
//      sh.enqueue(10);
//      sh.enqueue(20);
    for(int i=1;i<=10;i++){
    	int sum  = (i*10);
    	sh.enqueue(sum);
    }
    sh.display();
      System.out.println(sh.dequeue());
      System.out.println(sh.size());
      System.out.println(sh.isempty());
      QueueMethods <String> str = new  QueueMethods <String>();
      str.enqueue("Sheik");
      str.enqueue("Mohamed ");
      str.enqueue("Ali");
      str.enqueue("Deepan");
 
      
	}

}
