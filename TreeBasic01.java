import java.util.ArrayList;
import java.util.Scanner;



class TreeNode<T>{
	T data;
	ArrayList<TreeNode<T>> childrens;
	TreeNode(T data){
		this.data = data;
		childrens = new ArrayList<>();
	}
}
class TreeOperations<T>{
	
	// Depth Wise Input
	public TreeNode<Integer> addSubTree() {
		TreeNode<Integer> root = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the data of Node");
		int data = scanner.nextInt();
		root = new TreeNode<>(data);
		System.out.println("Enter the Root "+data+"  Number of Childrens ");
		int childs = scanner.nextInt();
		for(int i = 1; i<=childs; i++) {
			TreeNode<Integer> childNode = addSubTree();
			root.childrens.add(childNode);
			
		}
		
		
		return root;
	}
	
	
	
	public void printTree(TreeNode<T> root) {
		String str = root.data+ "=>";
		for(int i = 0; i<root.childrens.size(); i++) {
			str += root.childrens.get(i).data+" , ";
		}
		System.out.println(str);
		for(int i = 0; i<root.childrens.size(); i++) {
			printTree(root.childrens.get(i));
		}
		
		
	}
	
	public int countNumberOfNode(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count = 1;
		for(int i = 0; i<root.childrens.size(); i++) {
			count+= countNumberOfNode(root.childrens.get(i));
		}
		return count;
	}
	
	public int findLargestNodeInTree(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int result = root.data;
		for(int i = 0; i<root.childrens.size(); i++) {
			int childLargest = findLargestNodeInTree(root.childrens.get(i));
			if(childLargest>result) {
				result = childLargest;
			}
		}
		return result;
	}
	int findHeight(TreeNode<Integer> root) 
    { 
		if (root == null) {
	        return 0;
	    }

	    if (root.childrens.size() == 0) {
	        return 1;
	    }

	    int maxDepth = 0;

	    for (int i = 0; i < root.childrens.size(); i++) {
	        maxDepth = Math.max(maxDepth, findHeight(root.childrens.get(i)));
	    }

	    return maxDepth + 1;
    } 
	
	public void depthOfNode(TreeNode<Integer> root, int k) {
		if(k<0) {
			return ;
		}
		if(k==0) {
			System.out.println(root.data);
			return ;
		}
		for(int i = 0; i<root.childrens.size(); i++) {
			depthOfNode(root.childrens.get(i), k-1);
		}
	}
	public int countNumberOfLeafNodes(TreeNode<Integer> root) {
		 int leaves = 0;
	        if(root==null)
	        {
	            return 0;
	        }
	        if(root.childrens.size()==0)
	        {
	            return 1;
	        }

	        for(int i = 0; i < root.childrens.size(); i++) 
	        {
	            leaves += countNumberOfLeafNodes(root.childrens.get(i));
	        }

	        return leaves;
	}
	public void preOrder(TreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		System.out.println(root.data);
		for(int i = 0; i<root.childrens.size(); i++) {
			preOrder(root.childrens.get(i));
		}
	}
	public void postOrder(TreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		
		for(int i = 0; i<root.childrens.size(); i++) {
			postOrder(root.childrens.get(i));
			System.out.println(root.data);
		}
	}
      
}
public class TreeBasic01 {

	public static void main(String[] args) {
		TreeOperations<Integer> tp = new TreeOperations<>();
		TreeNode<Integer> root = tp.addSubTree();
		tp.printTree(root);
		System.out.println("Count No of Nodes "+tp.countNumberOfNode(root));
		int result = tp.findLargestNodeInTree(root);
		System.out.println("Largest "+result);
		System.out.println("Height of Tree "+tp.findHeight(root));
		System.out.println("Count No of Leafs "+tp.countNumberOfLeafNodes(root));
		

	}

}
