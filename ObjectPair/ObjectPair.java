/*
 * Example ObjectPair: a general purpose class that contains two
 * items of any Object type.
 *
 * Jim Teresco, The College of Saint Rose, CSC 523, Summer 2014
 * Siena College, CSIS 210, Fall 2016, Fall 2017
 *
 */

public class ObjectPair {
    
    // our instance variables will be Objects, capable of holding
    // anything other than an unboxed primitive type
    private Object first, second;

    // our constructor for a new ObjectPair
    public ObjectPair(Object first, Object second) {

        this.first = first;
        this.second = second;
    }

    // accessors
    public Object getFirst() {

        return first;
    }

    public Object getSecond() {

        return second;
    }

    // mutators, including ones to set first, second, or both
    public void setFirst(Object newFirst) {

        first = newFirst;
    }

    public void setSecond(Object newSecond) {

        second = newSecond;
    }

    public void setValues(Object newFirst, Object newSecond) {

        first = newFirst;
        second = newSecond;
    }

    // we should have a toString method - in this case, we'll return
    // a String to make this look like a coordinate pair, seems as
    // good as anything and likely to be useful in many contexts.
    // note that we are implcitly using the toString methods of the
    // objects we encapsulate
    public String toString() {

        return "(" + first + ", " + second + ")";
    }

    // it's also good to define an equals method for any general purpose
    // class -- in this case, we'll say a ObjectPair is equal to another
    // only if first and second are equal according to their own equals
    // methods
    public boolean equals(Object o) {

        ObjectPair other = (ObjectPair)o;
        return other.first.equals(first) && other.second.equals(second);
    }

    // a common way to test a class is to include a main method
    // in the class that tests its methods.  So let's.
    public static void main(String args[]) {

        // we'll create a few ObjectPair objects and print them out
        ObjectPair a = new ObjectPair("Bob", 9.1);
        ObjectPair b = new ObjectPair("Alice", 0);
        
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
