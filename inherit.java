public class inherit {
    public static void main(String[] args) {
         Dog d =new Dog();
         d.eat();
         d.bark();
         d.breathe();
    }
}

// Example of the single level inheritance

class Animal {
    void breathe() {
        System.out.println("Breathing");
    }

    void eat() {
        System.out.println("eating");
    }

}


class Dog extends Animal{
    void bark(){
        System.out.println("the dog is barking");
    }
}