package ex3_2;

public class Main {
    public static void main(String[] args) {
        // FAKE IT TILL YOU MAKE IT (exercise)
        // Create the files needed for the following code to work. See the other
        // files

        Database db = new MockDatabase();
        runApp(db);
    }

    public static void runApp(Database db) {
        System.out.println(db.getStudentWithId(3));
    }
}
