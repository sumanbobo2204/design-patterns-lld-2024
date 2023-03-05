package strategy.simuduck.ducktype;

import strategy.simuduck.Duck;
import strategy.simuduck.flystrategies.FlyNoWay;
import strategy.simuduck.quackstrategies.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
