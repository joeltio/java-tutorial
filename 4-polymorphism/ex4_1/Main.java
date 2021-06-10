package ex4_1;

public class Main {
    public static void main(String[] args) {
        // CHANGING ON THE GO (example)
        // Polymorphism allows the a piece of code to have multiple uses.

        // It is important to distinguish polymorphism as a concept, and the
        // tools the language provides for you to do so.

        // Runtime polymorphism allows an object to appear the same, but have
        // different implementations.

        // We have seen this in ex3_2 already, Java provides interfaces and
        // inheritance can be used for runtime polymorphism.

        Database db = new MockDatabase();
        runApp(db);
    }

    public static void runApp(Database db) {
        System.out.println(db.getStudentWithId(3));
    }
}
