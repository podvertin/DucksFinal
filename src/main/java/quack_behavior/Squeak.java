package quack_behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Пи-пи!");
    }
}
