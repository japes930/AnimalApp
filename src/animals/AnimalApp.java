package animals;
//data is not encapsulated
// Override doesn't change output so what is inherited?
//The sleep & purr methods in each subclass are examples of polymorphism

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.bark());

        Elephant e = new Elephant();
        print(e.eat());
        print(e.sleep());
        print(e.paint());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}