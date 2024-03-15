package org.howard.edu.lsp.midterm.question2;

/**
 * A class to test the functionality of the IntegerRange class.
 */
public class RangeTester {
    
    /**
     * Main method to test the functionality of the IntegerRange class.
     * Creates two integer ranges, performs various tests on them, and prints the results.
     * 
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create two integer ranges
        IntegerRange range1 = new IntegerRange(1, 5);
        IntegerRange range2 = new IntegerRange(3, 7);

        // Test contains method
        System.out.println("range1 contains 3: " + range1.contains(3)); 
        System.out.println("range2 contains 8: " + range2.contains(8)); 

        // Test overlaps method
        System.out.println("range1 overlaps with range2: " + range1.overlaps(range2)); 

        // Test size method
        System.out.println("Size of range1: " + range1.size());

        // Test equals method
        IntegerRange range3 = new IntegerRange(1, 5);
        System.out.println("range1 equals range3: " + range1.equals(range3)); 
    }
}
