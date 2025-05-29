package fly_behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Утка не умеет летать");
    }
}
