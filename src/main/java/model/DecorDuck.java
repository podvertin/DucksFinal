package model;

import fly_behavior.FlyBehavior;
import fly_behavior.FlyNoWay;
import quack_behavior.MuteQuack;
import quack_behavior.QuackBehavior;

public class DecorDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Это деревянная утка!");
    }

    @Override
    public void fly() {
        FlyBehavior flyBehavior = new FlyNoWay();
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        QuackBehavior quackBehavior = new MuteQuack();
        quackBehavior.quack();
    }
}
