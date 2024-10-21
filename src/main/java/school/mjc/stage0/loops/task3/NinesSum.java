package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        // Write a program that will display the sum of the series [ 9 + 99 + 999 + 9999 ... n].
        // StringBuilder number9 = new StringBuilder();
        if (lengthOfLastNumber <= 0) {
            System.out.println("0");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            StringBuilder number9 = new StringBuilder();
            for (int a = 1; a <= i; a++) {
                number9.append("9");
            }
            sum = sum + Integer.parseInt(number9.toString());
        }
        System.out.println(sum);
    }
}
