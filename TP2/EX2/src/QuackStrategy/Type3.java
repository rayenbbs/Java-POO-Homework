package QuackStrategy;

import Interfaces.Quackable;

public class Type3 implements Quackable {
    @Override
    public void quack() {
        System.out.println("This is a RubberDuck Quacking");
    }
}
