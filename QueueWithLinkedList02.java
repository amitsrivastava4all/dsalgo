package queue;
class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data= data;
	}
	
}
class QueueNode<T>{
	
	Node<T> front;
	Node<T> rear;
	int size; // store size of linked list (queue)
	QueueNode(){
		front = rear = null;
		size = 0;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size ==0;
	}
	T getFront() {
		if(size ==0) {
			throw new RuntimeException("Queue is Empty can't give front");
		}
		return front.data;
	}
	void enqueue(T element) {
		Node<T> node = new Node<>(element);
		if(rear==null) {
			rear = front = node;
			
		}
		else {
		rear.next = node;
		rear = node;
		}
		size++;
	}
	T dequeue() {
		if(size==0) {
			throw new RuntimeException("DeQueue is Empty");
		}
		T temp = front.data;
		front = front.next;
		if(size==1) {
			rear = null;
		}
		size--;
		return temp;
	}
}

public class QueueWithLinkedList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
