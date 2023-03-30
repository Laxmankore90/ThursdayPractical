class Rectangle {
    int length;
    int breadth;

    // Constructor for Rectangle class that takes length and breadth as parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print the area of the rectangle
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of the rectangle is: " + area);
    }

    // Method to calculate and print the perimeter of the rectangle
    public void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }

    // Main method to create a Rectangle object and call its methods
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);   // create a rectangle object with length 5 and breadth 10
        rect.calculateArea();    // print the area of the rectangle
        rect.calculatePerimeter();   // print the perimeter of the rectangle
    }
}
