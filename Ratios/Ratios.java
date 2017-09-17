/*
 * Example Ratios -- a main method that demonstrates the use of
 * the Ratio class (also provided in this project)
 *
 * Jim Teresco, The College of Saint Rose, CSC 202, Fall 2012
 * Siena College, CSIS 210, Fall 2016/Fall 2017
 */

public class Ratios {

    public static void main(String[] args) {

        // Now to represent ratios, we create an instance of Ratio
        // for each.  The "new" results in a call to the constructor
        // of the class.
        Ratio a = new Ratio(4, 6);
        Ratio b = new Ratio(2, 4);

        // print some information about these.  If we try to "print out"
        // an instance of a class, Java will implicity call the class's
        // toString method.  We can also call it explicitly, as in the
        // second example.
        System.out.println("Ratio a is " + a);
        System.out.println("Ratio b is " + b.toString());

        // we can print their decimal equivalents, which is now done by
        // the Ratio class by calling its getDecimalValue method
        System.out.println("a as a decimal is " + a.getDecimalValue());
        System.out.println("b as a decimal is " + b.getDecimalValue());

        // let's change the ratios a bit, this time by calling mutator
        // methods of our Ratio instances, then do the printouts again
        a.setNumerator(1);
        b.setDenominator(10);

        System.out.println("Ratio a is " + a);
        System.out.println("Ratio b is " + b);

        System.out.println("a as a decimal is " + a.getDecimalValue());
        System.out.println("b as a decimal is " + b.getDecimalValue());        

    }
}
