package Classwork7;

/**
 * Example1
 * Demonstrate method overloading.
 */
class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter.
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;
// call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}

/**
 * Example2
 * Automatic type conversions apply to overloading.
 */
class OverloadDemo1 {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}

class Overload1 {
    public static void main(String args[]) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(i); // this will invoke test(double)
        ob.test(123.2); // this will invoke test(double)
    }
}

/**
 * Example3
 **/
class Box {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String args[]) {
// create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
// get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}

/**
 * Example4
 * Objects may be passed to methods.
 */
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String args[]) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}

/**
 * Example5
 * Here, Box allows one object to initialize another.
 */
class Box1 {
    double width;
    double height;
    double depth;

    // Notice this constructor. It takes an object of type Box.
    Box1(Box1 ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box1() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    Box1(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String args[]) {
// create boxes using the various constructors
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);
        Box1 myclone = new Box1(mybox1); // create copy of mybox1
        double vol;
// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
// get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
// get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);
// get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
    }
}

/**
 * Example6
 * Primitive types are passed by value.
 */
class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String args[]) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a and b before call: " +
                a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " +
                a + " " + b);
    }
}

/**
 * Example7
 * Objects are passed through their references.
 */
class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRef {
    public static void main(String args[]) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
    }
}

/**
 * Example8
 * Returning an object.
 */
class Test3 {
    int a;

    Test3(int i) {
        a = i;
    }

    Test3 incrByTen() {
        Test3 temp = new Test3(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String args[]) {
        Test3 ob1 = new Test3(2);
        Test3 ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "
                + ob2.a);
    }
}

/**
 * Example9
 * A simple example of recursion.
 **/
class Factorial {
    //this is the recursive method
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial of 3 is: " + f.fact(3));
        System.out.println("Factorial of 4 is: " + f.fact(4));
        System.out.println("Factorial of 5 is: " + f.fact(5));

    }
}

/**
 * Example10
 * Another example that uses recursion.
 **/
class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    //display arrays -- recursively
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;

        ob.printArray(10);
    }
}

/**
 * Example11
 * This program demonstrates the difference between
 * public and private.
 */
class Test4 {
    int a; //default access
    public int b; // // public access
    private int c; // private access

    // methods to access c
    void setC(int i) { // set c's value
        c = i;
    }

    int getC() { // get c's value
        return c;
    }
}

class AccessTest4 {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        // These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // This is not OK and will cause an error
// ob.c = 100; // Error!

        // You must access c through its methods
        ob.setC(100); //OK
        System.out.println("a,b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}

/**
 * Example12
 * This class defines an integer stack that can hold 10 values.
 */
class Stack {
    /* Now, both stck and tos are private. This means
that they cannot be accidentally or maliciously
altered in a way that would be harmful to the stack.
*/
    private int stck[] = new int[10];
    private int tos;

    // Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // push some numbers onto the stack
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());


        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        // these statements are not legal
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}

/**
 * Example13
 * Demonstrate static variables, methods, and blocks.
 */
class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}

/**
 * Example14
 */
class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String args[]) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}

/**
 * Example15
 * This program demonstrates the length array member.
 */
class Length {
    public static void main(String args[]) {
        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};
        System.out.println("length of a1 is " + a1.length);
        System.out.println("length of a2 is " + a2.length);
        System.out.println("length of a3 is " + a3.length);
    }
}

/**
 * Example16
 * Improved Stack class that uses the length array member.
 */
class Stack1 {
    private int stck[];
    private int tos;

    // allocate and initialize stack
    Stack1(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (tos == stck.length - 1) // use length member
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }


    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String args[]) {
        Stack1 mystack1 = new Stack1(5);
        Stack1 mystack2 = new Stack1(8);
// push some numbers onto the stack
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
// pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());

    }
}

/**
 * Example17
 * Demonstrate an inner class.
 */
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}

/**
 * Example18
 * This program will not compile.
 */
// This program will not compile.
//class Outer2 {
//    int outer_x = 100;
//    void test() {
//        Inner2 inner = new Inner2();
//        inner.display();
//    }
//    // this is an inner class
//    class Inner2 {
//        int y = 10; // y is local to Inner
//        void display() {
//            System.out.println("display: outer_x = " + outer_x);
//        }
//    }
//    void showy() {
//        System.out.println(y); // error, y not known here!
//    }
//}
//class InnerClassDemo2 {
//    public static void main(String args[]) {
//        Outer outer = new Outer();
//        outer.test();
//    }
//}

/**
 * Example19
 * Demonstrating Strings.
 */
class StringDemo {
    public static void main(String args[]) {
        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1 + " and " + strOb2;
        System.out.println(strOb1);
        System.out.println(strOb2);
        System.out.println(strOb3);
    }
}

/**
 * Example20
 * Demonstrating some String methods.
 */
class StringDemo2 {
    public static void main(String args[]) {
        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1;
        System.out.println("Length of strOb1: " +
                strOb1.length());
        System.out.println("Char at index 3 in strOb1: " +
                strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");
        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}

/**
 * Example21
 * Demonstrate String arrays.
 */
class StringDemo3 {
    public static void main(String args[]) {
        String str[] = {"one", "two", "three"};
        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " +
                    str[i]);
    }
}

/**
 * Example22
 * Display all command-line arguments.
 */
//class CommandLine {
//    public static void main(String args[]) {
//        for(int i=0; i<args.length; i++)
//            System.out.println("args[" + i + "]: " +
//                    args[i]);
//    }
//}

/**
 * Example23
 * Use an array to pass a variable number of
 * arguments to a method. This is the old-style
 * approach to variable-length arguments.
 */
class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Number of args: " + v.length +
                " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
// Notice how an array must be created to
// hold the arguments.
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};
        vaTest(n1); // 1 arg
        vaTest(n2); // 3 args
        vaTest(n3); // no args
    }
}

/**
 * Example24
 * Demonstrate variable-length arguments.
 */
class VarArgs {
    // vaTest() now uses a vararg.
    static void vaTest(int... v) {
        System.out.print("Number of args: " + v.length +
                " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
// Notice how vaTest() can be called with a
// variable number of arguments.
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest(); // no args
    }
}

/**
 * Example25
 * Use varargs with standard arguments.
 */
class VarArgs2 {
    // Here, msg is a normal parameter and v is a
// varargs parameter.
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length +
                " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}

/**
 * Example26
 * Varargs and overloading.
 */
class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " +
                "Number of args: " + v.length +
                " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...) " +
                "Number of args: " + v.length +
                " Contents: ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int ...): " +
                msg + v.length +
                " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }
}

/**
 * Example27
 * Varargs, overloading, and ambiguity.
 * This program contains an error and will
 * not compile!
 */
//class VarArgs4 {
//    static void vaTest(int... v) {
//        System.out.print("vaTest(int ...): " +
//                "Number of args: " + v.length +
//                " Contents: ");
//        for (int x : v)
//            System.out.print(x + " ");
//        System.out.println();
//    }
//
//    static void vaTest(boolean... v) {
//        System.out.print("vaTest(boolean ...) " +
//                "Number of args: " + v.length +
//                " Contents: ");
//        for (boolean x : v)
//            System.out.print(x + " ");
//        System.out.println();
//    }
//
//    public static void main(String args[]) {
//        vaTest(1, 2, 3); // OK
//        vaTest(true, false, false); // OK
//        vaTest(); // Error: Ambiguous!
//    }
//}

