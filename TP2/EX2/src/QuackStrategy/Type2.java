package QuackStrategy;

import Interfaces.Quackable;

public class Type2 implements Quackable {
    @Override
    public void quack() {
        System.out.println("This is a RedHeadDuck Quacking");
    }
}
