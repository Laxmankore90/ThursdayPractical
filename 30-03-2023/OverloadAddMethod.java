class OverloadAddMethod {
    
    // Define a method named "add" that takes two integer parameters and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Define another method named "add" that takes three integer parameters and returns their sum
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        // Call the "add" method with two integer parameters and store the result in "sum1"
        int sum1 = add(5, 10);
        
        // Call the "add" method with three integer parameters and store the result in "sum2"
        int sum2 = add(5, 100, 15);
        
        // Print the results to the console
        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
