package quack_behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Кря!");
    }
}
