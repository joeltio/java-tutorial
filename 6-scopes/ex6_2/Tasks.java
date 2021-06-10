package ex6_2;

import java.util.ArrayList;

public class Tasks {
    public void main() {
        // Task 1: Predict the output of task1()
        System.out.println(task1());
        // Task 2: Predict the output of task2()
        System.out.println(task2());
        // Task 3: Predict the output of task3()
        System.out.println(task3());
        // Task 4: Predict the output of task4()
        System.out.println(task3());
    }

    int helper1(AnonInner anonInner) {
        return anonInner.getVal();
    }

    int a = 1;
    int task1() {
        return helper1(new AnonInner() {
            @Override
            int getVal() {
                return a;
            }
        });
    }

    int b = 1;
    int task2() {
        int b = 2;
        helper1(new AnonInner() {
            @Override
            int getVal() {
                return b;
            }
        });

        return b;
    }

    int task3() {
        int c = 1;

        return helper1(new AnonInner() {
            @Override
            int getVal() {
                c = 2;
                return c;
            }
        });
    }

    int task4() {
        ArrayList<Integer> d = new ArrayList<>();

        helper1(new AnonInner() {
            @Override
            int getVal() {
                d.add(2);
                return 0;
            }
        });

        return d.get(0);
    }
}
