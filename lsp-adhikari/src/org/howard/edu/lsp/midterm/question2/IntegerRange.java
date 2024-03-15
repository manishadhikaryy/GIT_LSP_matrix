package org.howard.edu.lsp.midterm.question2;

/**
 * Implementation of the Range interface for integer ranges.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;
    
    /**
     * Constructs a new IntegerRange with default lower and upper bounds.
     */
    public IntegerRange() {
        
    }
    
    /**
     * Constructs a new IntegerRange with the specified lower and upper bounds.
     *
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    
    /**
     * Checks if the range contains the given value.
     *
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= this.lowerBound && value <= this.upperBound;
    }
    
    /**
     * Sets the upper bound of the range.
     *
     * @param upperBound the upper bound to set
     */
    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }
    
    /**
     * Sets the lower bound of the range.
     *
     * @param lowerBound the lower bound to set
     */
    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }
    
    
    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if there is an overlap, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        if (other instanceof IntegerRange) {
            IntegerRange otherRange = (IntegerRange) other;
            return !(this.upperBound < otherRange.lowerBound || this.lowerBound > otherRange.upperBound);
        } else {
            // Handle overlap comparison for other types of ranges
            // For now, return false if the type of the other range is not known
            return false;
        }
    }
    
    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
    @Override
    public int size() {
        return this.upperBound - this.lowerBound + 1;
    }
    
    /**
     * Compares this IntegerRange with the specified object for equality.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}
