import java.util.Arrays;
import java.util.EnumSet;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        CustomExecutorService executorService = new CustomExecutorService(3);

        for (int i = 0; i < 10; i++) {
            int taskNum = i;
            executorService.submit(() -> System.out.println("Task " + taskNum + " executed by thread " + Thread.currentThread().getName()));
        }

        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.err.println(e);
        }

        executorService.shutdown();

        System.out.println("Done");
        System.exit(0);
    }
}