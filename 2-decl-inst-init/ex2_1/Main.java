package ex2_1;

public class Main {
    public static void main(String[] args) {
        // THE CONSTRUCTION PROCESS (exercise)
        // Task 1: Mark the parts of the program where declaration, instantiation
        // and initialization happens for MyClass

        MyClass object = new MyClass();

        // Task 2: What are the following values?
        if (MyClass.y == 0) {
            System.out.println("1: Correct!");
        }

        if (object.x == 0) {
            System.out.println("2: Correct!");
        }
    }
}
