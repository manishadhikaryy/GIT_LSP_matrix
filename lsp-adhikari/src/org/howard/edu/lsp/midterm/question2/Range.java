package org.howard.edu.lsp.midterm.question2;

/**
 * Interface representing a range of integers.
 */
public interface Range {
    /**
     * Checks if the given value is within the range.
     *
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    boolean contains(int value);

    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
    int size();
}