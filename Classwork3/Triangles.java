package Classwork3;

public class Triangles {
    //stanal ogtagorcelov for ciklrner
    public static void main(String args[]) {
//*
//* *
//* * *
//* * * *
//* * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------1");

//* * * * *
//* * * *
//* * *
//* *
//*
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------2");

//* * * * *
//  * * * *
//    * * *
//      * *
//        *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= 5 - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------3");


//        *
//      * *
//    * * *
//  * * * *
//* * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= 5 - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------4");

//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
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
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }

            System.out.println("  ");
        }
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("   ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------------------------------6");

    }
}

