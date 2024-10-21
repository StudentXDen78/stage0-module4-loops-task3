package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        if (Math.abs(firstBoarder) == Math.abs(secondBoarder)) {
            if (Math.signum(firstBoarder) == Math.signum(secondBoarder)) {
                System.out.println(firstBoarder);
            }
            else {
                System.out.println("0");
            }
            return;
        }

        String k = Integer.toString(firstBoarder) + secondBoarder;
        int newNumber = Integer.parseInt(k);
        System.out.println(newNumber / 2 );
    }
}