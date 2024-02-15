import java.util.function.Predicate;

/**
 * Main
 */
public class Main {
    // Вспомогателльная функция для вычисления логорифма по основанию 2
    public static double log2(int N)
    {
        double result = Math.log(N) / Math.log(2);
 
        return result;
    }

    public static void main(String[] args) {
        // лямбда-функция реализующая функциональный интерфейс предиката
        Predicate<Integer> isPOT = (a) -> (int)log2(a) == log2(a);

        // тест
        System.out.println(isPOT.test(32));
        System.out.println(isPOT.test(54));
        System.out.println(isPOT.test(64));
        System.out.println(isPOT.test(127));
    }
}