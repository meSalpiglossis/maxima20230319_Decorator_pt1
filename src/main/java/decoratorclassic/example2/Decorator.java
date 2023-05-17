package decoratorclassic.example2;

abstract class Decorator implements IComponent {

    protected IComponent component;

    public Decorator (IComponent concreteComponent) {
        this.component = concreteComponent;
        System.out.println("\n" + "Decorator constructor: this.component = concreteComponent");
        System.out.println("=========================================================");
    }

    public void wrap (IComponent concreteComponent) {
        this.component = concreteComponent;
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("\n" + this + " Decorator.operation(): component.operation()");
        System.out.println("============================================");
    }
}
