package Task3;

import Task1Task2.Run;
import Task1Task2.Swim;

public class Man implements Run, Swim {
    @Override
    public void run() {
        System.out.println("Все люди умеют бегать: ");
    }

    @Override
    public void swim() {
        System.out.println("Не все люди умеют плавать: ");

    }
}
