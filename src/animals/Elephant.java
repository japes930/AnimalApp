package animals;

public class Elephant extends Animal {
    public Elephant(){
        System.out.println("Now I'm an elephant");
    }

    public String sleep(){
        return "An elephant sleeps...";
    }

    public String eat(){
        return "An elephant eats";
    }

    public String paint(){
        return "An elephant paints";
    }
}
