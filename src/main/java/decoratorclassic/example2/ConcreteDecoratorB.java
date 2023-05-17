package decoratorclassic.example2;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(IComponent concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("\n" + this + ".operation()");
        System.out.println("-----------------------------");
    }
}
