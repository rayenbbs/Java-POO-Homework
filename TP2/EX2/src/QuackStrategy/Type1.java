package QuackStrategy;

import Interfaces.Quackable;

public class Type1 implements Quackable {
    @Override
    public void quack() {
        System.out.println("This is a MalladDuck Quacking");
    }
}
