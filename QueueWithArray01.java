package queue;
class Queue{
	int data[];
	int front;
	int rear;
	int size;
	Queue(int len){
		data = new int[len];
		front = rear = -1;
		size = 0;
	}
	
	int getSize() {
		return size;
	}
	boolean isEmpty() {
		return size == 0;
	}
	int getFrontValue() {
		if(size==0) {
			throw new RuntimeException("Queue is Empty , Nothing on Front");
		}
		return data[front];
	}
	void enqueue(int element) {
		if(size==data.length) {
			throw new RuntimeException("Queue is Full Can't enqueue");
		}
		if(size==0) {
			front = 0;
		}
		rear++;
		size++;
		if(rear==data.length) {
			rear = 0;
		}
		data[rear] = element;
		
		
	}
	int dequeue() {
		if(size==0) {
			throw new RuntimeException("Queue is Empty Can't dequeue");
		}
		if(size==0) {
			front = 0;
		}
		int temp = data[front];
		front++;
		if(front== data.length) {
			front =0;
		}
		
		size--;
		if(size==0) {
			front = rear = -1;
		}
		return temp;
		
	}
	void print() {
		while(!isEmpty()) {
			System.out.println(dequeue());
		}
	}
}
public class QueueWithArray01 {
public static void main(String[] args) {
	Queue queue = new Queue(4);
	queue.enqueue(100);
	queue.enqueue(3000);
	queue.enqueue(9999);
	queue.enqueue(2000);
	//queue.print();
	
	queue.dequeue();
	queue.dequeue();
	System.out.println("Now DeQueue Print");
	queue.enqueue(877);
	queue.print();
	//queue.print();
	//queue.enqueue(99999);
}
}
