package Cycles;

public class Task6 {
    public static void task6() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
