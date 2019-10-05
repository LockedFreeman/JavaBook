package Homework;

public class Sorts {
    public static void main(String[] args) {
        //    1. գտնել մասիվի ամենամեծ անդամը
        int[] arr = new int[]{5, 8, 9, 6, 3, 1, 4, 5, 7, 8, 5, 4, 2, 3};
        int max = arr[0];
        for (int el : arr) {
            if (max < el) {
                max = el;
            }
        }
        System.out.println(max);
        System.out.println("--------------------------------------------------------1");

//    2. գտնել մասիվի ամենափոքր անդամը
        int min = arr[0];
        for (int el : arr) {
            if (min > el) {
                min = el;
            }
        }
        System.out.println(min);
        System.out.println("--------------------------------------------------------2");

//   3. մասիվը սորտավորել ըստ աճման կարգի փոքրից մեծ   *բաբլ սորտ*
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
        }
        for (int el : arr) {
            System.out.print(el + ",");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------3");

//    4. մասիվը սորտավորել ըստ նվազման կարգի մեծից փոքր *բաբլ սորտ*
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
        }
        for (int el : arr) {
            System.out.print(el + ",");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------4");


//    5. մասիվը սորտավորել ըստ աճման կարգի փոքրից մեծ   *սելեկտիոն սորտ*
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                arr[maxIndex] ^= arr[i];
                arr[i] ^= arr[maxIndex];
                arr[maxIndex] ^= arr[i];
            }
        }
        for (int el : arr) {
            System.out.print(el + ",");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------5");

//    6  մասիվը սորտավորել ըստ աճման կարգի փոքրից մեծ   *ինսերտիոն սորտ*
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int index = i;
            while (index > 0) {
                if (current < arr[index - 1]) {
                    arr[index] = arr[index - 1];
                    index--;
                } else {
                    break;
                }
            }
            if (index >= 0) {
                arr[index] = current;
            }
        }

        for (int el : arr) {
            System.out.print(el + ",");
        }
        System.out.println("--------------------------------------------------------6");
    }
}
