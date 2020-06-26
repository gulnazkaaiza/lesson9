package Task1Task2;

public class Duck extends Animal implements Run, Swim, Fly {
    @Override
    public void getName() {
        System.out.println("Утка по имени Кря: ");

    }

    @Override
    public void run() {
        System.out.println("Она умеет бегать (но не любит)");

    }

    @Override
    public void fly() {
        System.out.println("А ещё умеет летать (порой это умение её очень спасает)");
    }

    @Override
    public void swim() {
        System.out.println("И умеет плавать (обожает!)");
    }
}
