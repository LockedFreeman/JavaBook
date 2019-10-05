package Classwork2;

public class Chapter2 {

    /**
     * Example 1;
     * Your program begins with a call to main().
     * This is a simple Java program.
     */
    public static class Example1 {
        public static void main(String args[]) {
            System.out.println("This is a simple Java program.");
        }
    }

    /**
     * Example 2;
     * Here is another short example.
     * Call this file "Example2.java".
     */
    public static class Example2 {
        public static void main(String args[]) {
            int num; // this declares a variable called num
            num = 100; // this assigns num the value 100
            System.out.println("This is num " + num);
            num = num * 2;
            System.out.println("The value of num * 2 ");
            System.out.println(num);
        }
    }

    /**
     * Example 3;
     * Demonstrate the if.
     */
    public static class Example3 {
        public static void main(String args[]) {
            int x, y;
            x = 10;
            y = 20;

            if (x < y) System.out.println("x is less than y");

            x = x * 2;
            if (x == y) System.out.println("x now equal to y");

            x = x * 2;
            if (x > y) System.out.println("x now greater than y ");

            //this won't display anything
            if (x == y) System.out.println("you won't see this");
        }
    }

    /**
     * Example4
     * Demonstrate the for loop.
     * Call this file "ForTest.java".
     */
    public static class Example4 {
        public static void main(String args[]) {
            int x;
            for (x = 0; x < 10; x++) System.out.println("This is x: " + x);
        }
    }

    /**
     * Example5
     *  Demonstrate a block of code.
     */
    public static class Example5 {
        public static void main(String args[]) {
            int x,y;
            y = 20;

            for(x = 0; x < 10; x++) {
                System.out.println("This is x: " + x);
                System.out.println("This is y: " + y);
                y = y - 2;
            }
        }
    }
}

