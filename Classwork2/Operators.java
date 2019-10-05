package Classwork2;

public class Operators {
    public static void main(String args[]) {

        // 1) tpel 100 ic sksac minchev 0 bolor tver@ qayli chap@ 1
        for (int i = 100; i > 0; i--) System.out.println(i);
        System.out.println("--------------------------------------------------------1");

        // 2) tpel 0 ic sksac minchev 100 bolor tver@ qayli chap@ 1
        for (int i = 0; i < 100; i++) System.out.println(i);
        System.out.println("--------------------------------------------------------2");

        // 3) tpel 100 ic sksac minchev 0 bolor tver@ qayli chap@ 2
        for (int i = 100; i > 0; i -= 2) System.out.println(i);
        System.out.println("--------------------------------------------------------3");

        // 4) tpel 0 ic sksac minchev 100 bolor tver@ qayli chap@ 2
        for (int i = 0; i < 100; i += 2) System.out.println(i);
        System.out.println("--------------------------------------------------------4");

        // 5) tpel 100 ic sksac minchev 0 bolor tver@ qayli chap@ 5
        for (int i = 100; i > 0; i -= 5) System.out.println(i);
        System.out.println("--------------------------------------------------------5");

        // 6) tpel 0 ic sksac minchev 100 bolor tver@ qayli chap@ 5
        for (int i = 0; i < 100; i += 5) System.out.println(i);
        System.out.println("--------------------------------------------------------6");

        // 7) hashvel yev tpel 0 ic minchev 1000 bolor tveri gumar@ qayl@ 1
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("--------------------------------------------------------7");

        // 8) hashvel yev tpel 0 ic minchev 1000 bolor tveri gumar@ qayl@ 1
        // voronq bajanvum en 4 i yev 7
        sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println("--------------------------------------------------------8");

        // 9) hashvel yev tpel 0 ic minchev 1000 bolor tveri gumar@ qayl@ 1
        // voronq 4 i bajanelis mnacord@ havasar e 3
        sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 4 == 3) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println("--------------------------------------------------------9");

        // 10) hashvel yev tpel 100 ic minchev 300 bolor tveri gumar@ voronq
        //bajanvum en 6 i kam 7 i
        sum = 0;
        for (int i = 100; i < 300; i++) {
            if (i % 6 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println("--------------------------------------------------------10");

        // 11) tpel 65 ic minchev 23 bolor tver@ qayl@ 1
        //yete tiv@ zuyg e tpel tvin gumarac 12
        //isk yete tiv@ kent e tpel tvin gumarac 25
        for (int i = 65; i > 23; i--) {
            if (i % 2 == 0) {
                System.out.println(i + 12);
            } else {
                System.out.println(i + 25);
            }
        }
    }
}
