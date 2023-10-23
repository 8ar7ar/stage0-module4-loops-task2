package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        if (multiplyByAndToInclusive == 0) System.out.print("");
        else if (multiplyByAndToInclusive > 0){
            while (count <= multiplyByAndToInclusive){
                System.out.println(multiplyByAndToInclusive * count);
                count++;
            }
        } else {
            while (count > multiplyByAndToInclusive - 1){
                System.out.println(multiplyByAndToInclusive * count*-1);
                count--;
            }
        }
    }
}
