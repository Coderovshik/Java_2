import java.util.function.Predicate;

/**
 * Main
 */
public class Main {
    public static double log2(int N)
    {
        double result = Math.log(N) / Math.log(2);
 
        return result;
    }

    public static void main(String[] args) {
        Predicate<Integer> isPOT = (a) -> (int)log2(a) == log2(a);

        System.out.println(isPOT.test(32));
        System.out.println(isPOT.test(54));
        System.out.println(isPOT.test(64));
        System.out.println(isPOT.test(127));
    }
}