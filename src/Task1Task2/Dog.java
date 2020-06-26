package Task1Task2;

public class Dog extends Animal implements Run, Swim {
    @Override
    public void getName() {
        System.out.println("Собака по имени Рик: ");
    }

    @Override
    public void run() {
        System.out.println("Он умеет бегать (обожаеееет!)");
    }

    @Override
    public void swim() {
        System.out.println("И умеет плавать (иногда любит это)");
    }
}
