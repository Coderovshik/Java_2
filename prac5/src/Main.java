import java.util.Arrays;
import java.util.EnumSet;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Singleton1.getInstance().sayHi();
        Singleton2.INSTANCE.sayHi();
        Singleton3.getInstance().sayHi();
    }
}