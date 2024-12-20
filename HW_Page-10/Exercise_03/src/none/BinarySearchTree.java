package none;

public class BinarySearchTree {
	public BinarySearchTree left;
	public BinarySearchTree right;
	public int value;
	
	public BinarySearchTree(int value) {
		this.value=value;
		
		left= null;
		right= null;
	}
	
	public void addElement(int newValue) {
		if(newValue > this.value) {
			if(right!=null) {
				right.addElement(newValue);
			}else {
				right=new BinarySearchTree(newValue);
			}
		}else {
			if(left!=null) {
				left.addElement(newValue);
			}else {
				left=new BinarySearchTree(newValue);
			}
			
		}
	}
	
	public void printNodes(BinarySearchTree root) {
		if(this.left!=null) {
			root.left.printNodes(left);
		}
		
			System.out.print(root.value+",");
			
		if(this.right!=null) {
			root.right.printNodes(right);
		}
		
	}
}
