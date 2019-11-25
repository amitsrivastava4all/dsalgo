import java.util.Scanner;
import java.lang.Integer;
class BinaryTree<T>{
	T data;
	BinaryTree<T> left ;
	BinaryTree<T> right ;
	BinaryTree(T data){
		this.data = data;
		right = left = null;
	}
	
}
class BinaryTreeOperations{
	String msg = "root";
	BinaryTree<Integer> insert() {
			
			System.out.println("Enter the "+msg+" Data");
			int data = new Scanner(System.in).nextInt();
			if(data==-1) {
				return null;
			}
			
			BinaryTree<Integer> node = new BinaryTree<>(data);
			msg  = "left";
			node.left=insert();
			msg = "right";
			node.right=insert();
			msg = "root";
			return node;
			
	}
	void print(BinaryTree<Integer> root) {
		if(root==null) {
			return ;
		}
		String output = "";
		output += root.data+" => ";
		if(root.left!=null) {
			output+="L: "+root.left.data+" , ";
		}
		if(root.right!=null) {
			output+="R: "+root.right.data+" , ";
		}
		System.out.println(output);
		print(root.left);
		print(root.right);
	}
	int countNodes(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		int counter = 1;
		counter+=countNodes(root.left);
		counter+=countNodes(root.right);
		return counter;
		
	}
	int diameterOfTree(BinaryTree<Integer> root) {
		
		// left + right = diameter
		// or max of left or right
		
		if(root == null) {
			return 0;
		}
		int sumOfLeftAndRight = height(root.left) + height(root.right);
		int leftSideHeightTree = diameterOfTree(root.left);
		int rightSideHeightTree = diameterOfTree(root.right);
		return Math.max(sumOfLeftAndRight, Math.max(leftSideHeightTree, rightSideHeightTree));
		
	}
	int height(BinaryTree<Integer> root) {
		if(root ==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight,rightHeight);
	}
	public void preOrder(BinaryTree<Integer> root) {
		// Root , Left, Right
		if(root == null) {
			return ;
		}
		System.out.println(root.data);
		preOrder(root.left);
		
		preOrder(root.right);
		
	}
	public void postOrder(BinaryTree<Integer> root) {
		// Left , Right , Root
		if(root == null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
		
		
		
	}
	public void inOrder(BinaryTree<Integer> root) {
		// Left , Root , Right
		if(root == null) {
			return ;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
}
public class BinaryTree02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperations bt = new BinaryTreeOperations();
		BinaryTree<Integer> root = bt.insert();
		bt.print(root);
		System.out.println("Total No of Nodes "+bt.countNodes(root));

	}

}
