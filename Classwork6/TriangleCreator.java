package Classwork6;

public class TriangleCreator {
//*
//* *
//* * *
//* * * *
//* * * * *
    void createLeftBottomTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------1");
    }

//* * * * *
//* * * *
//* * *
//* *
//*
    void createLeftTopTriangle(int width) {
        for (int i = width; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------2");
    }

//* * * * *
//  * * * *
//    * * *
//      * *
//        *
    void createRightTopTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= width - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------3");
    }

//        *
//      * *
//    * * *
//  * * * *
//* * * * *
    void createRightBottomTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= width - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------4");
    }

//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
    void createCentralTriangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------5");
    }

//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
    void createRomb(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = width; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = width; j > i; j--) {
                System.out.print("  ");
            }

            System.out.println("  ");
        }
        for (int i = width; i >= 0; i--) {
            for (int j = width; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = width; j > i; j--) {
                System.out.print("   ");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------------------------------6");
    }
}


class TriangleCreatorDemo {
    public static void main(String[] args) {
        TriangleCreator TriangleCreator = new TriangleCreator();

        TriangleCreator.createLeftBottomTriangle(5);
        TriangleCreator.createLeftTopTriangle(5);
        TriangleCreator.createRightBottomTriangle(5);
        TriangleCreator.createRightTopTriangle(5);
        TriangleCreator.createCentralTriangle(5);
        TriangleCreator.createRomb(5);
    }
}





