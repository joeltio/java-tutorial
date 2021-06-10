package ex1_2;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
        System.out.println("Creating new Singleton instance...");
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }
}
