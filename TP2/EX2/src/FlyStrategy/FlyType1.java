package FlyStrategy;

import Interfaces.Flyable;

public class FlyType1 implements Flyable {
    @Override
    public void fly() {
        System.out.println("This is a MalladDuck Flying");
    }
}
