import java.util.Arrays;
import java.util.EnumSet;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // тестирование
        ThreadSafeSet<Integer> tss = new ThreadSafeSet<>();
        ThreadSafeList<Integer> tsl = new ThreadSafeList<>();

        Thread t1 = new Thread(() -> {
            tss.add(1);
            tss.add(3);
            tss.add(5);

            System.out.println("thread 1 - set size: " + tss.size());

            tsl.add(1);
            tsl.add(3);
            tsl.add(5);

            tsl.set(0, -tsl.get(0));

            System.out.println("thrad 1 - list: " + Arrays.toString(tsl.toArray()));
        });

        Thread t2 = new Thread(() -> {
            tss.add(2);
            tss.add(4);
            tss.add(6);

            System.out.println("thread 2 - set size: " + tss.size());

            tsl.add(2);
            tsl.add(4);
            tsl.add(6);

            tsl.set(1, -tsl.get(1));

            System.out.println("thrad 2 - list: " + Arrays.toString(tsl.toArray()));
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}