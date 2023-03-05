package strategy.simuduck;

public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    // All ducks can have a display in the app
    public abstract void display();
    // All ducks can swim even a paper duck
    public void swim() {
        System.out.println("All ducks can swim even decoys !!");
    }

}
