
/**
 * Representation of a circle in the plane
 *
 * @author Jim Teresco and the CSIS 210 class
 */
public class Circle
{

    // instance variables
    private double centerX;
    private double centerY;
    private double radius;
    
    // default constructor, circle at the origin of
    // radius 1 for lack of a better obvious option
    public Circle() {
     
        centerX = 0.0;
        centerY = 0.0;
        radius = 1.0;
    }
    
    // general-purpose constructor
    public Circle(double x, double y, double r) {
     
        centerX = x;
        centerY = y;
        radius = r;
    }
    
    // toString for printing
    public String toString() {
        return "center (" + centerX + "," + centerY + "), radius " +
            radius;
    }
    
    // compute our circumference
    public double circumference() {
        
        return 2 * radius * Math.PI;
    }
    
    // compute the area
    public double area() {
        
        return Math.PI * radius * radius;
    }
    
    // trivial getters and setters
    public void setCenterX(double cx) {
        
        centerX = cx;
    }
    
    public void setCenterY(double cy) {
        
        centerY = cy;
    }
    
    public void setRadius(double r) {
        
        radius = r;
    }
    
    // alternate mutators
    public void setDiameter(double d) {
        
        radius = d / 2.0;
    }
    
    // set both coordinates of the center
    public void setCenter(double x, double y) {
     
        centerX = x;
        centerY = y;
    }
    
    // translate the circle by dx, dy
    public void moveBy(double dx, double dy) {
     
        centerX += dx;
        centerY += dy;
    }
    
    // scale the circle in place
    public void scale(double s) {
     
        radius *= s;
    }
    
    // a method to call to print out lots of information about our circle
    public void printInfo() {
    
        System.out.println(this);
        System.out.println("Circumference: " + circumference() + ", area: " + area());
    }
    
    
    // a main method to try out a lot of these
    public static void main(String args[]) {
    
        Circle def = new Circle();
        System.out.println("Default circle: " + def);
        System.out.println("its circumference: " + def.circumference());
        
        Circle c1 = new Circle(2, 4, 5);
        System.out.println("c1: " + c1);
        System.out.println("its circumference: " + c1.circumference());   
        
        Circle c2 = new Circle(3.5, 9.0, 3.0);
        System.out.println("c2 on construction:");
        c2.printInfo();
        c2.setDiameter(0.25);
        System.out.println("After setDiameter(0.25)");
        c2.printInfo();
        c2.setCenter(0, 100);
        System.out.println("After setCenter(0, 100)");
        c2.printInfo();
        c2.scale(1000);
        System.out.println("After scale(1000)");
        c2.printInfo();
        c2.moveBy(-34.2, 982.1);
        System.out.println("After moveBy(-34.2, 982.1)");
        c2.printInfo();
        
    }
    
}
