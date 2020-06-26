package Task3;


public class Main {
    public static void main(String[] args) {
        Man Man = new Man();
        Women Anna = new Women();
        Child Emil = new Child();


        Man.run();
        Anna.run();
        Emil.run();
        Man.swim();
        Anna.swim();
        Emil.swim();
    }
}