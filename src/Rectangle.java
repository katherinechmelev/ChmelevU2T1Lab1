public class Rectangle {

    // instance variables
    private int length;
    private int width;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and prints area
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }
    public void printPerimeter() {
        System.out.println("My perimeter is " + (2*length + 2*width));
        }

     public void square() {
         if (length = width) {
             System.out.println("That's a square, not a rectangle!");
         }
     }

}
