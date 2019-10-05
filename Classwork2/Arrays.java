package Classwork2;

public class Arrays {
    public static void main(String args[]) {
        //1. ստեղծել 10 էլեմենտանի մասիվ ու տպել
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------------------------------1");


        //2. ստեղծել 20 էլեմենտանի մասիվ ու դնել արժեքներ 0,5,10,15․․․․ ու տպել
        int[] arr2 = new int[20];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 5 * i;
            System.out.println(arr2[i]);
        }
        System.out.println("--------------------------------------------------------2");

        //3. ստեղծել երկու չափանի մասիվ 5,5 չափերի ու լցնել 1,2,3.. տվերը ու տպել
        int[][] arr3 = new int[5][5];
        int value = 1;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = value;
                value++;
                System.out.println(arr3[i][j]);
            }
        }
        System.out.println("--------------------------------------------------------3");

        //4. ստեղծել 100 էլեմենտանի մասիվ ու լցնել 10 ի բաժանվող թվերը 0 ից սկսած ու տպել
        int[] arr4 = new int[100];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i * 10;
            System.out.println(arr4[i]);
        }
        System.out.println("--------------------------------------------------------4");

        //5. ստեղցել 50 էլեմենտանի մասիվ լցնել 0 ից 49 թվերը հետո անցնել վրայով հաշվել մասիվի էլեմենտների գումարը ու տպել
        int[] arr5 = new int[50];
        int sum = 0;
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i;
            System.out.print(arr5[i] + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("--------------------------------------------------------5");

        //6. ստեղծել երկու չափանի մասիվ 4,4 լցնել 2 ին բազմապատիկ թվերը 2 ից սկսած,
        // հետո անցնել վրայով հաշվել մասիվի էլեմենտների արտադրյալը double փոփոխականով որ արժեք չկորի ու տպել
        int[][] arr6 = new int[4][4];
        int value1 = 2;
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                arr6[i][j] = value1;
                value1 += 2;
                System.out.print(arr6[i][j] + " ");
            }
        }
        double mult = 1;
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                mult = mult * arr6[i][j];
            }
        }
        System.out.println();
        System.out.println("mult = " + mult);
        System.out.println("--------------------------------------------------------6");

        //7. ստեղծել 3 չաձփանի մասիվ 5,5,5 չափերի ու լցնել 3 ին բազմապատիկ թվերը 3,6,9,12... ու տպել
        int[][][] arr7 = new int[5][5][5];
        int value2 = 1;
        for (int i = 0; i < arr7.length; i++) {
            for (int j = 0; j < arr7[i].length; j++) {
                for (int k = 0; k < arr7[i][j].length; k++) {
                    arr7[i][j][k] = value2;
                    value2 = value2 + 3;
                    System.out.println(value2);
                }
            }
        }
        System.out.println("--------------------------------------------------------7");
    }
}
