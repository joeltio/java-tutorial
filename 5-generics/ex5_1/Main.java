package ex5_1;

public class Main {
    public static void main(String[] args) {
        // A LITTLE RESPITE FROM TYPES (exercise)
        // Generics allow you to program using any type. It is one way we
        // implement parametric polymorphism in ex4_2.

        Container<String> strContainer = new Container<>();
        Container<Integer> intContainer = new Container<>();

        strContainer.add("First");
        strContainer.add("Second");
        strContainer.add("Third");

        intContainer.add(1);
        intContainer.add(8);
        intContainer.add(5);

        if (strContainer.get(1) == "Second" && intContainer.get(2) == 5) {
            System.out.println("Correct!");
        };
    }
}
