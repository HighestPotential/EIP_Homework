package none;

public class BinarySearchTreeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst= new BinarySearchTree(45);
		
		bst.addElement(13);
		bst.addElement(9);
		bst.addElement(26);
		bst.addElement(100);
		bst.addElement(94);
		bst.addElement(63);
		bst.addElement(102);
		
		bst.printNodes(bst);

	}

}
