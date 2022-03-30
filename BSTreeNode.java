public class BSTreeNode<E> {
    public E element;
    public BSTreeNode<E> left, right;

    public BSTreeNode(E elem, BSTreeNode<E> left, BSTreeNode<E> right){
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
