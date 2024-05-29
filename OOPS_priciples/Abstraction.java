import java.util.Scanner;
abstract class Animal {
    public abstract void sound();

    public void sleep(String name) {
        System.out.println(name + " is sleeping");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Bow-bow");
    }
}
class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
}
class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Call sound and sleep methods
        d.sound();
        d.sleep("Dog");
        c.sound();
        c.sleep("Cat");
    }
}
