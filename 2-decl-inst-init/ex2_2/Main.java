package ex2_2;

public class Main {
    public static void main(String[] args) {
        // THE SUPER CLASS (example)
        // Invoking super() in the subclass is optional if the superclass does
        // not have arguments.
        SubClass object = new SubClass();

        System.out.println(object.x);

        // Side Note: Inheritance should be used for is-a relationships.
        // Composition is used for has-a relationships. Don't inherit just to
        // "share code".
    }
}
