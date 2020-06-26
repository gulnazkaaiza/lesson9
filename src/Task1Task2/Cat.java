package Task1Task2;

public class Cat extends Animal implements Run, Swim{
    @Override
    public void getName() {
        System.out.println("Кот по имени Морти: ");

    }

    @Override
    public void run() {
        System.out.println("Он умеет бегать (каждый день!)");
    }

    @Override
    public void swim() {
        System.out.println("И умеет плавать (ненавидит это!)");
    }
}

