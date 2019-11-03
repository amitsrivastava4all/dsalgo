class Node<T>{
	T data;
	Node<T> next;
	boolean isVisited;
	Node(T data){
		this.data = data;
		next = null;
	}
	public String toString() {
		return "Node "+data+"  Pointor "+next;
	}
}
class LinkedListOperations<T>{
	private  Node<T> start;
	 void insertAtEnd(Node<T> node) {
		if(start == null) {
			start = node;
			return;
		}
		Node<T> temp = start;
		while(temp.next!=null) {
			temp= temp.next;
		}
		temp.next = node;
		
		
	}
	 void print() {
		 Node<T> temp = start;
		 while(temp!=null) {
			 System.out.println("Node is "+temp.data);
			 temp = temp.next;
		 }
	 }
	 
	 void insertAtBeg(Node<T> node) {
		 if(start == null) {
				start = node;
				return;
			}
		node.next = start;
		start = node;
	}
 void insertAtMid(Node<T> node ,int position) {
	if(start==null) { 
		start = node;
		return ;
	}
	if(position==0) {
		node.next = start;
		start = node;
		return;
	}
	
	if(position>0) {
		int i = 1;
		Node<T> temp = start;
		while(i<position) {
			temp = temp.next;
			i++;
		}
		node.next = temp.next;
		temp.next = node;
		
		
	}
}
static void deleteInBeg() {
	
}
void deleteInMid(int position) {
	Node<T> temp = null;
	if(start==null) {
		System.out.println("LinkedList is Empty Can't Delete");
		return ;
	}
	if(position==0) {
		temp = start.next;
		start = temp;
		return ;
 	}
	temp = start;
	int i = 1;
	while(i<position) {
		temp = temp.next;
		i++;
	}
	temp.next= temp.next.next;
	
}
void midPoint() {
	Node<T> slow;
	Node<T> fast;
	if(start!=null) {
		fast = slow = start;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println("Mid Point is "+slow.data);
	}
}
static void deleteInEnd() {
	
}
static void search() {
	
}
static void update() {
	
}
static void max() {
	
}
static void min() {
	
}
Node<T> getStart(){
	return start;
} 
void updateStart(Node<T> newStart){
	start = newStart;
}
 void reverseIterate() {
	if(start==null) {
			System.out.println("List is Empty Can't Reverse");
			return;
	}
	if(start.next==null) {
		System.out.println("List having one node only can't reverse");
		return ;
	}
	Node<T> currentNode = start;
	Node<T> previousNode = null;
	while(currentNode!=null) {
		Node<T> nextNode = currentNode.next;
		currentNode.next = previousNode;
		previousNode = currentNode;
		currentNode = nextNode;
	}
	start = previousNode;
	
}
 Node reverseRecursion(Node<T> currentNode, Node<T> previousNode) {
	if(currentNode==null ) {
		return previousNode;
	}
	Node<T> nextNode = currentNode.next;
	currentNode.next= previousNode;
	return reverseRecursion(nextNode, currentNode);
	
	
}
 void detectAndRemoveLoopInLL(){
	 Node<T> slow = start;
	 Node<T> fast = start;
	 while(fast!=null && fast.next!=null) {
		 slow = slow.next;
		 fast = fast.next.next;
		 if(slow==fast) {
			 break;
		 }
	 }
	 if(slow!=fast) {
		 System.out.println("No Loop Found....");
		 return ;
	 }
	 slow = start;
	 while(slow.next!=fast.next) {
		 slow = slow.next;
		 fast = fast.next.next;
	 }
	 fast.next= null;
		
 }
static void detectLoopInLL(){
	
}
static void floydsalgo(){
	
}
static void swapPair() {
	
}

static void deleteNNodes(int startFrom) {

}
static void arrangeListWithEvenOdd() {
	
}

}
public class LinkedList01 {
public static void main(String[] args) {
	LinkedListOperations<Integer> opr = new LinkedListOperations<>();
	opr.insertAtEnd(new Node<Integer>(100));
	//opr.midPoint();
	opr.insertAtEnd(new Node<Integer>(200));
	opr.insertAtEnd(new Node<Integer>(300));
	opr.insertAtBeg(new Node<Integer>(1000));
	opr.insertAtEnd(new Node<Integer>(400));
	opr.insertAtBeg(new Node<Integer>(2000));
	opr.insertAtMid(new Node<Integer>(999), 2);
	opr.insertAtMid(new Node<Integer>(777), 1);
	
	opr.print();
	
	System.out.println("********************** Delete ********************");
	System.out.println("0 th Index Delete");
	opr.deleteInMid(0);
	opr.print();
	System.out.println("\n\n2nd Index Delete");
	opr.deleteInMid(2);
	opr.print();
	System.out.println("Mid Point ");
	opr.midPoint();
//	System.out.println("After Reverse ");
//	opr.reverseIterate();
//	opr.print();
	System.out.println("Reverse 2");
	opr.updateStart(opr.reverseRecursion(opr.getStart(), null));
	opr.print();
}
	
}
