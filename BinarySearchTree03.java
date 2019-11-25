import java.util.Scanner;

class BST{
	int data;
	BST left;
	BST right;
	BST(int data){
		this.data = data;
	}
}
class BSTOperations{
	BST root;  // root is null
	
	 void insert(int data) {
		 root = insert(root, data);
	    } 
	
	BST insert(BST root, int data) {
		
		if (this.root == null) { 
            this.root = new BST(data); 
            return root; 
        } 
  
       
        if (data < root.data) 
            root.left = insert(root.left, data); 
        else if (data > root.data) 
            root.right = insert(root.right, data); 
  
        
        return root; 
		
}
	void print() {
		inorder(root);
	}
	void inorder(BST root) { 
        if (root != null) { 
            inorder(root.left); 
            System.out.println(root.data); 
            inorder(root.right); 
        } 
    } 
	
	void delete(int key) 
    { 
        root = delete(root, key); 
    } 
  
    
    BST delete(BST root, int data) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recursion down the tree */
        if (data < root.data) 
            root.left = delete(root.left, data); 
        else if (data > root.data) 
            root.right = delete(root.right, data); 
  
        // if data is same as root's data, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.data = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = delete(root.right, root.data); 
        } 
  
        return root; 
    } 
  
    int minValue(BST root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    } 
     BST search(BST root, int data) 
    { 
        // Base Cases: root is null or data is present at root 
        if (root==null || root.data==data) 
            return root; 
      
        // val is greater than root's key 
        if (root.data > data) 
            return search(root.left, data); 
      
        // val is less than root's key 
        return search(root.right, data); 
    } 
     /*This function is used to find floor of a data*/
      int floor(BST root, int data) 
     { 
         if (root == null) 
             return Integer.MAX_VALUE; 
   
         /* If root->data is equal to data */
         if (root.data == data) 
             return root.data; 
   
         /* If root->data is greater than the key */
         if (root.data > data) 
             return floor(root.left, data); 
   
         /* Else, the floor may lie in right subtree  
     or may be equal to the root*/
         int floorValue = floor(root.right, data); 
         return (floorValue <= data) ? floorValue : root.data; 
     } 
      int Ceil(BST node, int input)  
      {  
    
          // Base case  
          if (node == null) {  
              return -1;  
          }  
    
          // We found equal key  
          if (node.data == input) {  
              return node.data;  
          }  
    
          // If root's key is smaller,  
          // ceil must be in right subtree  
          if (node.data < input) {  
              return Ceil(node.right, input);  
          }  
    
          // Else, either left subtree or root 
          // has the ceil value  
          int ceil = Ceil(node.left, input);  
            
          return (ceil >= input) ? ceil : node.data;  
      }  
}
public class BinarySearchTree03 {

	public static void main(String[] args) {
		
		BSTOperations obj = new BSTOperations();
		obj.insert(50); 
        obj.insert(30); 
        obj.insert(20); 
        obj.insert(40); 
        obj.insert(70); 
        obj.insert(60); 
        obj.insert(80);
        obj.print();

	}

}
