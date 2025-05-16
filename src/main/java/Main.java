import model.DecorDuck;
import model.Duck;
import model.RedheadDuck;
import model.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck decorDuck = new DecorDuck();

        System.out.println("\nrubberDuck: ");
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();

        System.out.println("\nredheadDuck: ");
        redheadDuck.display();
        redheadDuck.quack();
        redheadDuck.swim();

        System.out.println("\ndecorDuck: ");
        decorDuck.display();
        decorDuck.quack();
        decorDuck.swim();
    }
}
