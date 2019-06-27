package animals;

public class Dog extends Animal {

    public Dog() {
        System.out.println("Now I'm a dog");
    }
    @Override//What is this doing? / Why doesn't it work
    public String sleep(){
        return "A dog sleeps soundly";
    }

    public String eat(){
        return "A dog eats...";
    }

    public String bark() {
        return "A dog barks";
    }
}
