package ex5_2;

public class Main {
    public static void main(String[] args) {
        // FREEDOMS OF A TEENAGER: LIMITED BUT FREEDOM NONETHELESS (example)
        // Sometimes, allowing every type doesn't make much sense. Maybe only a
        // certain bunch of types.

        AnimalContainer<Cat> catContainer = new AnimalContainer<>();

        // Compilation error
        // AnimalContainer<String> strContainer = new AnimalContainer<>();
    }
}
