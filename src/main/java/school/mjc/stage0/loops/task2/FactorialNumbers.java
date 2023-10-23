package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            int factorial = 1;
            int j = i;
            while (j >= 1) {
                factorial *= j;
                j--;
            }
            System.out.println(factorial);
            i++;
        }


    }
}
