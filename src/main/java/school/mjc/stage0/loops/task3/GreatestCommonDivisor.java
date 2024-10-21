package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);
            return;
        }
        else if (second == 0) {
            System.out.println(first);
            return;
        }

        if (second > first) {
            first ^= second;
            second ^= first;
            first ^= second;
        }

        if (first >= second) {
            while (first % second != 0) {
                int gcd = first % second;
                first = second;
                second = gcd;
            }
        }

        System.out.println(second);
    }
}
