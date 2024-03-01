package org.howard.edu.assignment4;
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
	
	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
		
	}
	
	public void union (IntegerSet intSetb){
		for (int num: intSetb.set) {
			this.add(num);
		}
		
	}

	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}
	
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<Integer>();
		for (int i = 0; i < intSetb.set.size(); i++) {
			if (!set.contains(intSetb.set.get(i))) {
				complementSet.add(intSetb.set.get(i));
			}
			
		}
		set = complementSet; 
		
	}
	
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	public String toString() {
		return set.toString();
	}
	
	static class IntegerSetException extends RuntimeException {
		public IntegerSetException(String message ) {
			super(message);
		}
	}
	
	
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("\nValue of Set2 is: " + set2.toString());

        // Union of Set1 and Set2
        System.out.println("\nUnion of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());
    }

}
