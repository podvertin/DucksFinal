package model;

import fly_behavior.FlyBehavior;
import quack_behavior.QuackBehavior;

public abstract class Duck implements FlyBehavior, QuackBehavior {

    public void swim(){
        System.out.println("Утка поплыла!");
    }

    public abstract void display();
}
