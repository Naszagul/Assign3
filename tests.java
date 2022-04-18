import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.OutputStream;

import sun.reflect.generics.tree.Tree;

/**
 * 
 */

/**
 * @author Regan Preston, Matthew Lipsius
 *
 */
class tests {	

	@Test
	void testSize() {
		BSTree tree = new BSTree();
		
		int expected = 0;
		int actual = tree.size();
		
		assertEquals(expected, actual);
		
		tree.add("1");
		tree.add("2");
		tree.add("3");
		
		expected = 3;
		actual = tree.size();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIsEmpty() {
		BSTree tree = new BSTree();
		
		assertTrue(tree.isEmpty());
		
		tree.add("1");
		tree.add("2");
		tree.add("3");
		
		assertFalse(tree.isEmpty());
	}
	
	@Test
	void testClear() {
		BSTree tree = new BSTree();
		
		tree.add("1");
		tree.add("2");
		tree.add("3");
		
		assertFalse(tree.isEmpty());
		
		tree.clear();
		
		assertTrue(tree.isEmpty());
	}
	
	@Test
	void testAdd() throws TreeException {
		BSTree tree = new BSTree();
		
		assertFalse(tree.contains("1"));
		
		tree.add("3");
		tree.add("2");
		tree.add("1");
		
		assertTrue(tree.contains("1"));
		assertTrue(tree.contains("3"));
		assertFalse(tree.contains("10"));
	}
	
	@Test
	void testContains() throws TreeException {
		BSTree tree = new BSTree();
		
		assertFalse(tree.contains("1"));
		
		tree.add("1");
		tree.add("2");
		tree.add("3");
		
		assertTrue(tree.contains("1"));
		assertTrue(tree.contains("3"));
		assertFalse(tree.contains("10"));
	}
	
	@Test
	void testSearch() throws TreeException {
		BSTree tree = new BSTree();
		
		String expected = null;
		String actual = tree.search("1");

		assertEquals(actual, expected);
		
		tree.add("1");
		tree.add("2");
		tree.add("3");
		
		expected = "1";
		actual = tree.search("1");
		
		assertEquals(actual, expected);
		
		expected = "3";
		actual = tree.search("3");
		
		assertEquals(actual, expected);
		
		expected = null;
		actual = tree.search("23");
		
		assertEquals(actual, expected);
	}
	
	@Test
	void testGetRoot() throws TreeException {
		BSTree tree = new BSTree();
		
		String expected = null;
		Object actual = tree.getRoot();
		
		assertEquals(actual, expected);
		
		tree = new BSTree("1");
		
		expected = "1";
		actual = (String) tree.getRoot().element;
		
		assertEquals(actual, expected);
	}
	
	@Test
	void testIterators() throws TreeException{
		BSTree tree = new BSTree();
		tree.add("1");
		tree.add("2");
		tree.add("3");
		
		tree.inorderIterator_pf(tree.getRoot());
		tree.inorderIterator_pl(tree.getRoot());
		tree.preorderIterator(tree.getRoot());
		tree.postorderIterator(tree.getRoot());
	}
}
