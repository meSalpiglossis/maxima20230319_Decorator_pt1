package decoratorclassic.example2;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(IComponent concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("\n" + this + ".operation()");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
