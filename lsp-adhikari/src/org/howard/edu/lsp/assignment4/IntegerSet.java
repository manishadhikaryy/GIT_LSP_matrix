package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;


// Name: Manish Adhikari


public class IntegerSet {
	
	// Store the set elements in an arraylist
	private List<Integer> set = new ArrayList<Integer>();
	
	// Default Constructor
	public IntegerSet() {
		
	}
	
	// Constructor if you want to pass in already initialized set
	
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
		
	}
	
	// clear internal representation of the set
	public void clear() {
		set.clear();
	}
	
	// returns length of the set
	public int length() {
		return set.size();
	}
	
	/*
  	* Returns true if the 2 sets are equal, false otherwise;
  	* Two sets are equal if they contain all of the same values in ANY order.  This overrides
  	* the equal method from the Object class.
  	*/
    
	public boolean equals(Object o) {
		if (!(o instanceof IntegerSet)) {
			return false;
		}
		IntegerSet otherSet = (IntegerSet) o;
		return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
		
	}
	
	// returns true if the set contains the value otherwise false
	public boolean contains(int value) {
		return set.contains(value);		
		
	}
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty
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
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
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
	
	// Adds an item to the set or does nothing it already there 
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
		
	}
	
	// Set union
	public void union (IntegerSet intSetb){
		for (int num: intSetb.set) {
			this.add(num);
		}
		
	}

	
	// Set intersection
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	
	// Set Difference
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
	// Set Complement
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<Integer>();
		for (int i = 0; i < intSetb.set.size(); i++) {
			if (!set.contains(intSetb.set.get(i))) {
				complementSet.add(intSetb.set.get(i));
			}
			
		}
		set = complementSet; 
		
	}
	
	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	// Return String representation of your set.  This overrides the equal method from
	// the Object class.
	public String toString() {
		return set.toString();
	}
	
	// IntegerSetException class
	static class IntegerSetException extends RuntimeException {
		public IntegerSetException(String message ) {
			super(message);
		}
	}

}
