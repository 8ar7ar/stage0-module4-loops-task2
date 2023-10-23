package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i < printToInclusive){
            int j = 2;
            boolean isPrime = true;
            while (j < i){
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime) System.out.println(i);
            i++;
        }
    }
}
