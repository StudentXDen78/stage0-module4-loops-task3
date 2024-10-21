package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci == 1) {
            System.out.println(0);
            return;
        }
        if (lastFibonacci == 2) {
            System.out.println(1);
            return;
        }

        int fibonacciNumber;
        int firstNumber = 0;
        int secondNumber = 1;
        if (lastFibonacci >= 3) {
            System.out.println(firstNumber);
            System.out.println(secondNumber);
        }
        for (int i = 3; i <= lastFibonacci; i++) {
            fibonacciNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacciNumber;
            System.out.println(fibonacciNumber);
        }
    }
}
