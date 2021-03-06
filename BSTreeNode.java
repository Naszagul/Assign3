import javax.lang.model.element.Element;

public class BSTreeNode<E> {
    public E element;
    public BSTreeNode<E> left, right;

    public BSTreeNode(E element, BSTreeNode<E> left, BSTreeNode<E> right){
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
    public BSTreeNode<E> getLeft(){
        return this.left;
    }
    public BSTreeNode<E> getRight(){
        return this.right;
    }
    public BSTreeNode<E> visit(){
        return this;
    }
}
