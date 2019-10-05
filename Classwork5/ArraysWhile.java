package Classwork5;

public class ArraysWhile {
    public static void main(String[] args) {

        //1. ստեղծել 10 էլեմենտանի մասիվ ու տպել
        int arr[] = new int[10];
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        System.out.println("--------------------------------------------------------1");

        //2. ստեղծել 20 էլեմենտանի մասիվ ու դնել արժեքներ 0,5,10,15․․․․ ու տպել

        int[] arr2 = new int[20];
        i = 0;
        while (i < arr2.length) {
            arr2[i] = 5 * i;
            i++;
        }

        for (int x : arr2) {
            System.out.println(x);
        }


        System.out.println("--------------------------------------------------------2");


        //3. ստեղծել երկու չափանի մասիվ 5,5 չափերի ու լցնել 1,2,3.. տվերը ու տպել
        int[][] arr3 = new int[5][5];
        int value = 1;
        i = 0;

        while(i < arr3.length){
            int j = 0;
            while(j < arr3[i].length){
                arr3[i][j] = value;
                System.out.println(arr3[i][j]);
               value++;
               j++;
            }
        }
        System.out.println("--------------------------------------------------------3");

        //4. ստեղծել 100 էլեմենտանի մասիվ ու լցնել 10 ի բաժանվող թվերը 0 ից սկսած ու տպել

        int[] array = new int[100];
        i = 0;
        while (i < array.length) {
            array[i] = i * 10;
            i++;
        }
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("--------------------------------------------------------4");

        //5. ստեղցել 50 էլեմենտանի մասիվ լցնել 0 ից 49 թվերը հետո անցնել վրայով հաշվել մասիվի էլեմենտների գումարը ու տպել
        int[] array2 = new int[50];
        i = 0;
        while (i < array2.length) {
            array2[i] = i;
            i++;
        }
        int sum = 0;
        i = 0;
        while (i < array2.length) {
            sum += array2[i];
            i++;
        }
        System.out.println(sum);
        System.out.println("--------------------------------------------------------5");


        //6. ստեղծել երկու չափանի մասիվ 4,4 լցնել 2 ին բազմապատիկ թվերը 2 ից սկսած,
        // հետո անցնել վրայով հաշվել մասիվի էլեմենտների արտադրյալը double փոփոխականով որ արժեք չկորի ու տպել
        int arrValue = 2;
        int[][] arrTwoDim = new int[4][4];
        i = 0;
        while (i < arrTwoDim.length) {
            int j = 0;
            while (j < arrTwoDim[i].length) {
                arrTwoDim[i][j] = arrValue;
                arrValue += 2;
                j++;
            }
            i++;
        }
        double mult = 1.0;
        i = 0;
        while (i < arrTwoDim.length) {
            int j = 0;
            while (j < arrTwoDim[i].length) {
                mult *= arrTwoDim[i][j];
                j++;
            }
            i++;
        }
        System.out.println(mult);
        System.out.println("--------------------------------------------------------6");


        //7. ստեղծել 3 չաձփանի մասիվ 5,5,5 չափերի ու լցնել 3 ին բազմապատիկ թվերը 3,6,9,12... ու տպել
        int value1 = 3;
        int[][][] arrThreeDim = new int[5][5][5];
        i = 0;
        while (i < arrThreeDim.length) {
            int j = 0;
            while (j < arrThreeDim[i].length) {
                int k = 0;
                while (k < arrThreeDim[i][j].length) {
                    arrThreeDim[i][j][k] = value1;
                    value1 += 3;
                    k++;
                }
                j++;
            }
            i++;
        }
        i = 0;
        while (i < arrThreeDim.length) {
            int j = 0;
            while (j < arrThreeDim[i].length) {
                int k = 0;
                while (k < arrThreeDim[i][j].length) {
                    System.out.print(arrThreeDim[i][j][k] + " ");
                    k++;
                }
                j++;
            }
            i++;
        }
        System.out.println();
        System.out.println("--------------------------------------------------------7");
    }
}
