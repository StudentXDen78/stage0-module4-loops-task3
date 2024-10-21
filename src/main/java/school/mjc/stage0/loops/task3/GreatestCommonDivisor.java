package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
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
