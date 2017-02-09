package seance3;

import java.lang.Math;
/** 
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */

public class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double max; // Max of the entered data
    private double min;

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    
    
    public StatCalc (double n)
    {
    	count = 1;
    	sum = n;
    	squareSum = n*n;
    	max = n;
    	min = n;
    }
    
    
    
    public void enter(double num) 
    {
        count++;
        sum += num;
        squareSum += num*num;
        updateMax(num);
        updateMin(num);
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;  
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() 
    {  
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }
    
    
    /**
     * Return the max of the entered data.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMax()
    {
    	return this.max;
    }
    
    public double getMin()
    {
    	return this.min;
    }
    
    private void updateMax(double n)
    {
    	max = Math.max(n, max);
    }
    
    private void updateMin(double n)
    {
    	min = Math.min(n, min);
    }
    
    public void print()
    {
    	System.out.println("Count "+count);
    	System.out.println("Sum "+sum);
    	System.out.println("Squaresum "+squareSum);
    	System.out.println("Max "+max);
    	System.out.println("Min "+min);
    	System.out.println("Standar Deviation "+getStandardDeviation());
    }
    
}  // end class StatCalc
