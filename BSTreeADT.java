/**
 * BSTreeADT
 */


import java.io.*;

/**
 * @author dwatson, kitty
 * @version 1.1
 * Created: Nov 27, 2008
 * Updated: Nov 23, 2019
 *
 * Class Description: Abstract data type specification for a simple
 * Binary Tree implementation.
 * 
 */
public interface BSTreeADT<E> extends Serializable
{
	/**
	 * The node at the root of the Binary Search Tree will be returned.
	 * @return node stored at the root of tree is returned
	 * @throws TreeException if the root is empty.
	 */
	public BSTreeNode<E> getRoot() throws TreeException;
	
	/**
	 * The number of elements currently stored in the tree is counted and
	 * the value is returned.
	 * @return number of elements currently stored in tree.
	 */
	public int size();
	
	/**
	 * Checks if the tree is currently empty.
	 * @return returns boolean true if the tree is empty otherwise false.
	 */
	public boolean isEmpty();
	
	/**
	 * Clears all elements currently stored in tree and makes the tree empty.
	 */
	public void clear();
	
	/**
	 * Checks the current tree to see if the element passed in is stored in
	 * the tree. If the element is found in the tree the method returns true
	 * and if the element is not in the tree the method returns false.
	 * @param entry the element to find in the tree
	 * @return returns boolean true if element is currently in the tree and
	 * false if the element is not found in the tree
	 * @throws TreeException if the tree is empty.
	 */
	public boolean contains(E entry) throws TreeException;
	
	/**
	 * Retrieves a node from the tree given the object to search for.
	 * @param entry element object being searched
	 * @return the node with the element located in tree, null if not found
	 * @throws TreeException if the tree is empty
	 */
	public String search(E entry) throws TreeException;
	
	/**
	 * Adds a new element to the tree according to the natural ordering
	 * established by the Comparable implementation.
	 * @param newEntry the element being added to the tree
	 * @return a boolean true if the element is added successfully else false
	 * @throws NullPointerException if the element being added is null
	 */
	public boolean add(E newEntry) throws NullPointerException;
	
	/**
	 * Generates an in-order iteration over the contents of the tree. Elements
	 * are in their natural order.
	 * @param p 
	 *@return an iterator with the elements in the natural order
	 */
	public void inorderIterator_pl(BSTreeNode<E> p);
	
	/**
	 * Generates a pre-order iteration over the contents of the tree. Elements
	 * are order in such a way as the root element is first.
	 * @param p 
	 *@return an iterator with the elements in a root element first order
	 */
	public void preorderIterator(BSTreeNode<E> p);
	
	/**
	 * Generates a post-order iteration over the contents of the tree. Elements
	 * are order in such a way as the root element is last.
	 * @param p 
	 *@return an iterator with the elements in a root element last order
	 */
	public void postorderIterator(BSTreeNode<E> p);
}
