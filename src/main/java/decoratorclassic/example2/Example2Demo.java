package decoratorclassic.example2;

public class Example2Demo {
    public static void main(String[] args) {
        IComponent comp = new ConcreteComponent();
        IComponent compA;
        IComponent compB;

//        comp.operation();



        compA = new ConcreteDecoratorA(comp);
        System.out.println("\nNow comp wrapped by ConcreteDecoratorA and now it's a " + compA);
        System.out.println("NOW WE RUN operation() AFTER WRAPPING comp OBJECT");
        compA.operation();

        compB = new ConcreteDecoratorB(compA);
        System.out.println("\nNow compA wrapped by ConcreteDecoratorB and now it's a " + compB);
        System.out.println("NOW WE RUN operation() AFTER WRAPPING compA OBJECT");
        compB.operation();

        System.out.println("*********************** OR USE SAME VARIABLE comp - LINKS STORED INSIDE new OBJECTS IN IComponent component *******************************");

        comp = new ConcreteDecoratorA(comp);
        System.out.println("\nNow compB wrapped by ConcreteDecoratorBB and now it's a " + comp);
        System.out.println("NOW WE RUN operation() AFTER WRAPPING compB OBJECT");
        comp.operation();

        System.out.println("***************************************************************");

        comp = new ConcreteDecoratorB(comp);
        System.out.println("\nNow compBB wrapped by ConcreteDecoratorBBB and now it's a " + comp);
        System.out.println("NOW WE RUN operation() AFTER WRAPPING compBB OBJECT");
        comp.operation();

        System.out.println("***************************************************************");


    }
}
