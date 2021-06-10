package ex6_1;

public class Tasks {
    public void main() {
        // Task 1: Predict the output of task1()
        System.out.println(task1());
        // Task 2: Predict the output of task2()
        System.out.println(task2());
        // Task 3: Predict the output of task3()
        System.out.println(task3());
    }

    int a = 1;
    int task1() {
        int a = 2;
        return a;
    }

    int b = 1;
    int task2() {
        int b;
        b = 2;
        return b;
    }

    int c = 1;
    int task3() {
        int c = 2;
        this.c = 3;
        return c;
    }
}
