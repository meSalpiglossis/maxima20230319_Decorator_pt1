package decoratorclassic.example1;

public class ClassDecorator2 extends ClassDecorator1 {

    public ClassDecorator2() {
        super();
        System.out.println("ClassDecorator2 constructor");
    }

    @Override
    public void function() {
        super.function();
        System.out.println("ClassDecorator2 function");
    }
}
