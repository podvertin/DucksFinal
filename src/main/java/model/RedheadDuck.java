package model;

import fly_behavior.FlyBehavior;
import fly_behavior.FlyWithWings;
import quack_behavior.Quack;
import quack_behavior.QuackBehavior;

public class RedheadDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Это красноголовая утка!");
    }

    @Override
    public void fly() {
        FlyBehavior flyBehavior = new FlyWithWings();
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        QuackBehavior quackBehavior = new Quack();
        quackBehavior.quack();
    }
}
