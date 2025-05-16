package model;

import fly_behavior.FlyBehavior;
import fly_behavior.FlyNoWay;
import quack_behavior.QuackBehavior;
import quack_behavior.Squeak;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Это резиновая утка!");
    }

    @Override
    public void fly() {
        FlyBehavior flyBehavior = new FlyNoWay();
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        QuackBehavior quackBehavior = new Squeak();
        quackBehavior.quack();
    }
}
