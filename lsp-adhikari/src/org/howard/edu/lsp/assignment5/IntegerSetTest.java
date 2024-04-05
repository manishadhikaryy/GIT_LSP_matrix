package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.*;
import org.howard.edu.lsp.assignment5.IntegerSetException;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/** 
 * Manish Adhikari
 * @author Manish
 * **/

/**
 * {@summary Responsible for the implementation of test cases of the IntegerSet}
 * Class IntegerSet
 * @author Manish Adhikari
 */
public class IntegerSetTest {
	IntegerSet set1;
	IntegerSet set2;
	
	/**
	 * {@summary a method that sets up the variables for each of the test cases}
	 * @throws Exception
	 * @return void
	 */
	@Before
	public void setUp() throws Exception {
		set1 = new IntegerSet();
		set2 = new IntegerSet();
	}
	
	/**
	 * {@summary a method that resets the variables for each of the test cases}
	 * @throws Exception
	 * @return void
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * {@summary a method to check the clear method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		set1.add(4);
		set1.add(7);
		set1.add(9);
		
		set1.clear();
		
		IntegerSet set3 = new IntegerSet();
		
		assertTrue("when we check the clear of [4,7,9], the result should be []", set1.equals(set2));
		
		set2.clear();
		
		assertTrue("when we clear [], the result should be []", set2.equals(set3));
		
		set2.add(1);
		set2.add(5);
		set2.clear();
		assertTrue("when we clear [1, 5], the result should be []", set2.equals(set3));
	}
	
	/**
	 * {@summary a method to test for the length method of IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		assertEquals("when we check the length of [], the value is 0", set1.length(), 0);
		
		set1.add(1);
		set1.add(5);
		set1.add(2);
		assertEquals("when we check the length of [1, 5, 2], the value is 3", set1.length(), 3);
	}
	
	/**
	 * {@summary a method that checks the equals method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		set1.add(5);
		set1.add(7);
		set1.add(9);
		
		assertFalse("when we check if [5,7,9] is equal to [], the result is False", set1.equals(set2));
		
		set2.add(5);
		set2.add(7);
		set2.add(9);
		
		assertTrue("when we check if [5,7,9] is equal to [5,7,9], the result is True", set1.equals(set2));
	}
	
	/**
	 * {@summary a method that checks the contains method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		set1.add(1);
		set1.add(2);
		
		assertTrue("when we check if 2 is contained in [1,2], then the value is True", set1.contains(2));
		assertFalse("when we check if 3 is contained in [1,2], then the value is False", set1.contains(3));
	}

	/**
	 * {@summary a method that checks the largest method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		set1.add(7);
		set1.add(5);
		set1.add(1);
		assertEquals("the largest value in the set [7,5,1] is 7", 7, set1.largest());
		
		assertThrows("when we look for the largest value from the [], it should raise exception", IntegerSetException.class,
				() -> {
					set2.largest();
				}
				);
	}
	
	/**
	 * {@summary a method that checks the smallest method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		assertEquals("the smallest value in the set [1,2,3] is 1", 1, set1.smallest());
		
		assertThrows("when we look for the smallest value from the [], it should raise exception", IntegerSetException.class ,
				() -> {
					set2.smallest();
				}
				);
	}
	
	/**
	 * {@summary a method that checks the add method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		set1.add(1);
		
		assertEquals("when 1 is added to the set, the set should be [1]", set1.toString(), "[1]");
		
		
		set2.add(2);
		assertEquals("when 2 is added to the set, the set should be [2]", set2.toString(), "[2]");
	}
	
	/**
	 * {@summary a method that checks the remove method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		set1.add(5);
		set1.add(6);
		
		set2.add(5);
		
		set1.remove(6);
		
		assertTrue("when 6 is removed from [5,6] the result should be [5]", set2.equals(set1));
		
		IntegerSet set3 = new IntegerSet();
		
		set2.remove(5);
		
		assertTrue("when 5 is removed from [5], set is equal to []", set2.equals(set3));
	}
	
	/**
	 * {@summary a method that checks the union method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		set1.add(5);
		set1.add(6);
		
		set2.add(7);
		set2.add(8);
		
		set1.union(set2);
		
		IntegerSet set3 = new IntegerSet();
		
		set3.add(5);
		set3.add(6);
		set3.add(7);
		set3.add(8);
		
		assertTrue("the union of the [5,6] and [7,8] is [5, 6, 7, 8]", set1.equals(set3));
		
		set1.clear();
		set2.clear();
		set3.clear();
		
		set1.add(1);
		set2.add(2);
		set3.add(1);
		set3.add(2);
		
		set1.union(set2);
		
		assertTrue("the union of [1] and [2] is [1, 2]", set1.equals(set3));
	}
	
	/**
	 * {@summary a method that checks the intersect method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		set1.add(1);
		set1.add(2);
		
		set2.add(1);
		set2.add(2);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		
		set1.intersect(set2);
		
		assertTrue("the intersection of [1,2] and [1,2] is [1,2] ", set1.equals(set2));
		
		set3.intersect(set1);
		
		set2.clear();
		set2.add(1);
		
		assertTrue("the intersection of [1] and [1,2] is [1]", set3.equals(set2));
		
		
	}
	
	/**
	 * {@summary a method that checks the diff method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for diff")
	public void testDiff() {
		set1.add(1);
		set1.add(2);
		
		set2.add(1);
		
		set1.diff(set2);
		
		IntegerSet set3 = new IntegerSet();
		set3.add(2);
		
		assertTrue("the diff of [1,2] - [1] should get us [2]",set1.equals(set3));
		
		set1.add(3);
		set2.add(3);
		
		set2.diff(set1);
		set3.clear();
		set3.add(1);
		assertTrue("the diff of [1,3] - [2, 3] should give us [1]", set2.equals(set3));
		
	}
	
	/**
	 * {@summary a method that checks the isEmpty method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		assertTrue("result of isEmpty for the set1 with value [] should be True", set1.isEmpty());
		
		set1.add(1);
		
		assertFalse("result of isEmpty for the set1 with value [1] should be False", set1.isEmpty());
	}
	
	/**
	 * {@summary a method that checks the toString method of the IntegerSet}
	 * @return void
	 */
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		assertEquals("result of toString for empty set should be []", "[]", set1.toString());
		set1.add(1);
		assertEquals("when 1 is added to the set, the toString should return [1]", "[1]", set1.toString());
		
		set2.add(2);
		
		assertEquals("when values 2 is the set [], the toString should return [2]", "[2]" , set2.toString());
		
	}

}