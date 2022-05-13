package StackImplementation;
/*
 * All Queue methods hide in that interface
 */
 interface QueueInterface<E> {
void enqueue(E element);
E dequeue();
boolean isempty();
void display();
int size();
}
