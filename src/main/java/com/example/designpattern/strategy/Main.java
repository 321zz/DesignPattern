package main.java.com.example.designpattern.strategy;

public class Main {

    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
    }
}
