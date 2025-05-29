package quack_behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Утка не умеет крякать");
    }
}
