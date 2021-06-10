package ex1_2;

public class Main {
    public static void main(String[] args) {
        // Notice how it is only created once
        Singleton x1 = Singleton.getInstance();
        Singleton y1 = Singleton.getInstance();
        Singleton z1 = Singleton.getInstance();

        NotSingleton x2 = new NotSingleton();
        NotSingleton y2 = new NotSingleton();
        NotSingleton z2 = new NotSingleton();

        // Singletons are generally avoided because:
        // 1. You usually don't need them
        // 2. Proper implementation is not easy. The implementation here does not
        //    always work.
        // If you see one, it is good to question why it is really needed.
    }
}
