package Classes;

import Interfaces.Flyable;
import Interfaces.Quackable;

public class MallardDuck extends Duck {
    private Quackable quackable;
    private Flyable flyable;
    public MallardDuck(Flyable type,Quackable typee){
        this.quackable = typee;
        this.flyable = type;
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    public void Quack() {
        quackable.quack();
    }
    public void Fly() {
        flyable.fly();
    }
}
