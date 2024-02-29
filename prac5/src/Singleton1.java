public class Singleton1 {
    private static Singleton1 instance;

    public void sayHi() {
        System.out.println("Hi");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
            return instance;
        }
        return instance;
    }
}
