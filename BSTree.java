
public class BSTree<E> {
    private BSTreeNode<E> root;
    private int height;
    private int size;

    public BSTree(){
        this.root=null;
        this.height=0;
        this.size=0;
    }
    public BSTree(E element){
        this.root= new BSTreeNode<E>(element, null, null);
        this.height=1;
        this.size=1;
    }

    
    public BSTreeNode getRoot() throws TreeException {
        return this.root;
    }

    
    public int getHeight() {
        return this.height;
    }

    
    public int size() {
        return this.size;
    }

    
    public boolean isEmpty() {
        return size()==0;
    }

    
    public void clear() {
        this.root=null;
    }


    public boolean contains(E entry) throws TreeException {
        return search(entry)!=null;
    }
    

    
    public BSTreeNode search(E entry) throws TreeException {
        // return null if not found.
        BSTreeNode current = root;
        while(current!=null){
            if(current.element.equals(entry)){
                return current;
            }else if(compareStrings(entry, (E)current.element) < 0){
                current = current.left;
            }else{
                current = current.right;
            }  
        }
        return null;
    }
    
    

   
    public boolean add(E entry) throws NullPointerException {
        BSTreeNode node = new BSTreeNode<E>((E)entry, null, null);
        if(this.root==null){
            this.root = node;
            this.size++;
            return true;
        }

        BSTreeNode current = this.root;
        BSTreeNode parent = null;
        while(true){
            parent=current;
        
            if(compareStrings(entry, (E)current.element) < 0 ){
                current=current.left;
                if(current==null){
                    parent.left=node;
                    this.size++;
                    return true;
                }  
            }
            else{
                current = current.right;
            }if(current==null){
                parent.right=node;
                this.size++;
                return true;
            }
        }
    }

    //https://www.geeksforgeeks.org/java-program-to-convert-object-to-string/
    public int compareStrings(E entry, E str2){
        
        int l1 = ((java.lang.String) entry).length();
        int l2 = ((java.lang.String) str2).length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)((java.lang.String) entry).charAt(i);
            int str2_ch = (int)((java.lang.String) str2).charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        }
  
        else {
            return 0;
        }
    }
    
    
    public Iterator inorderIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Iterator preorderIterator() {
        // TODO Auto-generated method stub
        return null;
    }

   
    public Iterator postorderIterator() {
        // TODO Auto-generated method stub
        return null;
    }

}