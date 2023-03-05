package strategy.simuduck.quackstrategies;

import strategy.simuduck.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
