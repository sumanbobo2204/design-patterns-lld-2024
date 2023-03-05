package strategy.simuduck.quackstrategies;

import strategy.simuduck.QuackBehavior;

public class MuteDuck implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println(" << Silence >> ");
    }
}
