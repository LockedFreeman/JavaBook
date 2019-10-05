import java.util.Arrays;
import java.util.Scanner;

public class CalebProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        int[] SortUtil = {6, 5, 1, 3, 4, 5, 7, 54, 102, 46};
        Arrays.sort(SortUtil);
        System.out.println(Arrays.toString(SortUtil));

    }
}

