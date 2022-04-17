
public class BSTree<E> implements BSTreeADT<E>{
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

    @Override
    public BSTreeNode<E> getRoot() throws TreeException {
        return this.root;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void clear() {
        this.root=null;
    }

    @Override
    public boolean contains(E entry) throws TreeException {
        return search(entry)!=null;
    }
    
    @Override
    public String[] search(E entry) throws TreeException {
        // return null if not found.
        BSTreeNode<E> current = root;
        
        while(current!=null){
            String[] value = String.valueOf(current.element).split(",");
            if(value[0].equals(entry)){
                return value;
            }else if(compareStrings(entry, (E)current.element) < 0){
                current = current.left;
            }else{
                current = current.right;
            }  
        }
        return null;
    }
    
    @Override
    public boolean add(E entry) throws NullPointerException {
        BSTreeNode<E> node = new BSTreeNode<E>((E)entry, null, null);
        if(this.root==null){
            this.root = node;
            this.size++;
            return true;
        }

        BSTreeNode<E> current = this.root;
        BSTreeNode<E> parent = null;
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
            
            str1_ch = str1_ch < 91 ? str1_ch+32 : str1_ch;
            str2_ch = str2_ch < 91 ? str2_ch+32 : str2_ch;
            
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

    // @Override
	public BSTreeNode<E> inorderIterator(BSTreeNode<E> p) {
        if (p!=null) {
            inorderIterator(p.getLeft()); 		//L
            System.out.println(p.element); 				//V
            inorderIterator(p.getRight()); 	//R
        } return null; 
    }
    
    // @Override
    public BSTreeNode<E> preorderIterator(BSTreeNode<E> p) {
        if (p!=null) {
           System.out.println(p.element);				//V
            preorderIterator(p.getLeft());		//L
            preorderIterator(p.getRight());	//R
        } return null; 
    }

    // @Override
	public BSTreeNode<E> postorderIterator(BSTreeNode<E> p) {
        if (p!=null) {
            postorderIterator(p.getLeft()); 	//L
            postorderIterator(p.getRight()); 	//R
           System.out.println(p.element); 			//V
        } return null; 
    }
}