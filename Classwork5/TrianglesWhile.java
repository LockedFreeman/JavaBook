package Classwork5;

public class TrianglesWhile {
    public static void main(String[] args) {
        //stanal ogtagorcelov while ciklrner
        int length = 5;

//*
//* *
//* * *
//* * * *
//* * * * *
        int i = 0;
        while (i < length) {
            int j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;

        }
        System.out.println("--------------------------------------------------------1");

//* * * * *
//* * * *
//* * *
//* *
//*
        i = 0;
        while (i < length) {
            int j = 0;
            while (j < length - i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------------------------------------------------2");

//* * * * *
//  * * * *
//    * * *
//      * *
//        *
        i = 0;
        while (i < length) {
            int j = 0;
            while (j < i) {
                System.out.print("  ");
                j++;
            }
            j = 0;
            while (j < length - i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------------------------------------------------3");

//        *
//      * *
//    * * *
//  * * * *
//* * * * *
        i = 0;
        while (i < length) {
            int j = 0;
            while (j < length - i - 1) {
                System.out.print("  ");
                j++;
            }
            j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------------------------------------------------4");

//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
        i = 0;
        while (i < length) {
            int j = 0;
            while (j < length - i - 1) {
                System.out.print("  ");
                j++;
            }
            j = 0;
            while (j < 2 * i + 1) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------------------------------------------------5");

//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
        i = -(length - 1);
        while (i < length) {
            int index;
            if (i < 0) {
                index = i * (-1);
            } else {
                index = i;
            }
            int j = 0;
            while (j < index) {
                System.out.print("  ");
                j++;
            }
            j = 0;
            while (j < 2 * length - (index * 2 + 1)) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------------------------------------------------6");
    }
}
