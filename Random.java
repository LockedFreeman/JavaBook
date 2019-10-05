public class Random {
    public static void main(String[] args) {
        /* 0-ic 100 tvery*/
        for (int i = 0; i < 100; i++) {
            System.out.print(i + "  ");

        }

        /*
        tpel 0-ic 100 tver@ voronq bajanvum en 3-i u 4-i
         */
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 & i % 4 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------");

        /*
        tpel 0-iv minvhev 100 tver@: yete zuyg e bazmapatkvel 5-ov isk yete kent e bazmapatkel 7-ov
         */
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i * 5);
            } else {
                System.out.println(i * 7);
            }
        }
        System.out.println("--------------------------------------------");

        /*
        hashvel 0-ic minchev 100 tveri zuyg tveri gumar@
         */
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println("--------------------------------------------");

        /*
        hashvel 0 - iv minchev 100 tveri kent gumnar@
         */
        int sum1 = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);
    }
}