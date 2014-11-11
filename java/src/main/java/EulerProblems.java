import java.util.ArrayList;

public class EulerProblems {
    public static int answer1() {
        int sum = 0;
        for (int i=3; i<1000; i+=3) {
            sum += i;
        }
        for (int i=5; i<1000; i+=5) {
            if (i % 3 != 0) {
                sum += i;
            }
        }
        return sum;
    }


    public static int answer2() {
        int sum = 0;
        int n = 0;
        int npp = 0, np = 1;
        while (n <= 4000000) {
            n = npp + np;
            npp = np;
            np = n;
            if ((n & 1) == 0) {
                sum += n;
            }
        }
        return sum;
    }

 
    public static long answer3() {
        long toDivide = 600851475143L;
        for (long i=3;;i+=2) {
            if ((toDivide%i) == 0) {
                while ((toDivide%i) == 0) {
                    toDivide /= i;
                }
            }
            if (i > toDivide / 2) {
                break;
            }
        }
        return toDivide;
    }

    public static void main(String[] args) {
        answer3();
    }
}
