import java.util.ArrayList;
import java.lang.Math;

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
        System.out.println(sum);
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
        System.out.println(sum);
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
        System.out.println(toDivide);
        return toDivide;
    }

    private static boolean isPalindrom(int n) {
        String s = Integer.toString(n);
        for (int p1=0, p2=s.length()-1; p1 < p2; p1++, p2--) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
        }
        return true;
    }
    public static int answer4() {
        int factor = 0, biggestFactor = 0;
        for (int x=999; x > 99; x--) {
            for (int y=x; y > 99; y--) {
                factor = x * y;
                if (factor > biggestFactor && isPalindrom(factor)) {
                    biggestFactor = factor;
                    System.out.println(factor);
                }
            }
        }
        System.out.println(biggestFactor);
        return biggestFactor;
    }
    
    private static boolean isDivisable(long n) {
        int[] primes = {2,3,5,7,11,13,17,19};
        for (int p : primes) {
            if ((n % p) != 0) {
                return false;
            }
            for (int d=2; d<=20; d++) {
                if ((n % d) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static long answer5() {
        long result = 1;
        while (!isDivisable(result)) {
            result++;
        }
        System.out.println(result);
        return result;
    }

    public static double answer6() {
        double squaresSummed = 0;
        for (double n=1; n <= 100; n++) {
            squaresSummed += Math.pow(n, 2);
        }
        double sumSquared = 0;
        for (double n=1; n <= 100; n++) {
            sumSquared += n;
        }
        sumSquared = Math.pow(sumSquared, 2);
        double answer = sumSquared - squaresSummed;

        System.out.format("%.0f\n", answer);
        return answer;
    }

    public static void main(String[] args) {
        answer6();
    }
}
