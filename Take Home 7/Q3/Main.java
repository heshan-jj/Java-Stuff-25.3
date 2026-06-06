package Q3;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "Rex";
        dog.makeSound();

        Cat cat = new Cat();
        cat.name = "Luna";
        cat.makeSound();

        Bird bird = new Bird();
        bird.name = "Tweety";
        bird.makeSound();
    }
}
