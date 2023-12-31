package Classes;

import Interfaces.Flyable;
import Interfaces.Quackable;

public class RedHeadDuck extends Duck{
    private Quackable quackable;
    private Flyable flyable;
    public RedHeadDuck(Flyable type,Quackable typee){
        this.quackable = typee;
        this.flyable = type;
    }
    public void Quack() {
        quackable.quack();
    }
    public void Fly() {
        flyable.fly();
    }
    @Override
    public void display() {
        System.out.println("I'm a RedHeadDuck");
    }

}
