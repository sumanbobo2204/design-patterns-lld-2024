package strategy.simuduck;

import strategy.simuduck.ducktype.MallardDuck;
import strategy.simuduck.ducktype.ModelDuck;
import strategy.simuduck.flystrategies.FlyRocketPowered;
import strategy.simuduck.quackstrategies.MuteDuck;

public class MainDuckSimulatorApp {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        // Dynamically changing the fly behavior and quack behavior-->
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new MuteDuck());
        modelDuck.performFly();
        modelDuck.performQuack();


    }
}
