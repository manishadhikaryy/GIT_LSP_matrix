package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Test examples
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Length of Set1 is: " + set1.length());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());
        System.out.println("Does Set1 contain 2? " + set1.contains(2));
        System.out.println("Is Set1 empty? " + set1.isEmpty());

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("\nValue of Set2 is: " + set2.toString());
        System.out.println("Length of Set2 is: " + set2.length());
        System.out.println("Smallest value in Set2 is: " + set2.smallest());
        System.out.println("Largest value in Set2 is: " + set2.largest());
        System.out.println("Does Set2 contain 4? " + set2.contains(4));
        System.out.println("Is Set2 empty? " + set2.isEmpty());

        // Union of Set1 and Set2
        System.out.println("\nUnion of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Intersection of Set1 and Set2
        System.out.println("\nIntersection of Set1 and Set2");
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString());

        // Difference of Set1 and Set2
        System.out.println("\nDifference of Set1 and Set2");
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2: " + set1.toString());

        // Complement of Set1 with respect to Set2
        System.out.println("\nComplement of Set1 with respect to Set2");
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.complement(set2);
        System.out.println("Result of complement of Set1 with respect to Set2: " + set1.toString());
    }
}
