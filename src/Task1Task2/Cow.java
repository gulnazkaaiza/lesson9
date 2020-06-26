package Task1Task2;

public class Cow extends Animal implements Run {
    @Override
    public void getName() {
        System.out.println("Корова по имени Маруся");
    }

    @Override
    public void run() {
        System.out.println("Маруся умеет только бегать (но всё же предпочитает пешие прогулки)");
    }
}
