public class Singleton3 {
    private static final Singleton3 instance = new Singleton3();

    public void sayHi() {
        System.out.println("Hi");
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}

