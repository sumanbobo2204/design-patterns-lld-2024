package strategy.simuduck.flystrategies;

import strategy.simuduck.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
