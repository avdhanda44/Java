public class Opreators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("c after += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c after -= 3: " + c);

        //Unary Operators
        int d = 10;
        System.out.println("d before increment: " + d);
        System.out.println("d after increment: " + (++d));
        System.out.println("d after decrement: " + (--d));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum of a and b: " + max);

        // Bitwise Operators
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));

        // Shift Operators
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));

        // Type Casting
        double e = 9.78;
        int f = (int) e; // Explicit casting
        System.out.println("Value of e: " + e);
        System.out.println("Value of f after casting: " + f);

        // Instanceof Operator
        String str = "Hello";
        if (str instanceof String) {
            System.out.println("str is an instance of String");
        }

    
    }
    
}
