package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers and provides methods to perform various operations on it.
 * 
 * @author Manish Adhikari
 */
public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Constructs an empty IntegerSet.
	 */
	public IntegerSet() {
		
	}
	
	/**
	 * Constructs an IntegerSet with the provided ArrayList of integers.
	 * 
	 * @param set An ArrayList of integers to initialize the IntegerSet with.
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	/**
	 * Removes all elements from the set.
	 */
	public void clear() {
		set.clear();
	}
	
	/**
	 * Returns the number of elements in the set.
	 * 
	 * @return The number of elements in the set.
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Checks if this IntegerSet is equal to another object.
	 * 
	 * @param o The object to compare with.
	 * @return True if the two sets are equal, false otherwise.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof IntegerSet)) {
			return false;
		}
		IntegerSet otherSet = (IntegerSet) o;
		return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
	}
	
	/**
	 * Checks if the set contains a specified value.
	 * 
	 * @param value The value to check for.
	 * @return True if the set contains the value, false otherwise.
	 */
	public boolean contains(int value) {
		return set.contains(value);		
	}
	
	/**
	 * Returns the largest integer in the set.
	 * 
	 * @return The largest integer in the set.
	 * @throws IntegerSetException If the set is empty.
	 */
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is empty");
		}
		
		int largest = set.get(0);
		for (int num:set) {
			if (num > largest) {
				largest = num;
			}
		}
		return largest; 
	}
	
	/**
	 * Returns the smallest integer in the set.
	 * 
	 * @return The smallest integer in the set.
	 * @throws IntegerSetException If the set is empty.
	 */
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is empty");
		}
		
		int smallest = set.get(0);
		for (int num:set) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest; 
	}
	
	/**
	 * Adds an integer to the set if it is not already present.
	 * 
	 * @param item The integer to add.
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * Removes an integer from the set if it is present.
	 * 
	 * @param item The integer to remove.
	 */
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}
	
	/**
	 * Performs the union operation with another IntegerSet.
	 * 
	 * @param intSetb The IntegerSet to perform the union with.
	 */
	public void union (IntegerSet intSetb){
		for (int num: intSetb.set) {
			this.add(num);
		}
	}
	
	/**
	 * Performs the intersection operation with another IntegerSet.
	 * 
	 * @param intSetb The IntegerSet to perform the intersection with.
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	
	/**
	 * Performs the set difference operation with another IntegerSet.
	 * 
	 * @param intSetb The IntegerSet to perform the set difference with.
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
	/**
	 * Computes the complement of the set with respect to another IntegerSet.
	 * 
	 * @param intSetb The IntegerSet to compute the complement with.
	 */
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<Integer>();
		for (int i = 0; i < intSetb.set.size(); i++) {
			if (!set.contains(intSetb.set.get(i))) {
				complementSet.add(intSetb.set.get(i));
			}
		}
		set = complementSet; 
	}
	
	/**
	 * Checks if the set is empty.
	 * 
	 * @return True if the set is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
	 /**
     * Returns the string representation of the set.
     *
     * @return The string representation of the set.
     */
	@Override
	public String toString() {
		return set.toString();
	}
	
//	/**
//	 * Exception class for IntegerSet operations.
//	 */
//	public static class IntegerSetException extends RuntimeException {
//		public IntegerSetException(String message ) {
//			super(message);
//		}
//	}
}
