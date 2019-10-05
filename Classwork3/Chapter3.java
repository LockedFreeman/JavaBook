package Classwork3;

public class Chapter3 {

    /**
     * Example1
     * Compute distance light travels using long variables. class Light
     */
    public static class Example1 {
        public static void main(String args[]) {
            int lightspeed;
            long days;
            long seconds;
            long distance;
// approximate speed of light in miles per second
            lightspeed = 186000;

// specify number of days here
            days = 1000;

// convert to seconds
            seconds = days * 24 * 60 * 60;

// compute distance
            distance = lightspeed * seconds;

            System.out.print("In " + days);
            System.out.print(" days light will travel about ");
            System.out.println(distance + " miles.");
        }
    }


    /**
     * Example2
     * Compute the area of a circle.
     */
    public static class Example2 {
        public static void main(String args[]) {
            double pi, r, a;
// radius of the circle
            r = 10.8;

// pi, approximately
            pi = 3.1416;

//compute are
            a = pi * r * r;

            System.out.println("Area of circle is " + a);
        }
    }

    /**
     * Example3
     * Demonstrate char data type.
     */
    public static class Example3 {
        public static void main(String args[]) {
            char ch1, ch2;

// code for X
            ch1 = 88;
            ch2 = 'Y';

            System.out.println("ch1 and ch2: ");
            System.out.println(ch1 + " " + ch2);
        }
    }

    /**
     * Example4
     * char variables behave like integers.
     */
    public static class Example4 {
        public static void main(String args[]) {
            char ch1;

            ch1 = 'X';
            System.out.println("ch1 contains " + ch1);

// increment ch1
            ch1++;
            System.out.println("ch1 is now " + ch1);
        }
    }

    /**
     * Example5
     * Demonstrate boolean values. class BoolTest
     */
    public static class Example5 {
        public static void main(String args[]) {
            boolean b;

            b = false;
            System.out.println("b is " + b);
            b = true;
            System.out.println("b is " + b);

// a boolean value can control the if statement
            if (b) System.out.println("This is excuted");

            b = false;
            if (b) System.out.println("This is not executed");

// outcome of a relational operator is a boolean value
            System.out.println("10 > 9 is " + (10 > 9));

        }
    }

    /**
     * Example6
     * Demonstrate dynamic initialization.
     */
    public static class Example6 {
        public static void main(String args[]) {
            double a = 3.0, b = 4.0;

// c is dynamically initialized
            double c = Math.sqrt(a * a + b * b);

            System.out.println("Hypotenuse is " + c);
        }
    }

    /**
     * Example7
     * Demonstrate block scope
     */
    public static class Example7 {
        public static void main(String args[]) {
            int x; // known to all code within main

            x = 10;
            if (x == 10) { // start new scope
                int y = 20; // known only to this block

                // x and y both known here.
                System.out.println("x and y: " + x + " " + y);
                x = y * 2;
            }
            // y = 100; // Error! y not known here

            // x is still known here.
            System.out.println("x is " + x);
        }
    }

    /**
     * Example8
     * Demonstrate lifetime of a variable.
     */
    public static class Example8 {
        public static void main(String args[]) {
            int x;

            for (x = 0; x < 3; x++) {
                int y = -1; // y is initialized each time block is entered
                System.out.println("y is: " + y); // this always prints -1
                y = 100;
                System.out.println("y is now: " + y);
            }
        }
    }

    /**
     * Example9
     * Demonstrate casts.
     */
    public static class Exampl9 {
        public static void main(String args[]) {
            byte b;
            int i = 257;
            double d = 323.142;

            System.out.println("\nConversion of int to byte");
            b = (byte) i;
            System.out.println("i and b " + i + ", " + b);

            System.out.println("\nConversion of double to int.");
            i = (int) d;
            System.out.println("d and i " + d + ", " + i);

            System.out.println("\nConversion of double to byte.");
            b = (byte) d;
            System.out.println("d and b " + d + ", " + b);
        }
    }

    /**
     * Example10
     */
    public static class Example10 {
        public static void main(String args[]) {
            byte b = 42;
            char c = 'a';
            short s = 1024;
            int i = 50000;
            float f = 5.67f;
            double d = .1234;
            double result = (f * b) + (i / c) - (d * s);
            System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
            System.out.println("result = " + result);
        }
    }

    /**
     * Example11
     * Demonstrate a one-dimensional array.
     */
    public static class Example11 {
        public static void main(String args[]) {
            int month_days[] = new int[12];
            month_days[0] = 31;
            month_days[1] = 28;
            month_days[2] = 31;
            month_days[3] = 30;
            month_days[4] = 31;
            month_days[5] = 30;
            month_days[6] = 31;
            month_days[7] = 31;
            month_days[8] = 30;
            month_days[9] = 31;
            month_days[10] = 30;
            month_days[11] = 31;
            System.out.println("April has " + month_days[3] + " days.");

            // An improved version of the previous program.
            int month_days2[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println("April has " + month_days2[3] + " days.");
        }
    }

    /**
     * Example12
     * Average an array of values.
     */
    public static class Example12 {
        public static void main(String args[]) {
            double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
            double result = 0;
            for (int i = 0; i < nums.length; i++)
                result = result + nums[i];
            System.out.println("Average is " + result / 5);
        }
    }

    /**
     * Example13
     * Demonstrate a two-dimensional array.
     */
    public static class Example13 {
        public static void main(String args[]) {
            int twoD[][] = new int[4][5];
            int i, j, k = 0;

            for (i = 0; i < 4; i++)
                for (j = 0; j < 5; j++) {
                    twoD[i][j] = k;
                    k++;
                }

            for (i = 0; i < 4; i++) {
                for (j = 0; j < 5; j++)
                    System.out.print(twoD[i][j] + " ");
                System.out.println();
            }
        }
    }

    /**
     * Example14
     * Manually allocate differing size second dimensions. class TwoDAgain
     */
    public static class Example14 {
        public static void main(String args[]) {
            int twoD[][] = new int[4][];
            twoD[0] = new int[1];
            twoD[1] = new int[2];
            twoD[2] = new int[3];
            twoD[3] = new int[4];

            int i, j, k = 0;

            for (i = 0; i < 4; i++)
                for (j = 0; j < i + 1; j++) {
                    twoD[i][j] = k;
                    k++;
                }

            for (i = 0; i < 4; i++) {
                for (j = 0; j < i + 1; j++)
                    System.out.print(twoD[i][j] + " ");
                System.out.println();
            }
        }
    }

    /**
     * Example15
     * Initialize a two-dimensional array.
     */
    public static class Example15 {
        public static void main(String args[]) {
            double m[][] = {
                    {0 * 0, 1 * 0, 2 * 0, 3 * 0},
                    {0 * 1, 1 * 1, 2 * 1, 3 * 1},
                    {0 * 2, 1 * 2, 2 * 2, 3 * 2},
                    {0 * 3, 1 * 3, 2 * 3, 3 * 3}
            };
            int i, j;
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++)
                    System.out.print(m[i][j] + " ");
                System.out.println();
            }
        }
    }

    /**
     * Example16
     * Demonstrate a three-dimensional array.
     */
    public static class Example16 {
        public static void main(String args[]) {
            int threeD[][][] = new int[3][4][5];
            int i, j, k;

            for (i = 0; i < 3; i++)
                for (j = 0; j < 4; j++)
                    for (k = 0; k < 5; k++)
                        threeD[i][j][k] = i * j * k;

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 4; j++) {
                    for (k = 0; k < 5; k++)
                        System.out.print(threeD[i][j][k] + " ");
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}

