package decoratorclassic.example2;

public class ConcreteComponent implements IComponent {

    @Override
    public void operation() {
        System.out.println("\n" + this + ".operation()");
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
