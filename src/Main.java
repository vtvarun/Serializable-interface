public class Main {

    public static void main(String[] args) {

        // Abstract Factory Design Pattern
        //
        // Please read this analogy to understand both abstract factory design pattern
        // and factory design pattern


        // Imagine you are working for Nike (yes, the shoes brand)
        // Again imagine, that Nike has a factory for shoes
        // keep imagining, Nike has another factory for bags
        // and Nike has another factory for t-shirts
        // So far, we have imagined that nike has three different factories for shoes, bags and
        // t-shirts

        // now imagine that you are working as a manager of shoes factory of Nike
        // only the manager of shoes factory not other factories
        // and your kid wants you to get a pair of shoes for him or her.
        // so as a manager you will tell your factory to create shoes

        // this is called factory design pattern :
        // now think that you are a main function that is not creating objects / shoes
        // on your own, rather you told the factory class to create the objects / shoes

        // now after some days, you got a promotion and became a manager of managers
        // so you have three managers under you, three of them are managers of the three factories
        // and you are managing all three managers
        // let's say now your son wants a nike bag, so you as a manager will call the manager of nike bags factory
        // and that factory manager will call the factory to create objects for you.

        // it's nothing but factory calling factory to create objets

        Factory factory = AbstractFactory.createFactory("bmw");
        System.out.println(factory.factoryName());

        Vehicle v = factory.createVehicle(2);
        System.out.println(v.wheels());

        Vehicle v1 = factory.createVehicle(4);
        System.out.println(v1.wheels());
    }
}