/*
 * Example DoublePair: a class that holds a pair of double values
 *
 * Jim Teresco, The College of Saint Rose, CSC 523, Summer 2014
 * Updated for CSIS 210, Siena College, Fall 2016
 */

public class DoublePair {

    // we'll need, of course, two double values as instance variables
    private double first, second;

    // our constructor for a new DoublePair
    public DoublePair(double first, double second) {

        this.first = first;
        this.second = second;
    }

    // accessors
    public double getFirst() {

        return first;
    }

    public double getSecond() {

        return second;
    }

    // mutators, including ones to set first, second, or both
    public void setFirst(double newFirst) {

        first = newFirst;
    }

    public void setSecond(double newSecond) {

        second = newSecond;
    }

    public void setValues(double newFirst, double newSecond) {

        first = newFirst;
        second = newSecond;
    }

    // we should have a toString method - in this case, we'll return
    // a String to make this look like a coordinate pair, seems as
    // good as anything and likely to be useful in many contexts.
    public String toString() {

        return "(" + first + ", " + second + ")";
    }

    // it's also good to define an equals method for any general purpose
    // class -- in this case, we'll say a DoublePair is equal to another
    // only if first and second are both precisely equal
    public boolean equals(Object o) {

        DoublePair other = (DoublePair)o;
        return (other.first == first) && (other.second == second);
    }

    // a common way to test a class is to include a main method
    // in the class that tests its methods.  So let's.  However,
    // it's also possible to move this main into some other class
    // if we prefer.
    public static void main(String args[]) {

        // we'll create a few DoublePair objects and print them out
        DoublePair a = new DoublePair(4.3, 9.1);
        DoublePair b = new DoublePair(0, 0);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        // try out the accessors
        System.out.println("a.getFirst(): " + a.getFirst());
        System.out.println("a.getSecond(): " + a.getSecond());
        System.out.println("b.getFirst(): " + b.getFirst());
        System.out.println("b.getSecond(): " + b.getSecond());
        
        // are they equal?
        System.out.println("a.equals(b): " + a.equals(b));
        
        // mutators!
        a.setFirst(17.0);
        a.setSecond(-23.5);
        b.setValues(17.0, -23.5);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        // are they equal now?  Hope so!
        System.out.println("a.equals(b): " + a.equals(b));
        
        // uncomment the following to see what happens if we send
        // the wrong type of object to the equals method
        //System.out.println("a.equals(\"hi there\"): " + a.equals("high there"));
        
    }
}
