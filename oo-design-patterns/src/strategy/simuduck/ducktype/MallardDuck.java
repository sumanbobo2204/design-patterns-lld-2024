package strategy.simuduck.ducktype;

import strategy.simuduck.Duck;
import strategy.simuduck.FlyBehavior;
import strategy.simuduck.QuackBehavior;
import strategy.simuduck.flystrategies.FlyWithWings;
import strategy.simuduck.quackstrategies.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
