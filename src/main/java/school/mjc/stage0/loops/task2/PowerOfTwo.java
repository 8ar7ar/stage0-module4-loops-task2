package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        }
        else {
            int i = 0;
            while (i <= power) {
                int j = 0;
                int result = 1;
                while (j < i) {
                    result *= 2;
                    j++;}
                System.out.println(result);
                i++;
            }
        }

    }
}
