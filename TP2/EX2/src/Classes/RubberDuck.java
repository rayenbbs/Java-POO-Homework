package Classes;
import Interfaces.Quackable;
public class RubberDuck extends Duck{
    private Quackable quackable;

    @Override
    public void display() {
        System.out.println("I'm a RubberDuck");
    }
    public RubberDuck(Quackable typee){
        this.quackable = typee;
    }
    public void Quack() {
        quackable.quack();
    }
}
