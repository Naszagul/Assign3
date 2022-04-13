public class BSTreeNode<String> {
    public String element;
    public BSTreeNode<String> left, right;

    public BSTreeNode(String elem, BSTreeNode<String> left, BSTreeNode<String> right){
        this.element = elem; 
        this.left = left;		
        this.right = right;
    }
    public boolean hasLeft(){
        return this.left!=null;
    }
    public boolean hasRight(){
        return this.right!=null;
    }
    public boolean isLeaf(){
        return this.right==null && this.right==null;
    }
}
