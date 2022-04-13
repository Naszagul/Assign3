public class BSTreeNode<E> {
    public E element;
    public BSTreeNode<String> left, right;

    public BSTreeNode(E element, BSTreeNode<String> left, BSTreeNode<String> right){
        this.element = element; 
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
